package in.appmaster.trader.exchange.impl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.appmaster.trader.equity.model.Ohlc;
import in.appmaster.trader.exchange.interfaces.NseOhlcExtractor;
import in.appmaster.trader.outbound.interfaces.OutboundReader;
import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.Util;

@Component("nseOhlcExtractorImpl")
public class NseOhlcExtractorImpl implements NseOhlcExtractor {

	@Autowired
	@Qualifier("jSoupOutboundReaderImpl")
	OutboundReader outboundReader;

	@Autowired
	@Qualifier("util")
	Util util;

	@Override
	public List<Ohlc> getNseOhlcData(HashMap<String, String> keyValuepair) {

		List<Ohlc> resp = new ArrayList<>();
		try {

			HashMap<String, String> NewkeyValuepair = new HashMap<String, String>(keyValuepair);
			NewkeyValuepair.put("$URL_NAME$", "NSE_OHLC_SYMBOL_FILTER_URL");

			Response respeqSecFetchPage = null;
			// hit the URL to get the cookie
			String eqSecFetchPageURL = util.getFormattedUrl(NewkeyValuepair);
			respeqSecFetchPage = Jsoup.connect(eqSecFetchPageURL).method(Method.GET).execute();
			// This will get you cookies
			Map<String, String> eqSecFetchPagecookies = respeqSecFetchPage.cookies();

			NewkeyValuepair.put("$URL_NAME$", "NSE_OHLC_SYMBOL_COUNT_URL"); // replace
																			// the
																			// URL
																			// to
																			// get
																			// another
																			// cookie

			String SymbolCountURL = util.getFormattedUrl(NewkeyValuepair);
			Response respSymbolCount = Jsoup.connect(SymbolCountURL).method(Method.GET).execute();

			// This will get you cookies
			Map<String, String> SymboleCountcookies = respSymbolCount.cookies();
			String symbolCount = respSymbolCount.body().trim();

			// final cookies to to get the Data from target URL
			Map<String, String> finalCookies = new HashMap<String, String>();
			finalCookies.putAll(SymboleCountcookies);
			finalCookies.putAll(eqSecFetchPagecookies);

			// prepare static header

			Map<String, String> header = prepareHeader();

			// now you have list of cookies , header required to hit the target
			// URL, use original KeyValue pair
			
			//TODO - build logic to fetch data in chunks
			LocalDate fromDt = Util.getLocalDate(keyValuepair.get(Constants.$FROM_DATE$),"dd-MM-yyyy");
			LocalDate toDt = Util.getLocalDate(keyValuepair.get(Constants.$TO_DATE$),"dd-MM-yyyy");
			long noOfDays = ChronoUnit.DAYS.between(fromDt, toDt);
			
			
			int maxDays = 120;// NSE supported 5 months, so taking safer side of 4 month duration 4*30 = 120 
			
			int iterations = (int) (noOfDays/maxDays) + ((noOfDays%maxDays) > 0 ? 1: 0); // iter + take care of remainder
			
			LocalDate startDate = fromDt;
			LocalDate endDate = fromDt.plusDays(maxDays);
			for (int i = 1 ;i<= iterations;i++) {
				
				endDate = (endDate.isBefore(toDt)? endDate:toDt ); //if startDate falls before toDt, then use startDate, else you have reached after toDate, so use toDate
				
				keyValuepair.put(Constants.$FROM_DATE$, startDate.format(Util.getDateTimeFormatter("dd-MM-yyyy")).toUpperCase());
				keyValuepair.put(Constants.$TO_DATE$, endDate.format(Util.getDateTimeFormatter("dd-MM-yyyy")).toUpperCase());
				keyValuepair.put(Constants.$SYMBOL_COUNT$, symbolCount);
				
			
				
				resp.addAll(prepareNseOhlcData( keyValuepair, finalCookies,header));
				startDate = endDate.plusDays(1); // start from next day of last end date
				endDate = endDate.plusDays(maxDays);
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resp;

	}


	private List<Ohlc> prepareNseOhlcData(Map<String, String> keyValuepair, Map<String, String> Cookies,
			Map<String, String> header) throws IOException {

		String url = util.getFormattedUrl(keyValuepair);
		
		Response finalres = Jsoup.connect(url).cookies(Cookies).headers(header).method(Method.GET).execute();
		

		String html = finalres.body().toString();
		

		Document doc = Jsoup.parse(html);

		List<Ohlc> lstOhlc = new ArrayList<Ohlc>();
		// extracting data from table
		for (Element table : doc.select("table")) {
			

			for (int tr = 1; tr <= table.select("tr").size() - 1; tr++) { // size-1
																			// =
																			// will
																			// point
																			// to
																			// last
																			// row
																			// of
																			// records

				Element row = table.select("tr").get(tr); // get the row

				Ohlc ohlc = new Ohlc(); // create new Obj to hold row

				Elements tds = row.select("td"); // get all columns

				ohlc.setSymbol(tds.get(0).text().trim()); // Symbol
				// ohlc.setDate(LocalDate.parse(tds.get(2).text().trim(),DateTimeFormatter.ofPattern("DD-MMM-YYYY")));
				// //Date
				
				ohlc.setSeries(tds.get(1).text().trim());
				ohlc.setDate(Util.getLocalDate(tds.get(2).text().trim(), "dd-MMM-yyyy")); // Date
				
				// set the Id- primary key
				
				ohlc.prepareId();

				ohlc.setPrevClose(Float.parseFloat(Util.makeItNumberConvertible(tds.get(3).text().trim())));
				ohlc.setOpenPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(4).text().trim())));

				ohlc.setHighPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(5).text().trim())));
				ohlc.setLowPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(6).text().trim())));
				ohlc.setLastPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(7).text().trim())));
				ohlc.setClosePrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(8).text().trim())));

				ohlc.setVWAP(Float.parseFloat(Util.makeItNumberConvertible(tds.get(9).text().trim())));

				ohlc.setTotalTradedQuantity(Integer.parseInt(Util.makeItNumberConvertible(tds.get(10).text().trim())));

				ohlc.setTurnover(Double.parseDouble(Util.makeItNumberConvertible(tds.get(11).text().trim())));

				ohlc.setNoOfTrades(Integer.parseInt(Util.makeItNumberConvertible(tds.get(12).text().trim())));
				ohlc.setDeliverableQty(Integer.parseInt(Util.makeItNumberConvertible(tds.get(13).text().trim())));
				ohlc.setFetchDateTime(LocalDateTime.now());

				lstOhlc.add(ohlc); // add row to arraylist

			} // row loop ends

		} // table loop ends
		return lstOhlc;

	}

	private Map<String, String> prepareHeader() {
		Map<String, String> header = new HashMap<String, String>();
		header.put("DNT", "1");
		header.put("Host", "www.nseindia.com");
		header.put("Referer", "https://www.nseindia.com/products/content/equities/equities/eq_security.htm");
		header.put("User-Agent",
				":Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36");
		header.put("X-Requested-With", "XMLHttpRequest");
		return header;
	}

	
}

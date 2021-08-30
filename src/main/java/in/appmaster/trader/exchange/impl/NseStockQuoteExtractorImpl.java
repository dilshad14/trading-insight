package in.appmaster.trader.exchange.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.appmaster.trader.equity.model.Quote;
import in.appmaster.trader.exchange.interfaces.NseStockQuoteExtractor;
import in.appmaster.trader.outbound.impl.JSoupOutboundReaderImpl;
import in.appmaster.trader.outbound.interfaces.OutboundReader;
import in.appmaster.trader.utils.Util;

@Component("nseStockQuoteExtractorImpl")
public class NseStockQuoteExtractorImpl implements NseStockQuoteExtractor {

	@Autowired
	@Qualifier("springRestOutboundReaderImpl")
	OutboundReader outbound;

	@Autowired
	@Qualifier("util")
	Util util;

	@Override
	public Quote getStockQuote(Map<String, String> keyValuepair) {

		// String url = util.getFormattedUrl(keyValuepair);
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol=SCHAEFFLER";
		HashMap<String, String> NewkeyValuepair = new HashMap<String, String>(keyValuepair);

		Response html = null;
		
		try {
			 url ="https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/ajaxGetQuoteJSON.jsp?symbol=SCHAEFFLER&series=EQ";
		RestTemplate r = new RestTemplate();
	
			System.out.println(r.getForObject(url, String.class));
			html = Jsoup.connect(url).method(Method.GET).execute();
			Map<String, String> ck = html.cookies();

			NewkeyValuepair.put("$URL_NAME$", "NSE_STOCK_QUOTE_URL"); // replace
			// the
			// URL
			// to
			// get
			// another
			// cookie

			//String qURL = util.getFormattedUrl(NewkeyValuepair);
			String qURL ="https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/ajaxGetQuoteJSON.jsp?symbol=SCHAEFFLER&series=EQ";
			String respJson = Jsoup.connect(qURL).cookies(ck).method(Method.GET).execute().body().toString();
			Map<String,String> respMap = Util.convertJsonStringToMap(respJson);
			Map<String,String> respMap1 = new HashMap<String,String>(respMap);
			
			for(Map.Entry<String, String> e: respMap1.entrySet()){
				System.out.println(e.getKey()+" : "+e.getValue());
				
				
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}

package in.appmaster.trader.exchange.impl;

import in.appmaster.trader.exchange.interfaces.NseOptionChainExtractor;
import in.appmaster.trader.option.model.OptionChain;
import in.appmaster.trader.option.model.OptionBase;

import in.appmaster.trader.option.model.OptionChainScreen;
import in.appmaster.trader.outbound.interfaces.OutboundReader;
import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.Util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;





@Component("nseOptionChainExtractorImpl")
public class NseOptionChainExtractorImpl implements NseOptionChainExtractor {
	
	@Autowired
	@Qualifier("jSoupOutboundReaderImpl")
	OutboundReader outboundReader;	
	
	@Autowired
	@Qualifier("util")
	Util util;

	@Override
	public OptionChainScreen getNseOptionChain(HashMap<String,String> keyValuepair) {
		
		String ScripSymbol = keyValuepair.get(Constants.$SCRIP_SYMBOL$);
		OptionChainScreen ocs = new OptionChainScreen();
		ocs.setUnderlyingIndex(ScripSymbol);
		String url  = util.getFormattedUrl(keyValuepair);
		
		String htmlSrc = null;
		try {
			ocs.setFetchDateTime(LocalDateTime.now());
			 htmlSrc = outboundReader.getDataFromURL(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = Jsoup.parse(htmlSrc);
		
		String asOnDtPattern = "span:containsOwn("+Constants.AS_ON_+")";
		 String  dtText= doc.select(asOnDtPattern).text();
		 ocs.setAsOnScreenDateTime(extractAsOnDateTime(dtText));
		 
		 String scripValuepattern = "b:containsOwn("+ScripSymbol+")";
		 String  scripValueText = doc.select(scripValuepattern).text();
		 ocs.setIndexValue(extractScripSpotValue(scripValueText,"NIFTY"));
		 
		 // OptionChainGrid ocg = new OptionChainGrid(); // create new Obj to hold row

			List<OptionChain> lstOptChan  = new ArrayList<OptionChain>(); // list of GridData
		 // ocg.setOptionChainId(lstOptChan);
		
		// extracting data from table
		for (Element table : doc.select(Constants.optionChainTableExpression)) {

			  for ( int  tr= 2; tr <= table.select("tr").size()-2 ;tr++) {  // size-2 = will point to last row of records
				  
				  Element row = table.select("tr").get(tr); // get the row
	
				  OptionChain oc = new OptionChain(); // create new Obj to hold row
				  oc.setOptionChainScreen(ocs); // associate the option chain with screenID
				  
			            Elements tds = row.select("td");  // get all columns

			           // index 1 - 10 are for CALLS
			            
			            OptionBase call = new OptionBase(Constants.CE);
			            call.setOI(Long.parseLong(Util.makeItNumberConvertible(tds.get(1).text()))) ;  // idx = 1 = OI
			            call.setChngInOI(Long.parseLong(Util.makeItNumberConvertible(tds.get(2).text()))) ;  // idx = 2 = change in OI
			            call.setVolume(Long.parseLong(Util.makeItNumberConvertible(tds.get(3).text()))) ;  // idx = 3 = volume
			            
			            call.setIv(Float.parseFloat(Util.makeItNumberConvertible(tds.get(4).text()))) ;  // idx = 4 = Iv
			            call.setLtp(Float.parseFloat(Util.makeItNumberConvertible(tds.get(5).text()))) ;  // idx = 5 = ltp
			            
			            call.setNetChange(Float.parseFloat(Util.makeItNumberConvertible(tds.get(6).text()))) ;  // idx = 6 = netcange
			            
			            call.setBidQty(Integer.parseInt(Util.makeItNumberConvertible(tds.get(7).text()))) ;  // idx = 7 = bid qty
			            call.setBidPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(8).text()))) ;  // idx = 8 = bid price
			            
			            call.setAskPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(9).text()))) ;  // idx = 9 = ask price
			            call.setAskQty(Integer.parseInt(Util.makeItNumberConvertible(tds.get(10).text()))) ;  // idx = 10 = ask qty
			            
			            oc.setCall(call); // add call data to Option chain
			             
			            oc.setStrikePrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(11).text()))) ;  // idx = 11 = Strike Price
			            
			            // ---------------------index 12 - 21 are for PUTS
			            
			            OptionBase put = new OptionBase(Constants.PE);
			            
			           // put.setStrikePrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(11).text()))) ;  // idx = 11 = Strike Price
			            
			            put.setBidQty(Integer.parseInt(Util.makeItNumberConvertible(tds.get(12).text()))) ;  // idx = 12 = bid qty
			            put.setBidPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(13).text()))) ;  // idx = 13 = bid price
			            
			            put.setAskPrice(Float.parseFloat(Util.makeItNumberConvertible(tds.get(14).text()))) ;  // idx = 14 = ask price
			            put.setAskQty(Integer.parseInt(Util.makeItNumberConvertible(tds.get(15).text()))) ;  // idx = 15 = ask qty
			            
			            put.setNetChange(Float.parseFloat(Util.makeItNumberConvertible(tds.get(16).text()))) ;  // idx = 16 = netcange
			            
			            put.setLtp(Float.parseFloat(Util.makeItNumberConvertible(tds.get(17).text()))) ;  // idx = 17 = ltp
			            put.setIv(Float.parseFloat(Util.makeItNumberConvertible(tds.get(18).text()))) ;  // idx = 18 = Iv
			            put.setVolume(Long.parseLong(Util.makeItNumberConvertible(tds.get(19).text()))) ;  // idx = 19 = volume
			            put.setChngInOI(Long.parseLong(Util.makeItNumberConvertible(tds.get(20).text()))) ;  // idx = 20 = change in OI
			            put.setOI(Long.parseLong(Util.makeItNumberConvertible(tds.get(21).text()))) ;  // idx = 21 = OI
			            oc.setPut(put); // add put to option chain
			            
			            
			            lstOptChan.add(oc); // add row to arraylist

			        } // row loop ends
			
	    } // table loop ends
		ocs.setLstOptionChain(lstOptChan);
		
		return ocs;
	}
	
	private LocalDateTime extractAsOnDateTime(String text){
		
		String NSE_OPTIONCHAIN_DATETIME_FORMAT=	"MMM dd, yyyy H:m:s z";
		//As on Feb 16, 2018 15:30:30 IST
		text = text.replace(Constants.AS_ON_, "");
		//System.out.println(LocalDateTime.parse(text,DateTimeFormatter.ofPattern("MMM dd, yyyy H:m:s z")));
		return LocalDateTime.parse(text,DateTimeFormatter.ofPattern(NSE_OPTIONCHAIN_DATETIME_FORMAT));
		
	}

	private  float extractScripSpotValue(String text, String scripSymbol){
		
		String textToRemove = scripSymbol+" ";
		//text = text.replace(textToRemove, "");
	
		
		return Float.parseFloat(text.replace(textToRemove, ""));
		
	}
	
}

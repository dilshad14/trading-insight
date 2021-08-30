package in.appmaster.trader;


import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class parser {
	
	public static void main(String args[]) throws IOException{
		String url = "https://www.nseindia.com/live_market/dynaContent/live_watch/option_chain/optionKeys.jsp?symbolCode=-10006&symbol=NIFTY&symbol=NIFTY&instrument=-&date=28MAR2018&segmentLink=17";
		
		Instant i = Instant.now();
		/*Document doc = Jsoup.connect(url).get();
		Elements options = doc.select("option[value]");
		
		for (Element e : options){
			System.out.println(e.ownText().toString());
			
		}
	*/
		
		 Document doc = Jsoup.connect("https://www.nseindia.com/live_market/dynaContent/live_watch/option_chain/optionKeys.jsp?segmentLink=17&instrument=OPTIDX&symbol=NIFTY&date=28MAR2018").get();
		//Document d = Jsoup.parse(html)
		 
		// System.out.println(doc.select("b:containsOwn(NIFTY)").text());
		 String  scripValueText = doc.select("b:containsOwn(NIFTY)").text();
		// System.out.println(extractScripValue(scripValueText,"NIFTY"));
		 
	
		 
		 String  dtText= doc.select("span:containsOwn(As on)").text(); 
		// System.out.println(dtText);
		 
		// System.out.println(extractDateTime(dtText));
		
		 //System.exit(1);
		 
		 int count = 0;
		    for (Element table : doc.select("table#octable")) {
		    	
		        for (Element row : table.select("tr")) {
		            Elements tds = row.select("td");
		        
		           for (Element td :tds) {
		        	   count +=1;
		                		                
		            }
		          
		           count =0;
		        }
		    }
		
		
	
			
		
	}
	
	public static LocalDateTime extractDateTime(String text){
		
		String NSE_OPTIONCHAIN_DATETIME_FORMAT=	"MMM dd, yyyy H:m:s z";
		//As on Feb 16, 2018 15:30:30 IST
		text = text.replace("As on ", "");
		//System.out.println(LocalDateTime.parse(text,DateTimeFormatter.ofPattern("MMM dd, yyyy H:m:s z")));
		return LocalDateTime.parse(text,DateTimeFormatter.ofPattern(NSE_OPTIONCHAIN_DATETIME_FORMAT));
		
	}
	
	public static float extractScripValue(String text, String scripSymbol){
		
		String textToRemove = scripSymbol+" ";
		//text = text.replace(textToRemove, "");
		
		
		return Float.parseFloat(text.replace(textToRemove, ""));
		
	}
	
public static String removeFromString(String text, String toRemove){
		
	//System.out.println("---"+Float.parseFloat("10,452.3"));
	text = text.replace(toRemove,"" );
		
		return text;
		
	}

}

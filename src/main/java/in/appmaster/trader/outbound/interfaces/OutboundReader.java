package in.appmaster.trader.outbound.interfaces;

import java.io.IOException;

import org.jsoup.Connection;


/**
 * @author dilshad.ahmad
 * 
 * This serves as interface to read data from outside world, from web site or through any structured webservice call
 *
 */
public interface OutboundReader {
	
	
	/**
	 * @param url	- URL to be called
	 * @return String object of returned response
	 */
	String getDataFromURL(String url) throws IOException; 

}

/**
 * 
 */
package in.appmaster.trader.outbound.impl;

import in.appmaster.trader.outbound.interfaces.OutboundReader;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

/**
 * @author dilshada
 *
 */

@Component("jSoupOutboundReaderImpl")
public class JSoupOutboundReaderImpl implements OutboundReader {

	/* (non-Javadoc)
	 * @see in.appmaster.outbound.interfaces.OutboundReader#getDataFromURL(java.lang.String, java.util.HashMap)
	 */
	@Override
	public String getDataFromURL(String url) throws IOException {

			Document htmlPageSrc = Jsoup.connect(url).get();
		
		return htmlPageSrc.toString();
	}

}

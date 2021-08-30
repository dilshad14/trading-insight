package in.appmaster.trader.exchange.interfaces;

import in.appmaster.trader.option.model.OptionChainScreen;

import java.util.HashMap;

/**
 * @author dilshad.ahmad
 *
 */


public interface NseOptionChainExtractor {
	

	/**
	 *  contract to extract details into object from web page source. 
	 * @param scripCode	-  scrip like NIFTY, NIFTYIT etc
	 * @param expiry	- expiry date in format visible on website like 22FEB2018  etc all can be provided as key val pair in ahshmap
	 * @return
	 */
	public OptionChainScreen getNseOptionChain(HashMap<String,String> keyValuepair);
	

}

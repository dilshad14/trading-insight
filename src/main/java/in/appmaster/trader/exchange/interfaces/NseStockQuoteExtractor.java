package in.appmaster.trader.exchange.interfaces;

import java.util.Map;

import in.appmaster.trader.equity.model.Quote;

public interface NseStockQuoteExtractor {
	
	/**
	 * @param keyValuepair takes in Map, conytaining URL name from properties file and paramters in case needs to be replaced in URL
	 * @return
	 */
	Quote getStockQuote(Map<String, String> keyValuepair);

}

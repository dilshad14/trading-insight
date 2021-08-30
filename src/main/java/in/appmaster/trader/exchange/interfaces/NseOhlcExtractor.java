package in.appmaster.trader.exchange.interfaces;

import java.util.HashMap;
import java.util.List;

import in.appmaster.trader.equity.model.Ohlc;

public interface NseOhlcExtractor {


	/** this sets the contract to fetch the OHLC data for given symbol
	 * @param keyValuepair
	 * @return
	 */
	public List<Ohlc> getNseOhlcData(HashMap<String,String> keyValuepair);
}

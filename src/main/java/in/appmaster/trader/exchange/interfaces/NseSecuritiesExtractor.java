package in.appmaster.trader.exchange.interfaces;

import java.util.List;

import in.appmaster.trader.equity.model.Security;

public interface NseSecuritiesExtractor {
	
	List<Security> getAllNseSecurities(String nseURL);

}

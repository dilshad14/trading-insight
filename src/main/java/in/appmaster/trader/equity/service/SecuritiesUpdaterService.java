package in.appmaster.trader.equity.service;

import java.util.List;

import javax.transaction.Transactional;

import in.appmaster.trader.equity.model.Security;



public interface SecuritiesUpdaterService {
	

	public List<Security> getNSESecurities();

}

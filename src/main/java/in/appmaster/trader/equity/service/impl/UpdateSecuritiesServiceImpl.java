package in.appmaster.trader.equity.service.impl;

import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.equity.repository.SecuritiesUpdaterRepository;
import in.appmaster.trader.equity.service.SecuritiesUpdaterService;
import in.appmaster.trader.exchange.interfaces.NseSecuritiesExtractor;

@Repository
public class UpdateSecuritiesServiceImpl implements SecuritiesUpdaterService {
	
	@Autowired
	NseSecuritiesExtractor nseSE;
	
	@Autowired
	SecuritiesUpdaterRepository repo;
	
/*	@Resource(name = "propertyFileReader")
	private Properties myProperties;*/
	
	@Transactional
	@Override
	public List<Security> getNSESecurities() {
		
		String url = "NSE_ALL_SECURITIES_URL";

		List<Security> lstSec = nseSE.getAllNseSecurities(url);
		repo.saveAll(lstSec);
		
		return  lstSec;

	}

}

package in.appmaster.trader.equity.service;

import java.util.List;

import in.appmaster.trader.equity.model.OhlcMatchingEqRequest;
import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.equity.model.securityWithPctChange;

public interface OhlcService {
	
	public void filterMatchingEq(OhlcMatchingEqRequest reqData, List<Security> lstAllEq, List<securityWithPctChange> lstMatchingEq);

}

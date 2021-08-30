/**
 * 
 */
package in.appmaster.trader.equity.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.appmaster.trader.equity.model.OhlcMatchingEqRequest;
import in.appmaster.trader.equity.model.OhlcMatchingEqResponse;
import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.equity.model.securityWithPctChange;
import in.appmaster.trader.equity.service.OhlcService;
import in.appmaster.trader.equity.service.SecuritiesUpdaterService;
import in.appmaster.trader.option.repository.OptionChainRepository;

/**
 * @author HOME
 *
 */

@RestController
public class EquityController extends BaseController {

	@Autowired
	OptionChainRepository rep;

	@Autowired
	SecuritiesUpdaterService nseS;

	@Autowired
	OhlcService ohlcService;

	@RequestMapping(value = "/equitycontrollerHello", method = RequestMethod.GET)
	public String helloWorld() throws Exception {

		String hello = "equitycontrollerHello" + "is running...!!!";
		return hello;
	}

	@RequestMapping(value = "/listAllEq", method = RequestMethod.GET)
	public List<Security> getAllSec() {

		return nseS.getNSESecurities();
	}

	@RequestMapping(value = "/getReqJSON", method = RequestMethod.GET)
	public OhlcMatchingEqRequest getReJSON() {
		OhlcMatchingEqRequest r = new OhlcMatchingEqRequest();
		r.setDeltaPct(3.43f);
		r.setStartDate(LocalDate.now());
		r.setEndDate(LocalDate.now());
		r.setPeriodCode("W");
		r.setPriceRangeStart(300.14f);
		r.setPriceRangeStart(340.14f);

		List<String> lstScripCode = new ArrayList<String>();
		lstScripCode.add("TECHM");
		lstScripCode.add("INFY");
		lstScripCode.add("TCS");
		r.setLstScripCode(lstScripCode);

		return r;
	}

	@RequestMapping(value = "/getMatchingEq", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OhlcMatchingEqResponse getMatchingEq(@RequestBody OhlcMatchingEqRequest reqData) {
		LocalTime processStartTime = LocalTime.now();

		System.out.println("Processing Started:::::");

		OhlcMatchingEqResponse resp = new OhlcMatchingEqResponse();
		List<securityWithPctChange> lstMatchingSecurities = Collections
				.synchronizedList(new ArrayList<securityWithPctChange>());

		List<Security> lstSecurities = new ArrayList<Security>();

		// check if ScripCode is supplied
		if (reqData.getLstScripCode() != null && !reqData.getLstScripCode().isEmpty()) {
			for (String each : reqData.getLstScripCode()) {
				Security or = new Security();
				or.setSymbol(each);
				or.setSeries("EQ");
				lstSecurities.add(or);
			}
		} else {
			// scrip code is not supplied hence run run for all NSE scrips
			lstSecurities = nseS.getNSESecurities();
		}
		
		// TODO REMOVE IT
		/*if (lstSecurities.size() > 35) {
			lstSecurities = lstSecurities.subList(0, 300);
		}*/

		int secCount = lstSecurities.size();
		resp.setTotalEqScripCount(secCount);

		// allSec.parallelStream().filter(p->p.getSeries().equals("EQ"));
		// allSec.stream().filter(p->p.getSymbol().equals("ORIENTLTD"));

		// l.add("TotalProcessed=" + secCount);
		//lstSecurities.forEach(System.out::println);
		System.out.println("secCount : " + secCount);
		// int threadCount = 20;
		// CountDownLatch cdl = new CountDownLatch(threadCount);

		// ExecutorService es = Executors.newFixedThreadPool(threadCount);
		// Set<Callable<List>> callables = new HashSet<Callable<List>>();

		ohlcService.filterMatchingEq(reqData, lstSecurities, lstMatchingSecurities);
		if (reqData.getDeltaPct() != null) {
			resp.setMatchingEqScripCount(lstMatchingSecurities.size());
		}

		resp.setSecuritiesWithPctChange(lstMatchingSecurities);
		resp.setResponseTime(Duration.between(processStartTime, LocalTime.now()));

		return resp;
	}

}

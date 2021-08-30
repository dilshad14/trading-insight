package in.appmaster.trader.equity.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import in.appmaster.trader.equity.model.Ohlc;
import in.appmaster.trader.equity.model.OhlcMatchingEqRequest;
import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.equity.model.securityWithPctChange;
import in.appmaster.trader.exchange.interfaces.NseOhlcExtractor;
import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.Util;

public class OhlcProcessorRunnable implements Runnable {

	NseOhlcExtractor nseE;

	private OhlcMatchingEqRequest req;
	private List<Security> lstSec;
	List<securityWithPctChange> lstMatchEq;
	CountDownLatch countDownLatch;

	public OhlcProcessorRunnable(OhlcMatchingEqRequest reqData, List<Security> lstAllEq,
			List<securityWithPctChange> lstMatchingEq,CountDownLatch cdl,NseOhlcExtractor nseE) {
		req = reqData;
		lstSec = lstAllEq;
		lstMatchEq = lstMatchingEq;
		countDownLatch = cdl;
		this.nseE= nseE;
	}

	@Override
	public void run() {
try{
		process(req, lstSec, lstMatchEq);
}finally{ //decrease the counter even if process failed
		countDownLatch.countDown(); // proces done , decrease the counter
}

	}

	private void process(OhlcMatchingEqRequest reqData, List<Security> lstAllEq,
			List<securityWithPctChange> lstMatchingEq) {

		for (Security each : lstAllEq) {
			//System.out.println(Thread.currentThread().getName() + " : " + each.getSymbol());
			try {
				// each.setSymbol(each.getSymbol().replaceAll("&",
				// Constants.URL_ENCODED_AMPERSAND));

				// String s = isMonInve(each.getSymbol(),LocalDate.of(2018, 06,
				// 16),LocalDate.now());
				securityWithPctChange s = getMatchingEqData(each.getSymbol(), reqData);
				if (s != null) {
					// System.out.println(cntr.getAndIncrement() + " : " +
					// each.getSymbol() + " : GOOD");
					lstMatchingEq.add(s);

				}
			} catch (Exception e) {
				System.out.println(each.getSymbol() + " : EXCEPTION");
			}
			// System.out.println("");

		}
	}

	private securityWithPctChange getMatchingEqData(String scrip, OhlcMatchingEqRequest reqData) {
		securityWithPctChange swpc = new securityWithPctChange();
		swpc.setSymbol(scrip);

		String finalresp = "";
		// LocalTime end = LocalTime.of(15, 30, 30);
		// while(LocalTime.now().isBefore(end)) {

		// NseOptionChainExtractor nse = (NseOptionChainExtractor)
		// ctx.getBean("nseOptionChainExtractorImpl");
		HashMap<String, String> keyValuepair = new HashMap<>();
		keyValuepair.put("$URL_NAME$", "NSE_OHLC_URL");
		// keyValuepair.put("$SCRIP_SYMBOL$", "LUPIN");
		keyValuepair.put("$SCRIP_SYMBOL$", scrip);

		// keyValuepair.put("$FROM_DATE$", "01-04-2017");
		keyValuepair.put("$FROM_DATE$", Util.getFormattedLocalDate(reqData.getStartDate(), "dd-MM-yyyy"));
		// keyValuepair.put("$TO_DATE$", "04-04-2018");
		keyValuepair.put("$TO_DATE$", Util.getFormattedLocalDate(reqData.getEndDate(), "dd-MM-yyyy"));

		try {
			
			if(nseE == null){
				System.out.println("#########################");
			}

			List<Ohlc> resp = nseE.getNseOhlcData(keyValuepair);
			if (resp !=null && resp.size() == 0) {
				System.out.println("Error: " + keyValuepair.get("$SCRIP_SYMBOL$"));
				return null;
			}
			float lastClosePrice = resp.get(resp.size() - 1).getClosePrice();
			swpc.setPrice(lastClosePrice);
			Map<String, List<Ohlc>> grpResult;

			if (reqData.getPeriodCode() != null && reqData.getPeriodCode().equalsIgnoreCase(Constants.MONTH)) {

				grpResult = resp.parallelStream().collect(Collectors.groupingBy(Ohlc::getMonthYear));

			} else {

				grpResult = resp.parallelStream().collect(Collectors.groupingBy(Ohlc::getWeekOfMonthYear));
			}

			Map<String, Float> periodHm = new TreeMap<String, Float>();

			float totalChange = 0.0f;
			int grpCountGood = 0;

			for (Map.Entry<String, List<Ohlc>> e : grpResult.entrySet()) {
				String Period = e.getKey();
				List<Ohlc> lst = e.getValue();
				int size = lst.size();
				float perctInc = 0.0f;
				if (size > 1) {
					perctInc = ((lst.get(size - 1).getLastPrice()) - (lst.get(0).getLastPrice())) * 100
							/ (lst.get(0).getLastPrice());
				}

				if (reqData.getDeltaPct() != null && perctInc >= reqData.getDeltaPct()) {
					// if allgroup count satisfy this delta condition then
					// count++
					grpCountGood++;
				}
				totalChange += perctInc;
				periodHm.put(Period, perctInc);
			//	System.out.println(Period + " : " + perctInc);

			}

			if ((reqData.getDeltaPct() != null) && grpCountGood != grpResult.size()) {
				// if both count does not match , it means any of the Period
				// percentage delta doesnt meet the deltChange condiiton from
				// request
				// retrun immediately
				return null;
			}

			// calc avg change in given period

			Float avgChange = (Float) Util.roundTwoDecimalPlace((totalChange / ((float) grpResult.size())));
			swpc.setAvgPctChange(avgChange);

			swpc.setPeriodicChangePct(periodHm);

			// long noOfDay =
			// Util.countDayOccurenceBetweenDate(DayOfWeek.MONDAY, startDate,
			// endDate);
			/*
			 * long noOfDay = (long) resp.size();
			 * 
			 * long succDays = resp.parallelStream().filter(p->{ if ( //
			 * p.getDate().getDayOfWeek().getDisplayName(TextStyle.FULL,
			 * Locale.ENGLISH).equalsIgnoreCase("MONDAY") && //p.getOpenPrice()
			 * > p.getPrevClose()+3 && (lastClosePrice < 700.00 &&
			 * lastClosePrice > 100.00) && p.getOpenPrice()+3.00
			 * <p.getHighPrice() && p.getLowPrice()+2 > p.getClosePrice()
			 * 
			 * 
			 * ){ return true; }else { return false; }
			 * 
			 * }).count();
			 */

			/*
			 * float firstClosePrice = resp.get(0).getClosePrice(); float prct =
			 * (float) ((lastClosePrice-firstClosePrice)*100.00 /
			 * firstClosePrice);
			 * 
			 * if ( ( lastClosePrice > 300 && lastClosePrice < 500.00) && prct >
			 * 10.00 ){ return scrip +"("+prct+"% - "+lastClosePrice+")"; }
			 */

			/*
			 * if (noOfDay == succDays) { return scrip; }
			 */
			// Thread.sleep(90000);
			// Thread.sleep(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// }

		// return "SUCCESS";//lst1;
		return swpc;// lst1;
	}

}

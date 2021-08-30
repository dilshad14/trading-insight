package in.appmaster.trader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.appmaster.trader.equity.model.Ohlc;
import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.equity.service.SecuritiesUpdaterService;
import in.appmaster.trader.exchange.interfaces.NseOhlcExtractor;
import in.appmaster.trader.exchange.interfaces.NseOptionChainExtractor;
import in.appmaster.trader.option.repository.OptionChainRepository;
import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.CryptoUtils;
import in.appmaster.trader.utils.Util;




@SpringBootApplication
@RestController
public class TraderApplication {

	@Autowired
	NseOhlcExtractor nseE;

	public static void main(String[] args) {
		SpringApplication.run(TraderApplication.class, args);		

	}

	@RequestMapping("/ohlc")
		//public List<OHLC> run(String scrip,LocalDate startDate,LocalDate endDate) {
	public List<Ohlc> run() {
		
		String scrip ="COX&KINGS";
		LocalDate startDate = LocalDate.of(2018, 01, 01);
		LocalDate endDate = LocalDate.now();
	
		String finalresp = "";
		LocalTime end = LocalTime.now();
		//while(LocalTime.now().isBefore(end)) {
			
		
		
			// NseOptionChainExtractor nse = (NseOptionChainExtractor)
			// ctx.getBean("nseOptionChainExtractorImpl");
			HashMap<String, String> keyValuepair = new HashMap<>();
			keyValuepair.put("$URL_NAME$", "NSE_OHLC_URL");
			//keyValuepair.put("$SCRIP_SYMBOL$", "LUPIN");
			keyValuepair.put("$SCRIP_SYMBOL$", scrip);
			
			keyValuepair.put("$FROM_DATE$", "01-01-2018");
			//keyValuepair.put("$FROM_DATE$", Util.getFormattedLocalDate(startDate, "dd-mm-yyyy"));
			keyValuepair.put("$TO_DATE$", "18-04-2018");
			//keyValuepair.put("$TO_DATE$",  Util.getFormattedLocalDate(endDate, "dd-mm-yyyy"));
			
			Instant start = Instant.now();
			List<Ohlc> resp =  nseE.getNseOhlcData(keyValuepair);
			
			long noOfDay  = Util.countDayOccurenceBetweenDate(DayOfWeek.MONDAY, startDate, endDate);
			
			long succDays  = resp.parallelStream().filter(p->{				
				if (p.getDate().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).equalsIgnoreCase("MONDAY")
				&& p.getOpenPrice() > p.getPrevClose()){
					return true;
				}else {
					return false;
				}
				
			}).count();
			if (noOfDay == succDays) {
				System.out.println(scrip);
			}
			
			
			/*
			OptionChainScreen ocs = nse.getNseOptionChain(keyValuepair);
			System.out.println("2");
			OptionChainScreen ocs =new 			OptionChainScreen ();
			
			ocs.setAsOnScreenDateTime(LocalDateTime.now().minusMinutes(30));
			ocs.setIndexValue(10764.23f);
			ocs.setSymbol("NIFTY");
			List<OptionChain> lst = new ArrayList<OptionChain>();
			
			OptionChain oc = new OptionChain();
			oc.setStrikePrice(7007.77f);
			OptionBase ob = new OptionBase(Constants.CE);
			ob.setAskPrice(123.43f);
			ob.setAskQty(3432);
			ob.setBidPrice(43.54f);
			ob.setBidQty(654);
			ob.setChngInOI(8765422466L);
			ob.setIv(76.76f);
			ob.setLtp(654f);
			ob.setNetChange(2.3f);
			ob.setOI(876234567L);
			ob.setOptionType("CE");
			ob.setVolume(876545685L);								
			oc.setCall(ob);
			System.out.println("3");
			OptionBase ob1 = new OptionBase(Constants.PE);
			ob1.setAskPrice(122423.43f);
			ob1.setAskQty(3442432);
			ob1.setBidPrice(443.54f);
			ob1.setBidQty(4654);
			ob1.setChngInOI(824222466L);
			ob1.setIv(76.76f);
			ob1.setLtp(654f);
			ob1.setNetChange(2.3f);
			ob1.setOI(876234567L);
			ob1.setOptionType("PE");
			ob1.setVolume(8760005685L);
			oc.setPut(ob1);
			oc.setOptionChainScreen(ocs);
			System.out.println("4");
			lst.add(oc);
			ocs.setLstOptionChain(lst);
			//System.out.println("5");
			//System.out.println(ocs.toString());			
			//System.out.println("6");
			rep.save(ocs);
			System.out.println("7");*/
			
			//List<OptionChainScreen> lst1 = new ArrayList<OptionChainScreen>();
			//Iterable<OptionChainScreen> itr = rep.findAll();
			//new Arraylist<Order>{}
			//Iterable<OptionChainScreen> itr = rep.findAll(new Sort(new Order [] {"fetchDate"}));
			/*System.out.println("outside ");
			for (OptionChainScreen each : itr) {
				//lst1.add(each);
				System.out.println(each.toString());
				System.out.println(finalresp = each.toString());
				break;
				
			}*/
			try {
				//Thread.sleep(90000);
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
		
		
			//return "SUCCESS";//lst1;
			return resp;//lst1;
		}
	
	@RequestMapping("/")
	public Map<String,String> hello(HttpServletRequest req) {
		Map<String,String> map = new LinkedHashMap<>();
		map.put("Message", "Hello from  Trader App...!!!");
		map.put("RemoteAddress", req.getRemoteAddr());
		map.put("RemoteHost", req.getRemoteHost());
		//map.put("RemoteHost", req.getRemoteHost());
		map.put("AuthType", req.getAuthType());
		map.put("ServerName", req.getServerName());
		map.put("DIGEST_AUTH", req.DIGEST_AUTH);
		
		return map;
	}
	

	







}
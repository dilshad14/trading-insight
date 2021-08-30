package in.appmaster.trader.utils;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component("util")
public class Util {

	private static final Logger logger = LoggerFactory.getLogger(Util.class);
	private static Constants constant;

	@Resource(name = "propertyFileReader")
	private Properties myProperties;

	@Cacheable("FormattedUrlByMap")
	public String getFormattedUrl(Map<String, String> keyValuepair) {

		String nameOfUrl = keyValuepair.get(constant.$URL_NAME$);
		String url = (myProperties.getProperty(nameOfUrl));

		for (Map.Entry<String, String> entry : keyValuepair.entrySet()) {
			url = url.replace(entry.getKey(), entry.getValue());
		}

		logger.debug("URL -" + url);
		return url;

	}

	@Cacheable("FormattedUrlByName")
	public String getFormattedUrl(String urlName) {

		String url = (myProperties.getProperty(urlName));

		return url;

	}

	public static LocalDateTime extractDateTimefromNSEOptionChainScreen(String text) {

		// As on Feb 16, 2018 15:30:30 IST =
		// Constants.NSE_OPTIONCHAIN_DATETIME_FORMAT
		text = text.replace(Constants.AS_ON_, Constants.BLANK);

		LocalDateTime dtm = LocalDateTime.parse(text,
				DateTimeFormatter.ofPattern(Constants.NSE_OPTIONCHAIN_DATETIME_FORMAT));
		logger.debug("DateTime -" + dtm);
		return dtm;

	}

	public static float extractScripValue(String text, String scripSymbol) {

		String textToRemove = scripSymbol + " ";
		// text = text.replace(textToRemove, "");
		float indexValue = Float.parseFloat(text.replace(textToRemove, Constants.BLANK));
		logger.debug("indexValue -" + indexValue);
		return indexValue;

	}

	public static String removeFromString(String text, String toRemove) {

		text = text.replace(toRemove, Constants.BLANK);
		return text;

	}

	public static String makeItNumberConvertible(String text) {

		text = (text == null || text.trim().equals("") || text.trim().equals("-") ? "0" : text.trim());
		text = text.replace(",", Constants.BLANK);

		return text;

	}

	public static LocalDate getLocalDate(String value, String pattern) {
		return LocalDate.parse(value, getDateTimeFormatter(pattern));

	}

	public static DateTimeFormatter getDateTimeFormatter(String pattern) {
		DateTimeFormatter inputFormatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(pattern)
				.toFormatter(Locale.ENGLISH);
		return inputFormatter;

	}

	public static String getFormattedLocalDate(LocalDate ld, String pattern) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(pattern);
		return ld.format(inputFormatter);

	}

	/*
	 * public static int countDayOccurenceInMonth(DayOfWeek dow, YearMonth
	 * month) { //LocalDate start =
	 * month.atDay(1).with(TemporalAdjusters.nextOrSame(dow)); LocalDate start =
	 * LocalDate.of(2018, 3, 20).with(TemporalAdjusters.nextOrSame(dow)); return
	 * (int) ChronoUnit.WEEKS.between(start, LocalDate.now()) + 1; }
	 */

	public static int countDayOccurenceBetweenDate(DayOfWeek dow, LocalDate startDt, LocalDate endDt) {
		// LocalDate start =
		// month.atDay(1).with(TemporalAdjusters.nextOrSame(dow));
		// LocalDate start =
		// LocalDate.of(startDt).with(TemporalAdjusters.nextOrSame(dow));
		startDt = startDt.with(TemporalAdjusters.nextOrSame(dow));
		return (int) ChronoUnit.WEEKS.between(startDt, endDt) + 1;
	}

	public static Map<String, String> convertJsonStringToMap(String json) {

		Map<String, String> map = new HashMap<String, String>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			// convert JSON string to Map
			map = mapper.readValue(json, new TypeReference<Map<String, String>>() {
			});

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static Number roundTwoDecimalPlace(Number arg) {
		Number result = null;
		DecimalFormat format = new DecimalFormat("##.00");
		if (arg instanceof Float) {
			result = Float.valueOf(format.format(arg));
		} else if (arg instanceof Double) {
			result = Double.valueOf(format.format(arg));
		}

		return result;
	}

	public int getOhlcThreadNumber(int noOfohlcSecurities) {
		int threadSize = 1;
		int secPerThread = Integer.parseInt((myProperties.getProperty("OHLC_SECURITY_EXEC_PER_THREAD")));

		threadSize = (noOfohlcSecurities / secPerThread) + ((noOfohlcSecurities % secPerThread == 0) ? 0 : 1);

		return threadSize;

	}

	public static List<List> getSublists(int noOfSublist, List lstAllEq) {
		
		List<List> result = new ArrayList<List>();

		int mainListSize = lstAllEq.size();
		int eachlstSize = mainListSize / noOfSublist + (mainListSize % noOfSublist == 0 ? 0 : 1);

		System.out.println("mainListSize=" + mainListSize + "--" + "eachlstSize=" + eachlstSize + "--" + "noOfSublist="
				+ noOfSublist

		);

		int start = 0;
		int end = 0;
		int offset = 0;
		for (int i = 0; i < noOfSublist; i++) {
			end = end + eachlstSize - 1 + offset;
			if (end > mainListSize - 1) {
				end = mainListSize;
			}
			

			List lstSec = lstAllEq.subList(start, end);
			
			
			start = end + 1;
			// add sublst to main list
			result.add(lstSec);
			
			// chnage the start index number
			if (start > mainListSize - 1) {
				break;
			}

			offset = 1;
		}

		System.out.println("noOfSublist="+noOfSublist);
		System.out.println("holding list size=="+result.size());
		return result;

	}
}

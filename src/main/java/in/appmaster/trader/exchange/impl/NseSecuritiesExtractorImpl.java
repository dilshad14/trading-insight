package in.appmaster.trader.exchange.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.appmaster.trader.equity.model.Security;
import in.appmaster.trader.exchange.interfaces.NseSecuritiesExtractor;
import in.appmaster.trader.outbound.interfaces.OutboundReader;
import in.appmaster.trader.utils.Constants;
import in.appmaster.trader.utils.Util;

@Component("nseSecuritiesExtractorImpl")
public class NseSecuritiesExtractorImpl implements NseSecuritiesExtractor {

	@Autowired
	@Qualifier("springRestOutboundReaderImpl")
	OutboundReader outbound;
	
	@Autowired
	@Qualifier("util")
	Util util;
	
	
	@Override
	public List<Security> getAllNseSecurities(String nseURL) {
		
		nseURL = util.getFormattedUrl(nseURL);
		
		List<Security> lstSecurities = new ArrayList<>();
		
		try {
			String resp = outbound.getDataFromURL(nseURL);
			
		
			
			String [] arrSec = resp.split("\n");
			for(int i=1 ;i<arrSec.length ; i++) { // ignore first line as its column name
				Security s = new Security();
				String [] fields = arrSec[i].split(",");
				s.setSymbol(StringUtils.trimToEmpty(fields[0]));
				s.setNameOfCompany(StringUtils.trimToEmpty(fields[1]));
				s.setSeries(StringUtils.trimToEmpty(fields[2]));
				
				try {
					//StringBuilder excpetionAt = new StringBuilder();
					//excpetionAt.append("setDateOfListing");
				s.setDateOfListing(Util.getLocalDate(StringUtils.trimToEmpty(fields[3]), Constants.NSE_EQ_OHLC_DATE_FORMAT));
				s.setPaidUpValue(Float.parseFloat(StringUtils.trimToEmpty(fields[4])));
				s.setMarketLot(Integer.parseInt(StringUtils.trimToEmpty(fields[5])));
				s.setFaceValue(Integer.parseInt(StringUtils.trimToEmpty(fields[7])));		
				//excpetionAt.no("setDateOfListing");			
				}catch(Exception e) {
				
					e.printStackTrace();
					System.exit(0);
				}
				s.setIsinNumber(StringUtils.trimToEmpty(fields[6]));
				// add each security to list
				lstSecurities.add(s);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return lstSecurities;
	}

}

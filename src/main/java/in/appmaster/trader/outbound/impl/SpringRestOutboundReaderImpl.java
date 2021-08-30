package in.appmaster.trader.outbound.impl;

import in.appmaster.trader.outbound.interfaces.OutboundReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author dilshad.ahmad
 * 
 * This serves as interface Impl to read data from outside world, from web site or through any structured webservice call
 *
 */


@Component("springRestOutboundReaderImpl")
public class SpringRestOutboundReaderImpl implements OutboundReader {
	
	@Autowired
	RestTemplate restTemplate;

	public String getDataFromURL(String url) {
		
		if (restTemplate == null){
			
		}
		String result = restTemplate.getForObject(url, String.class);
		//String result = restTemplate.
		
		return result;
	}


	
}

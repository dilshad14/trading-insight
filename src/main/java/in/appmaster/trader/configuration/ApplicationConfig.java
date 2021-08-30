package in.appmaster.trader.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationConfig {
	
	/*@Autowired
	private MessageSource messageSource;*/
	
	@Value("${customapppath}")
	String customappPath;
	
	@Bean("propertyFileReader")
	public PropertiesFactoryBean propertyFileReader(){	
		
		PropertiesFactoryBean b = new PropertiesFactoryBean();
		b.setLocation(new FileSystemResource(customappPath));
		return b;
	}
	
	@Bean("restTemplate")
	public RestTemplate restTemplate(){		
		RestTemplateBuilder stb = new RestTemplateBuilder();
		return stb.build();
	}

}

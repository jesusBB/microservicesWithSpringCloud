package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication 
//this anotation is a combination of @Configuration,@ComponentScan and @EnableAutoConfiguration)
public class MicroservicesBootApplication extends SpringBootServletInitializer{

	/*
	 * Used this method as a JAR
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/*
	 * Used this method as a WAR
	 */
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}
	
	
}

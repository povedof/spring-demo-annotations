package com.povedof.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.povedof.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// add support to resolve ${...} properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer ropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
}

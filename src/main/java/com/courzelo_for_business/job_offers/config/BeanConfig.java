package com.courzelo_for_business.job_offers.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	

}

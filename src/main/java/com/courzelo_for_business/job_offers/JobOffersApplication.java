package com.courzelo_for_business.job_offers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JobOffersApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobOffersApplication.class, args);
	}

}

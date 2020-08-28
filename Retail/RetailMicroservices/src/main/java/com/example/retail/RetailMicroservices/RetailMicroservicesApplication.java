package com.example.retail.RetailMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RetailMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailMicroservicesApplication.class, args);
	}

}

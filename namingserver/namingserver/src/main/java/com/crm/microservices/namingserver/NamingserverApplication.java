package com.crm.microservices.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingserverApplication.class, args);
	}

}

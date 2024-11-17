package com.codedecode.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		System.out.println("within EUREKA SERVICE");
		System.out.println("within EUREKA SERVICE1");
		System.out.println("within EUREKA SERVICE2");
		System.out.println("within EUREKA SERVICE3");
		System.out.println("within EUREKA SERVICE4");
		System.out.println("within EUREKA SERVICE5");


	}


}

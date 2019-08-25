package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication  
@EnableDiscoveryClient
public class EurekaServiceDemoApplication {
	
	@Value("${service.instance.name}")
	private String instance;

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDemoApplication.class, args);
		System.out.println("Eureka Service Demo Application started.............................");
	}
	
	@RequestMapping("/")
	public String message() {
		return "Hello form " + instance;
	}

}


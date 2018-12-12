package com.capgemini.interview_hub.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllocationApplication.class, args);
	}
}

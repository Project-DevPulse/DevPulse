package com.project.moduleservicedatacollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ModuleServiceDatacollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleServiceDatacollectionApplication.class, args);
	}

}

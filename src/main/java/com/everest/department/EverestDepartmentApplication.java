package com.everest.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EverestDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverestDepartmentApplication.class, args);
	}

}

package com.pacewisdom;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class EmployeeCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
		BasicConfigurator.configure();
	}

}

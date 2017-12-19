package com.egiants.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.egiants.controller","com.egiants.service"})
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}
}

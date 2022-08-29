package com.sreenutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@FeignClient
public class CitiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiConfigServerApplication.class, args);
	}

}

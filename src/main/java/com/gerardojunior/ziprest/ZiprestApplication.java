package com.gerardojunior.ziprest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ZiprestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiprestApplication.class, args);
	}

}

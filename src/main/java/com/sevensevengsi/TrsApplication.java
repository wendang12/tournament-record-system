package com.sevensevengsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sevensevengsi.repository")
@EntityScan("com.sevensevengsi.model")
public class TrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrsApplication.class, args);
	}

}

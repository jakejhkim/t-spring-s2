package com.wirebarley.sample.s2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
public class SpringS2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringS2Application.class, args);
	}
}

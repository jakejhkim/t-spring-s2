package com.wirebarley.sample.s2;

import com.wirebarley.sample.s2.configuration.ThymeleafConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = ThymeleafConfiguration.class)
public class SpringS2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringS2Application.class, args);
	}
}

package com.produtos.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.produtos.apirest.models")
@ComponentScan(basePackages = {"com.produtos.apirest.*"})
@EnableJpaRepositories(basePackages = {"com.produtos.apirest.repository"})
@EnableTransactionManagement
@EnableAutoConfiguration
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

}

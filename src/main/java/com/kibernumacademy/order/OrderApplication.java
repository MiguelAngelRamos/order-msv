package com.kibernumacademy.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// @EnableEurekaClients ya no es necesario en la ultima version de spring boot
@EnableFeignClients // para comunicarnos con otro microservicio
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}

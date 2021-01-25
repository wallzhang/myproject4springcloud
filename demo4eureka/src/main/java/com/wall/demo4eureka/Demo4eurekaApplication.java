package com.wall.demo4eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demo4eurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4eurekaApplication.class, args);
	}

}

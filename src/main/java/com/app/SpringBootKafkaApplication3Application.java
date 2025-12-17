package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaApplication3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication3Application.class, args);
		System.out.println("From main method in SpringBootKafkaApplication3Application class.");
	}

}

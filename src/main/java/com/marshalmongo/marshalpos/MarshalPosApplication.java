package com.marshalmongo.marshalpos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MarshalPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarshalPosApplication.class, args);
	}

}

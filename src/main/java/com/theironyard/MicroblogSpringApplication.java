package com.theironyard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class MicroblogSpringApplication {
	static final HashMap<String, User> userMap = new HashMap<String, User>();


	public static void main(String[] args) {
		SpringApplication.run(MicroblogSpringApplication.class, args);
		userMap.put("Bob", new User("Bob"));
	}
}

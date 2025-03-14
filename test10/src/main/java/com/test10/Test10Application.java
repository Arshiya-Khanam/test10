package com.test10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test10Application {

	public static void main(String[] args) {
                String name="mike";
		int x=100;
		int y=200;
		double z=10.3;
                boolean isPresent=false;
		float m=10.3f;
                SpringApplication.run(Test10Application.class, args);
	}

}

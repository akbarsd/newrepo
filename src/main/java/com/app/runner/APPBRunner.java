package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Order(10)
public class APPBRunner implements CommandLineRunner{

	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER-B");
	}

}

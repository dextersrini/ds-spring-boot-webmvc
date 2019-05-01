package com.ds.luckynumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Runner {
	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(Runner.class, args);
		System.out.println(appCtx.getApplicationName()); // You can use this appCtx object to analyse the context loaded
															// by this spring boot application
	}
}

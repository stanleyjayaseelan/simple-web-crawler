package com.stanley.project.simplewebcrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.stanley.project.simplewebcrawler.controllers" })
public class SimpleWebCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebCrawlerApplication.class, args);
	}

}

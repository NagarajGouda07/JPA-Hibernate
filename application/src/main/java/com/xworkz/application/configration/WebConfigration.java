package com.xworkz.application.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.xworkz.application")
@EnableWebMvc
@Configuration
public class WebConfigration {

	public WebConfigration() {
		System.out.println("This is a WebConfigration const...");
	}

}

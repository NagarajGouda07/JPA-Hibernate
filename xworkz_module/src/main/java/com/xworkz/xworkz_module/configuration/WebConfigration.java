package com.xworkz.xworkz_module.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.xworkz_module")
public class WebConfigration {
    WebConfigration(){
        System.out.println("This a WebConfigration Class..");
    }
}

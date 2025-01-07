package com.xworkz.onlinebooking.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.onlinebooking")
@EnableWebMvc
public class OnlineBookConfigration {

    OnlineBookConfigration(){
        System.out.println("This running OnlineBookConfigration const..");
    }

}

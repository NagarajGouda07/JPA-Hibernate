package com.xworkz.xworkz_admin_details.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.xworkz.xworkz_admin_details")
@Configuration
public class XworkzConfigration {

    XworkzConfigration(){
        System.out.println("This is XworkzConfigration const..");
    }


}

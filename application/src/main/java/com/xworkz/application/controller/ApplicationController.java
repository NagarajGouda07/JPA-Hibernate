package com.xworkz.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImpl;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    public ApplicationController() {
        System.out.println("This is the ApplicationController constructor...");
    }

//    @GetMapping
//    public String showForm() {
//        System.out.println("This is the GET method to load the form...");
//        return "index"; 
//    }

    @PostMapping
    public String saveApplication(ApplicationDTO applicationDTO) {
        System.out.println("This is the POST method to save data...");
        System.out.println(applicationDTO.toString());
        ApplicationService applicationService = new ApplicationServiceImpl();
        boolean saved = applicationService.save(applicationDTO);

        if (saved) {
            System.out.println("Application data saved successfully.");
        } else {
            System.out.println("Failed to save application data.");
        }

        return "index"; 
    }
}

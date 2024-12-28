package com.xworkz.pg.controller;

import com.xworkz.pg.dto.SignupDTO;
import com.xworkz.pg.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignupController {

    @Autowired
    private SignupService signupService;

    public SignupController() {
        System.out.println("This is SignupController class");
    }

    @PostMapping("/signup")
    public String signup(SignupDTO signupDTO) {
        System.out.println("Received DTO: " + signupDTO);

        boolean isSaved = signupService.save(signupDTO);
        if (isSaved) {
            System.out.println("Data saved successfully");
            return "success.jsp";
        } else {
            System.out.println("Data not saved");
            return "Signup.jsp";
        }
    }
}

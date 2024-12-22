package com.xworkz.xworkz_module.controller;

import com.xworkz.xworkz_module.dto.SignupDTO;
import com.xworkz.xworkz_module.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignupController {

    @Autowired
    private SignupService signupService;

    SignupController() {
        System.out.println("running SignupController");
    }

    @PostMapping("/signup")
    public String signup(SignupDTO signupDTO , Model model) {
        System.out.println(signupDTO);
        boolean valid = signupService.valid(signupDTO);
        if (valid) {
            model.addAttribute("success","successfully signedup as "+signupDTO.getName());
            return "Success.jsp";
        }
        return "Signup.jsp";
    }

//
//    @PostMapping("/signup")
//    public int checkUserName(SignupDTO signupDTO) {
//        System.out.println(signupDTO);
//        int valid = signupService.checkUserName(signupDTO);
//        return valid;
//    }
}
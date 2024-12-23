package com.xworkz.xworkz_module.controller;

import com.xworkz.xworkz_module.dto.SigninDTO;
import com.xworkz.xworkz_module.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SigninController {

    @Autowired
    private SignupService signupService;

    SigninController() {
        System.out.println("SigninController");
    }

    @PostMapping("/signin")
    public String getSignin(String name,String password, Model model){
        System.out.println(name +" "+password);
        boolean matches=signupService.validateSigninDetails(name,password);
        if(matches){
            model.addAttribute("success" ,"Successfully SignIn as "+name);
            return "PasswordReset.jsp";
        }
        model.addAttribute("failure","incorrect password");
        model.addAttribute("dto",name);
        return "Signin.jsp";
    }
}

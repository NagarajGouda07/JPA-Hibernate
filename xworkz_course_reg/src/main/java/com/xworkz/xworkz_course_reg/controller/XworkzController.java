package com.xworkz.xworkz_course_reg.controller;

import com.xworkz.xworkz_course_reg.dto.XworkzDTO;
import com.xworkz.xworkz_course_reg.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XworkzController {

    @Autowired
    private XworkzService xworkzService;

    public XworkzController() {
        System.out.println("Created XworkzController");
    }

    @PostMapping("/xworkz")
    public String onSave(XworkzDTO xworkzDTO, Model model) {
        System.out.println("Executing onSave in XworkzController");
        System.out.println("Received DTO: " + xworkzDTO);

        String validationMessage = xworkzService.validateAndSave(xworkzDTO);

        if ("Validation successful".equals(validationMessage)) {
            model.addAttribute("success", "Signup successful");
            return "success.jsp";
        } else {
            model.addAttribute("failure", validationMessage);
            model.addAttribute("fail", "Invalid Data");
            return "signup.jsp";
        }
    }

    @PostMapping("/signin")
    public String onSignIn(String email, String password, Model model) {
        System.out.println("Received Email: " + email + ", Password: " + password);

        String validationMessage = xworkzService.authenticateUser(email, password);

        if ("Authentication successful".equals(validationMessage)) {
            String userName = xworkzService.getUserNameByEmail(email);
            model.addAttribute("userName", userName);
            return "signin.jsp";
        } else {
            model.addAttribute("error", "Given email and password do not match.");
            return "signin.jsp";
        }
    }
}

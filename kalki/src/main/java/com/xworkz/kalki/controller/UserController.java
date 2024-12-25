package com.xworkz.kalki.controller;

import com.xworkz.kalki.dto.UserDTO;
import com.xworkz.kalki.entity.UserEntity;
import com.xworkz.kalki.repository.UserRepository;
import com.xworkz.kalki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@Validated
public class UserController {

    @Autowired
    private UserService userService;
    private UserRepository userRepository;

    public UserController(){
        System.out.println("This is a UserController const...");
    }

    @GetMapping("/signup")
    public String showRegisterPage() {
        return "Signup.jsp"; // Render the registration form
    }

    @PostMapping("/signup")
    public String registerUser(@Valid @ModelAttribute UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "Signup.jsp"; // Return to the form if validation fails
        }

        boolean isSaved = userService.saveUser(userDTO);
        if (isSaved) {
            return "Success.jsp"; // Redirect to success page
        }

        return "Signup.jsp"; // Return to the form if saving fails
    }

//    @PostMapping("/signup")
//    public String signup(UserDTO userDTO){
//        System.out.println("CONTROLLER = "+ userDTO);
//
//        boolean isSaved = userService.save(userDTO);
//        if (isSaved){
//            System.out.println("Data saved successfully");
//            return "Success.jsp";
//        }
//        System.out.println("Data not saved successfully");
//        return "Signup.jsp";
//    }
//
//    @PostMapping("/signin")
//    public String signin(UserDTO userDTO) {
//        System.out.println("CONTROLLER = " + userDTO);
//
//        boolean isSaved = userService.save(userDTO);
//        if (isSaved) {
//            System.out.println("Data saved successfully");
//            return "Success.jsp";
//        }
//        System.out.println("Data not saved successfully");
//        return "Signin.jsp";
//    }
}

package com.xworkz.xworkz_admin_details.controller;

import com.xworkz.xworkz_admin_details.dto.XworkzDTO;
import com.xworkz.xworkz_admin_details.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XworkzController {

    @Autowired
    private XworkzService xworkzService;  // Use autowired service here

    XworkzController() {
        System.out.println("This is a XworkzController constructor..");
    }

    @PostMapping("/xworkz")
    public String save(XworkzDTO xworkzDTO) {
        System.out.println("This is the POST method to save data...");
        System.out.println(xworkzDTO);

        // Use the autowired xworkzService instance
        boolean saved = xworkzService.save(xworkzDTO);
        if (saved) {
            System.out.println("XworkzController data saved successfully.");
        } else {
            System.out.println("Failed to save application data.");
        }
        return "success.jsp";
    }
}
package com.xworkz.onlinebooking.componet;

import com.xworkz.onlinebooking.dto.OrganDonationDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OrganDonation {

    public OrganDonation(){
        System.out.println("This is running OrganDonation const..");
    }

    @RequestMapping("/OrganDonation")
    public String OrganDonation(OrganDonationDTO organDonationDTO){
        System.out.println("OrganDonation =  " + organDonationDTO);
        return "organDonation.jsp";
    }
}

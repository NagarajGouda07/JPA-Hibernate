package com.xworkz.onlinebooking.componet;

import com.xworkz.onlinebooking.dto.DeathCertificateDTO;
import com.xworkz.onlinebooking.dto.ScholarshipDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Scholarship {

    public Scholarship(){
        System.out.println("This is running for Scholarship const..");
    }

    @RequestMapping("/Scholarship")
    public String scholarship(ScholarshipDTO scholarshipDTO){
        System.out.println("ScholarshipDTO =  " + scholarshipDTO);
        return "scholarship.jsp";
    }

    @RequestMapping("/Death")
    public String deathCertificate(DeathCertificateDTO dto){
        System.out.println("DeathCertificateDTO = "+ dto);
        return "DeathCertificate.jsp";
    }

}

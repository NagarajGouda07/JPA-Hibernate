package com.xworkz.onlinebooking.componet;

import com.xworkz.onlinebooking.dto.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Matrimony {

    public Matrimony(){
        System.out.println("This running Matrimony const..");
    }

    @RequestMapping("/Matrimony")
    public String Matrimony(MatrimonyDTO matrimonyDTO){
        System.out.println("MatrimonyDTO =  " + matrimonyDTO);
        return "matrimony.jsp";
    }
}

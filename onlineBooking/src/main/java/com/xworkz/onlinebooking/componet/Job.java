package com.xworkz.onlinebooking.componet;

import com.xworkz.onlinebooking.dto.JobDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Job {

    public Job(){
        System.out.println("This is job application");
    }

    @RequestMapping("/Job")
    public String job(JobDTO jobDTO){
        System.out.println("Job = " + jobDTO);
        return "job.jsp";
    }
}

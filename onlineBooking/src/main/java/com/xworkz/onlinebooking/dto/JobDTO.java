package com.xworkz.onlinebooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO {

    private String name;
    private String email;
    private Long phone;
    private String position;
    private int experience;
    private String skills;
    private String dob;
    private String resume;

}

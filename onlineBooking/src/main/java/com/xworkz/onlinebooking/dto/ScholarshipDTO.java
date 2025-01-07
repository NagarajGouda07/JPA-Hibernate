package com.xworkz.onlinebooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScholarshipDTO {
    private String name;
    private String dob;
    private String email;
    private Long phone;
    private String course;
}

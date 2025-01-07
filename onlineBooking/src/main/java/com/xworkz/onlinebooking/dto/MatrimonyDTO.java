package com.xworkz.onlinebooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatrimonyDTO {

    private String name;
    private String dob;
    private String gender;
    private String religion;
    private Long phone;
    private String email;
    private String address;
}

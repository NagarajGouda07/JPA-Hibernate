package com.xworkz.onlinebooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class OrganDonationDTO {
    private String name;
    private String dob;
    private String gender;
    private String bloodGroup;
    private String email;
    private Long phone;
    private String organs;
    private String emergencyName;
    private String emergencyPhone;

}

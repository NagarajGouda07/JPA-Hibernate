package com.xworkz.pg.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignupDTO {
    private String name;
    private String email;
    private String phoneNo;
    private String location;
}

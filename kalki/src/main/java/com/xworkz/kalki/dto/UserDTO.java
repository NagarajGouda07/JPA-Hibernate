package com.xworkz.kalki.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserDTO {

    @NotEmpty(message = "Name can't be empty")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Enter a valid email address")
    private String email;

    @NotEmpty(message = "Phone number can't be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    private String phoneNo;

    @NotEmpty(message = "Password can't be empty")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    @NotEmpty(message = "Alternate Email can't be empty")
    @Email(message = "Enter a valid alternate email address")
    private String altEmail;

    @NotEmpty(message = "Location can't be empty")
    @Size(min = 3, max = 100, message = "Location must be between 3 and 100 characters")
    private String location;
}

package com.xworkz.xworkz_module.service;

import com.xworkz.xworkz_module.dto.PasswordResetDTO;
import com.xworkz.xworkz_module.dto.SigninDTO;
import com.xworkz.xworkz_module.dto.SignupDTO;
import org.springframework.stereotype.Service;

@Service
public interface SignupService {

    boolean valid(SignupDTO signupDTO);

    boolean validateSigninDetails(String name,String password);

    int checkUserName(SignupDTO signupDTO);

    long getCountOfName(String name);

    boolean validateUserName(String name,String oldPassword);

    int updatePassword(String name,String newPassword,String confirmPassword);
}

package com.xworkz.xworkz_module.service;

import com.xworkz.xworkz_module.dto.PasswordResetDTO;
import com.xworkz.xworkz_module.dto.SigninDTO;
import com.xworkz.xworkz_module.dto.SignupDTO;
import org.springframework.stereotype.Service;

@Service
public interface SignupService {

    boolean valid(SignupDTO signupDTO);

    boolean getSigninDetails(SigninDTO signinDTO);

    int checkUserName(SignupDTO signupDTO);

    long getCountOfName(String name);

    boolean validateUserName(PasswordResetDTO passwordResetDTO);

    int updatePassword(PasswordResetDTO passwordResetDTO);
}

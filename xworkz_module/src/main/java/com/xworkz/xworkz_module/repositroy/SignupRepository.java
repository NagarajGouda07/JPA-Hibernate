package com.xworkz.xworkz_module.repositroy;

import com.xworkz.xworkz_module.dto.PasswordResetDTO;
import com.xworkz.xworkz_module.dto.SignupDTO;
import com.xworkz.xworkz_module.entity.SignupEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository {

    boolean save(SignupEntity signupEntity);

    String getUserName(String name);

    int checkUserName(SignupDTO signupDTO);

    long getCountOfName(String name);

    String[] validateUserName(PasswordResetDTO passwordResetDTO);

    int updatePassword(PasswordResetDTO passwordResetDTO);
}

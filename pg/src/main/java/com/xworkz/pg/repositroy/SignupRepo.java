package com.xworkz.pg.repositroy;

import com.xworkz.pg.entity.SignupEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepo {
    boolean sign(SignupEntity signupEntity);
}
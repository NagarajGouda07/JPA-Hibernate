package com.xworkz.pg.service;

import com.xworkz.pg.dto.SignupDTO;
import org.springframework.stereotype.Service;

@Service
public interface SignupService {
    boolean save(SignupDTO signupDTO);
}

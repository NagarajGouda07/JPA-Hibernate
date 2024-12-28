package com.xworkz.pg.service;

import com.xworkz.pg.dto.SignupDTO;
import com.xworkz.pg.entity.SignupEntity;
import com.xworkz.pg.repositroy.SignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService {

    @Autowired
    private SignupRepo signupRepo;

    @Override
    public boolean save(SignupDTO signupDTO) {
        SignupEntity signupEntity = new SignupEntity();

        signupEntity.setName(signupDTO.getName());
        signupEntity.setEmail(signupDTO.getEmail());
        signupEntity.setPhoneNo(signupDTO.getPhoneNo());
        signupEntity.setLocation(signupDTO.getLocation());

        return signupRepo.sign(signupEntity);
    }
}
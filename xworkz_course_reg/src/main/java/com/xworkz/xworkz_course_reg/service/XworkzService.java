package com.xworkz.xworkz_course_reg.service;

import com.xworkz.xworkz_course_reg.dto.XworkzDTO;

public interface XworkzService {
        String validateAndSave(XworkzDTO xworkzDTO);
        String authenticateUser(String email, String password);
        String getUserNameByEmail(String email);
    }

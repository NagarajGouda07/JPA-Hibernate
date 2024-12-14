package com.xworkz.xworkz_course_reg.repository;

import com.xworkz.xworkz_course_reg.entity.XworkzEntity;

public interface XworkzRepository {

        XworkzEntity findByEmail(String email);

        boolean save(XworkzEntity xworkzEntity);
    }

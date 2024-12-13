package com.xworkz.xworkz_admin_details.service;

import com.xworkz.xworkz_admin_details.dto.XworkzDTO;
import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
import com.xworkz.xworkz_admin_details.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XworkzServiceImpl implements XworkzService {

    @Autowired
    XworkzRepository xworkzRepository; // Autowired properly

    @Override
    public boolean save(XworkzDTO xworkzDTO) {
        boolean valid = true;
        if (xworkzDTO != null) {
            String name = xworkzDTO.getName();
            if (name.length() >= 10) {
                System.out.println("Valid name");
                valid = true;
            } else {
                System.out.println("Invalid name");
                valid = false;
            }

            int age = xworkzDTO.getAge();
            if (age >= 18) {
                System.out.println("Valid age");
                valid = true;
            } else {
                System.out.println("Invalid age");
                valid = false;
            }

            String email = xworkzDTO.getEmail();
            if (email.contains("@") && email.endsWith("@gmail.com")) {
                System.out.println("Valid email");
                valid = true;
            } else {
                System.out.println("Invalid email");
                valid = false;
            }

            String password = xworkzDTO.getPassword();
            if (password.length() >= 7) {
                System.out.println("Valid password");
                valid = true;
            } else {
                System.out.println("Invalid password");
                valid = false;
            }

            String confirmPassword = xworkzDTO.getConfirmPassword();
            if (password.equals(confirmPassword)) {
                System.out.println("Passwords match");
                valid = true;
            } else {
                System.out.println("Passwords do not match");
                valid = false;
            }

            String phone_no = xworkzDTO.getPhone_no();
            if (phone_no.startsWith("8") && phone_no.length() == 10) {
                System.out.println("Valid phone number");
                valid = true;
            } else {
                System.out.println("Invalid phone number");
                valid = false;
            }
        }

        if (valid) {
            XworkzEntity xworkzEntity = new XworkzEntity();
            xworkzEntity.setName(xworkzDTO.getName());
            xworkzEntity.setAge(xworkzDTO.getAge());
            xworkzEntity.setEmail(xworkzDTO.getEmail());
            xworkzEntity.setPassword(xworkzDTO.getPassword());
            xworkzEntity.setConfirmPassword(xworkzDTO.getConfirmPassword());
            xworkzEntity.setPhone_no(xworkzDTO.getPhone_no());

            // Save to the database using repository
            return xworkzRepository.save(xworkzEntity);
        }

        return valid;
    }
}

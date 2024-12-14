package com.xworkz.xworkz_course_reg.service;

import com.xworkz.xworkz_course_reg.dto.XworkzDTO;
import com.xworkz.xworkz_course_reg.entity.XworkzEntity;
import com.xworkz.xworkz_course_reg.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XworkzServiceImpl implements XworkzService {

    @Autowired
    private XworkzRepository xworkzRepository;

    public XworkzServiceImpl() {
        System.out.println("Created XworkzServiceImpl");
    }

    @Override
    public String validateAndSave(XworkzDTO xworkzDTO) {
        System.out.println("Executing validateAndSave in XworkzServiceImpl");
        System.out.println("Received DTO: " + xworkzDTO);

        if (xworkzDTO == null) {
            return "DTO cannot be null";
        }

        String name = xworkzDTO.getName();
        if (name == null || name.length() < 10 || !name.matches("^[a-zA-Z0-9]*$")) {
            return "Invalid Name";
        }

        int age = xworkzDTO.getAge();
        if (age <= 18) {
            return "Invalid Age";
        }

        String email = xworkzDTO.getEmail();
        if (email == null || !email.contains("@") || !email.endsWith("gmail.com")) {
            return "Invalid Email";
        }

        String password = xworkzDTO.getPassword();
        if (password == null || password.length() < 7 || !password.matches(".*[^a-zA-Z0-9].*[^a-zA-Z0-9].*")) {
            return "Invalid Password";
        }

        String cPassword = xworkzDTO.getCPassword();
        if (cPassword == null || !cPassword.equals(password)) {
            return "Passwords do not match";
        }

        String ph = xworkzDTO.getPh();
        if (ph == null || !ph.startsWith("9") || ph.length() != 10) {
            return "Invalid Contact Number";
        }

        XworkzEntity xworkzEntity = new XworkzEntity();
        xworkzEntity.setName(name);
        xworkzEntity.setEmail(email);
        xworkzEntity.setAge(age);
        xworkzEntity.setPassword(password);
        xworkzEntity.setCPassword(cPassword);
        xworkzEntity.setPh(ph);

        xworkzRepository.save(xworkzEntity);
        System.out.println("Saved Entity: " + xworkzEntity);
        return "Validation successful";
    }

    @Override
    public String authenticateUser(String email, String password) {
        System.out.println("Authenticating user with email: " + email);

        XworkzEntity xworkzEntity = xworkzRepository.findByEmail(email);

        if (xworkzEntity == null) {
            System.out.println("No user found with email: " + email);
            return "Authentication failed";
        }

        System.out.println("Stored Password: " + xworkzEntity.getPassword());
        System.out.println("Input Password: " + password);

        if (!xworkzEntity.getPassword().equals(password)) {
            System.out.println("Password mismatch for email: " + email);
            return "Authentication failed";
        }

        System.out.println("Authentication successful for email: " + email);
        return "Authentication successful";
    }

    @Override
    public String getUserNameByEmail(String email) {
        System.out.println("Fetching username for email: " + email);
        XworkzEntity xworkzEntity = xworkzRepository.findByEmail(email);

        if (xworkzEntity != null) {
            System.out.println("User found: " + xworkzEntity.getName());
            return xworkzEntity.getName();
        }
        System.out.println("User not found for email: " + email);
        return null;
    }
}

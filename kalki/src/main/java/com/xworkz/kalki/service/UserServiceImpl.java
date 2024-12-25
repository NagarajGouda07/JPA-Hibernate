package com.xworkz.kalki.service;

import com.xworkz.kalki.dto.UserDTO;
import com.xworkz.kalki.entity.UserEntity;
import com.xworkz.kalki.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(){
        System.out.println("This is a UserServiceImpl const ");
    }

    @Override
    public boolean save(UserDTO userDTO) {
        System.out.println("SERVICE = " + userDTO);

        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDTO.getName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPhoneNo(userDTO.getPhoneNo());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setAltEmail(userDTO.getAltEmail());
        userEntity.setLocation(userDTO.getLocation());

        System.out.println("Mapped Entity = " + userEntity);

        return userRepository.onSave(userEntity);
    }

    @Override
    public boolean saveUser(UserDTO userDTO) {
        // Logic to save the user, for example, saving to a database
        System.out.println("User data: " + userDTO);
        // Returning true for demonstration
        return true;
    }

}

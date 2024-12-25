package com.xworkz.kalki.service;

import com.xworkz.kalki.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean save(UserDTO userDTO);
    boolean saveUser(UserDTO userDTO);
}

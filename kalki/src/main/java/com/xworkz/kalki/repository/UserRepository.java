package com.xworkz.kalki.repository;

import com.xworkz.kalki.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    boolean onSave(UserEntity userEntity);
}

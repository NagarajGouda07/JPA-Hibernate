package com.xworkz.kalki.repository;

import com.xworkz.kalki.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private EntityManagerFactory emf;

    public UserRepositoryImpl(){
        System.out.println("This is a UserRepositoryImpl const");
    }

    @Override
    public boolean onSave(UserEntity userEntity) {

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        System.out.println("Repository: Saving entity = " + userEntity);

        try{
            entityTransaction.begin();
            entityManager.merge(userEntity);
            entityTransaction.commit();
            return true;
        }catch (Exception e){
            entityTransaction.rollback();
            System.out.println("Error saving entity: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}

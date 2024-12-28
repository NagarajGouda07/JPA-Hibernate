package com.xworkz.pg.repositroy;

import com.xworkz.pg.entity.SignupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class SignupRepositoryImpl implements SignupRepo {

    @Autowired
    private EntityManagerFactory emf;

    public SignupRepositoryImpl() {
        System.out.println("This is SignupRepositoryImpl constructor...");
    }

    @Override
    public boolean sign(SignupEntity signupEntity) {
        System.out.println("Saving entity in repository: " + signupEntity);

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();
            entityManager.persist(signupEntity);
            entityTransaction.commit(); // Commit the transaction
            return true;
        } catch (Exception e) {
            entityTransaction.rollback(); // Rollback if error occurs
            System.err.println("Error saving entity: " + e.getMessage());
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close(); // Close EntityManager
        }
    }

}

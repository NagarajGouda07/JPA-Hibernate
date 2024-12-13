package com.xworkz.xworkz_admin_details.repository;

import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class XworkzRepositoryImpl implements XworkzRepository {
    @Override
    public boolean save(XworkzEntity xworkzEntity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(xworkzEntity);
            et.commit();
            return true; // Return true only if commit was successful
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
            return false; // Return false in case of error
        } finally {
            em.close();
            emf.close();
        }
    }
}
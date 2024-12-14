package com.xworkz.xworkz_course_reg.repository;

import com.xworkz.xworkz_course_reg.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class XworkzRepositoryImpl implements XworkzRepository{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public XworkzRepositoryImpl() {
        System.out.println("This is a XworkzRepositoryImpl const");
    }

        @Override
        public XworkzEntity findByEmail(String email) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            try {
                return entityManager.createQuery("SELECT c FROM CourseEntity c WHERE c.email = :email", XworkzEntity.class)
                        .setParameter("email", email)
                        .getSingleResult();
            } catch (Exception e) {
                return null;
            } finally {
                entityManager.close();
            }
        }

        @Override
        public boolean save(XworkzEntity xworkzEntity) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();

            try {
                transaction.begin();
                entityManager.persist(xworkzEntity);
                transaction.commit();
            } catch (Exception e) {
                if (transaction.isActive()) {
                    transaction.rollback();
                }
                return false;
            } finally {
                entityManager.close();
            }
            return true;
        }
    }
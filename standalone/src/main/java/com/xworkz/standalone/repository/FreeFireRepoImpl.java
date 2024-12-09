package com.xworkz.standalone.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.standalone.enitity.FreeFireEntity;

public class FreeFireRepoImpl implements FreeFireRepo {

	@Override
	public boolean save(FreeFireEntity entity) {
		System.out.println("This is repo == "+ entity.toString());
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		try {
			entityTransaction.begin();
			
			entityManager.persist(entityTransaction);
			entityTransaction.commit();
			
		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return false;
	}

}

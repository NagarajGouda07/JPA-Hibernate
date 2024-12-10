package com.xworkz.standalone.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.standalone.enitity.FreeFireEntity;

public class FreeFireRepoImpl implements FreeFireRepo {

	@Override
	public boolean save(List<FreeFireEntity> li) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			for (FreeFireEntity freeFireEntity : li) {
				entityManager.persist(freeFireEntity);
			}

			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

		return false;
	}

	@Override
	public String getName(String email) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query = entityManager.createNamedQuery("getNameByEmail");
		query.setParameter("byEmail", email);
		Object obj = query.getSingleResult();
		String name = (String) obj;

		return name;

	}

	@Override
	public int getId(int age) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query= entityManager.createNamedQuery("getIdByAge");
		query.setParameter("byAge", age);
		Integer id= (Integer)query.getSingleResult();
		
		return id;

	}

	@Override
	public String getEmail(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Query query = entityManager.createNamedQuery("getEmailByName");
		query.setParameter("byName", name);
		Object obj = query.getSingleResult();
		String email = (String) obj;

		return email;

	}

	@Override
	public int getAge(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query= entityManager.createNamedQuery("getAgeById");
		query.setParameter("getId", id);
		Integer age= (Integer)query.getSingleResult();
		
		return age;


	}

}

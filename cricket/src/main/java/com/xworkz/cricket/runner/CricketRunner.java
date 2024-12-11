package com.xworkz.cricket.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cricket.entity.CricketEntity;


public class CricketRunner {

	public static void main(String[] args) {

//		List<CricketEntity> entity = new ArrayList<>();
//
//		entity.add(new CricketEntity("Naga", "naga@gmail.com", "Agasaladinne", 8374935263L, 23, 5555.0));
//		entity.add(new CricketEntity("Matesh", "matesh@gmail.com", "kalaburgi", 7676834033L, 23, 525.0));
//		entity.add(new CricketEntity("Naveen", "naveen@gmail.com", "Gadga", 9576843234L, 23, 400.45));
//		entity.add(new CricketEntity("rajesh", "rajesh@gmail.com", "kagal", 9876543257L, 23, 8056.0));
//		entity.add(new CricketEntity("Arun", "arun@gmail.com", "Chikamangaluru", 8796895479L, 24, 789.0));
//		entity.add(new CricketEntity("Mahesh", "mahesh@gmail.com", "Ballari", 7685940343L, 25, 567.09));
//		entity.add(new CricketEntity("Hulii", "hulii@gmail.com", "Guru", 9087655645L, 20, 900.0));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			
			String queryStr = "select cr from CricketEntity cr";
			List<CricketEntity> resultlist = entityManager.createQuery(queryStr, CricketEntity.class).getResultList();

			for (CricketEntity cricketEntity : resultlist) {
//				entityManager.persist(cricketEntity);
				System.out.println(cricketEntity);
			}

			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();

			}
			e.printStackTrace();
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

}

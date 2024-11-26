package com.xworkz.remove.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.remove.dto.BagDto;

public class BagInsertionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			BagDto bagDto = new BagDto("Skybags Riddle", "JPA-Hibernate", 454.99);
			BagDto bagDto1 = new BagDto("Uppercase", "JPA-Hibernate", 999.99);
			BagDto bagDto2 = new BagDto("Skybags", "JPA-Hibernate", 777.99);
			BagDto bagDto3 = new BagDto("Personalized", "JPA-Hibernate", 657.99);
			BagDto bagDto4 = new BagDto("Hyper Adam", "JPA-Hibernate", 400.99);
			BagDto bagDto5 = new BagDto("Stylish", "JPA-Hibernate", 450.99);
			BagDto bagDto6 = new BagDto("Riddle", "JPA-Hibernate", 454.99);
			BagDto bagDto7 = new BagDto("SkybagsRiddle", "JPA-Hibernate", 484.99);
			BagDto bagDto8 = new BagDto("SkybagModel", "JPA-Hibernate", 457.99);
			BagDto bagDto9 = new BagDto("RiddleBags", "JPA-Hibernate", 600.99);

			entityManager.persist(bagDto);
			entityManager.persist(bagDto1);
			entityManager.persist(bagDto2);
			entityManager.persist(bagDto3);
			entityManager.persist(bagDto4);
			entityManager.persist(bagDto5);
			entityManager.persist(bagDto6);
			entityManager.persist(bagDto7);
			entityManager.persist(bagDto8);
			entityManager.persist(bagDto9);
			System.out.println("Data is a saved..........");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			entityManager.close();

			entityManagerFactory.close();

		}

	}

}

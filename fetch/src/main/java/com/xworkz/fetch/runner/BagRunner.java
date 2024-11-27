package com.xworkz.fetch.runner;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fetch.dto.BagDto;

public class BagRunner {

	public static void main(String[] args) {

		ArrayList<BagDto> bagList = new ArrayList<>();

		bagList.add(new BagDto("Skybags Riddle", "JPA-Hibernate", 454.99, "Blue", "Polyester", 1.2, "Medium", true,
				"Skybags"));
		bagList.add(
				new BagDto("Uppercase", "JPA-Hibernate", 999.99, "Black", "Nylon", 1.5, "Large", false, "Uppercase"));
		bagList.add(new BagDto("Skybags", "JPA-Hibernate", 777.99, "Red", "Canvas", 1.1, "Small", true, "Skybags"));
		bagList.add(
				new BagDto("Personalized", "JPA-Hibernate", 657.99, "Green", "Leather", 2.0, "Large", false, "Custom"));
		bagList.add(
				new BagDto("Hyper Adam", "JPA-Hibernate", 400.99, "Yellow", "Polyester", 1.3, "Medium", true, "Hyper"));
		bagList.add(new BagDto("Stylish", "JPA-Hibernate", 450.99, "Purple", "Canvas", 1.0, "Small", false,
				"StylishBrand"));
		bagList.add(new BagDto("Riddle", "JPA-Hibernate", 454.99, "Gray", "Leather", 1.4, "Medium", true, "Skybags"));
		bagList.add(
				new BagDto("SkybagsRiddle", "JPA-Hibernate", 484.99, "Blue", "Nylon", 1.2, "Large", true, "Skybags"));
		bagList.add(new BagDto("SkybagModel", "JPA-Hibernate", 457.99, "Orange", "Polyester", 1.8, "Medium", true,
				"Skybags"));
		bagList.add(new BagDto("RiddleBags", "JPA-Hibernate", 600.99, "Brown", "Leather", 2.1, "Large", false,
				"RiddleBrand"));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			for (BagDto bag : bagList) {
				entityManager.persist(bag);
			}

			entityTransaction.commit();
			System.out.println("Data is a saved....");

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

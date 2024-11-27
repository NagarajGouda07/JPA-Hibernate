package com.xworkz.fetch.runner;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fetch.dto.BatDto;

public class BatRunner {

	public static void main(String[] args) {

		ArrayList<BatDto> batList = new ArrayList<>();

		batList.add(
				new BatDto("Kookaburra", "Willow", 1.2, "Natural", "Medium", 1499.99, true, "Round", "Cricket", "UK"));
		batList.add(new BatDto("Gray-Nicolls", "English Willow", 1.1, "Natural", "Large", 1799.99, false, "Oval",
				"Cricket", "Australia"));
		batList.add(new BatDto("MRF", "Kashmir Willow", 1.3, "Natural", "Small", 999.99, true, "Round", "Cricket",
				"India"));
		batList.add(new BatDto("SG", "Composite", 1.4, "Black", "Medium", 899.99, false, "Flat", "Cricket", "India"));
		batList.add(new BatDto("Spartan", "English Willow", 1.5, "Natural", "Large", 1599.99, true, "Round", "Cricket",
				"Australia"));
		batList.add(
				new BatDto("Adidas", "Willow", 1.3, "Natural", "Medium", 1299.99, false, "Oval", "Cricket", "Germany"));
		batList.add(new BatDto("Nike", "Wooden", 1.2, "Brown", "Medium", 1399.99, true, "Round", "Baseball", "USA"));
		batList.add(
				new BatDto("Puma", "English Willow", 1.6, "Natural", "Large", 1999.99, false, "Flat", "Cricket", "UK"));
		batList.add(new BatDto("Gunn & Moore", "Willow", 1.4, "Natural", "Medium", 1099.99, true, "Round", "Cricket",
				"UK"));
		batList.add(
				new BatDto("Reebok", "Composite", 1.3, "Black", "Small", 1199.99, false, "Oval", "Baseball", "USA"));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			for (BatDto bat : batList) {
				entityManager.persist(bat);

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

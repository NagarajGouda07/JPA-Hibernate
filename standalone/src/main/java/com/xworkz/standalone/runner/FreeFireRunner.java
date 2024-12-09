package com.xworkz.standalone.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.standalone.enitity.FreeFireEntity;

public class FreeFireRunner {

	public static void main(String[] args) {
		List<FreeFireEntity> personList = new ArrayList<>();

		personList.add(new FreeFireEntity("naga", "naga@example.com", "1234567890", 20));
		personList.add(new FreeFireEntity("abhi", "abhi@example.com", "958764321", 25));
		personList.add(new FreeFireEntity("mahesh", "mahesh@example.com", "9876543210", 30));
		personList.add(new FreeFireEntity("Nina", "nina@example.com", "9087654321", 18));
		personList.add(new FreeFireEntity("naveen", "naveen@example.com", "4567891230", 22));
		personList.add(new FreeFireEntity("Sophie", "sophie@example.com", "3216549870", 27));
		personList.add(new FreeFireEntity("Nathan", "nathan@example.com", "6549873210", 19));
		personList.add(new FreeFireEntity("Ella", "ella@example.com", "7890654321", 21));
		personList.add(new FreeFireEntity("Steve", "steve@example.com", "1597534862", 26));
		personList.add(new FreeFireEntity("rajesh", "rajesh@example.com", "7539514862", 24));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			for (FreeFireEntity entity : personList) {
				entityManager.persist(entity);
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

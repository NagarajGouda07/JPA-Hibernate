package com.xworkz.fetch.runner;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fetch.dto.BagDto;

public class BagFetchRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Integer String = 10;
		BagDto bagDto = entityManager.find(BagDto.class, String);

		System.out.println("dto ==  " + bagDto.getBrand());

		try {
			entityTransaction.begin();

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

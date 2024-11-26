package com.xworkz.remove.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.remove.dto.BagDto;

public class BagRemoveRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			BagDto bagDto = new BagDto();

			BagDto Remove1 = entityManager.find(BagDto.class, 7);
			BagDto Remove2 = entityManager.find(BagDto.class, 8);
			BagDto Remove3 = entityManager.find(BagDto.class, 9);
			BagDto Remove4 = entityManager.find(BagDto.class, 10);
			BagDto Remove5 = entityManager.find(BagDto.class, 11);
			BagDto Remove6 = entityManager.find(BagDto.class, 12);

			entityManager.remove(Remove1);
			entityManager.remove(Remove2);
			entityManager.remove(Remove3);
			entityManager.remove(Remove4);
			entityManager.remove(Remove5);
			entityManager.remove(Remove6);
			
			System.out.println("This data is remove.....");

			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		} finally {
			entityManager.close();
			entityManagerFactory.close();

		}
	}

}

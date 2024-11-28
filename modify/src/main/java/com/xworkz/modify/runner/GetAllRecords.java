package com.xworkz.modify.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.modify.dto.PersonDto;

public class GetAllRecords {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			String queryStr = "SELECT b FROM PersonDto b";
			List<PersonDto> resultList = entityManager.createQuery(queryStr, PersonDto.class).getResultList();

			for (PersonDto person : resultList) {
				System.out.println(person);
			}

			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}

		} finally {
			entityManager.close();
			entityManagerFactory.close();

		}
	}

}

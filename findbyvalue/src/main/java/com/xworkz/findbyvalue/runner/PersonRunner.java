package com.xworkz.findbyvalue.runner;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.findbyvalue.dto.PersonDto;

public class PersonRunner {

	public static void main(String[] args) {

		List<PersonDto> personList = new ArrayList<>();

		personList.add(new PersonDto("John", "john@example.com", "1234567890", 20));
		personList.add(new PersonDto("Sarah", "sarah@example.com", null, 25));
		personList.add(new PersonDto("Michael", "michael@example.com", "9876543210", 30));
		personList.add(new PersonDto("Nina", "nina@example.com", null, 18));
		personList.add(new PersonDto("Chris", "chris@example.com", "4567891230", 22));
		personList.add(new PersonDto("Sophie", "sophie@example.com", "3216549870", 27));
		personList.add(new PersonDto("Nathan", "nathan@example.com", "6549873210", 19));
		personList.add(new PersonDto("Ella", "ella@example.com", null, 21));
		personList.add(new PersonDto("Steve", "steve@example.com", "1597534862", 26));
		personList.add(new PersonDto("Nancy", "nancy@example.com", "7539514862", 24));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			for (PersonDto personDto : personList) {
				entityManager.persist(personDto);
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

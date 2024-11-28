package com.xworkz.modify.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.modify.dto.PersonDto;

public class Update {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			Query query = entityManager
					.createQuery("UPDATE PersonDto p SET p.name = :newName, p.email = :newEmail WHERE p.phone is NULL");
			query.setParameter("newName", "naga");
			query.setParameter("newEmail", "naga@gmail.com");

			int rowsUpdated = query.executeUpdate();
			System.out.println("Number of rows updated: " + rowsUpdated);
			
			System.out.println("----------------------------------------------------");

			PersonDto dto = new PersonDto();
			if (dto.getAge() > 25) {

				List<PersonDto> resultList = entityManager
						.createQuery("select name, email from PersonDto where age =:myAge", PersonDto.class)
						.setParameter("myAge", dto.getAge()).getResultList();

				for (PersonDto personDto : resultList) {
					System.out.println(personDto.getName() +" "+personDto.getEmail());
				}
			}
			
			String queryStr = "SELECT p.email FROM PersonDto p WHERE p.name LIKE 'S%' OR p.name LIKE 'N%'";
			TypedQuery<String> query1 = entityManager.createQuery(queryStr, String.class);
			List<String> emails = query1.getResultList();

			for (String email : emails) {
			    System.out.println(email);
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

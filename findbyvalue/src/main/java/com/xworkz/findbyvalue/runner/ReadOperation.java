package com.xworkz.findbyvalue.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.findbyvalue.dto.PersonDto;

public class ReadOperation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query = entityManager.createNamedQuery("findByName");
		Object object = query.getSingleResult();

		PersonDto personDto = (PersonDto) object;
		System.out.println("personDto " + personDto.toString());
		System.out.println(" ");

		Query query1 = entityManager.createNamedQuery("findByEmail");
		Object object1 = query1.getSingleResult();

		PersonDto personDto1 = (PersonDto) object1;
		System.out.println("personDto1 " + personDto1.toString());
		System.out.println(" ");

		Query query2 = entityManager.createNamedQuery("findById");
		Object object2 = query2.getSingleResult();

		PersonDto personDto2 = (PersonDto) object2;
		System.out.println("personDto2 " + personDto2.toString());
		System.out.println(" ");

		Query query3 = entityManager.createNamedQuery("findByphone&age");
		Object object3 = query3.getResultList();

		List<PersonDto> res = query3.getResultList();
		for (PersonDto pd : res) {
			System.out.println("values :" + pd.getPhone() + ", " + pd.getAge());
		}
		System.out.println(" ");

		Query query4 = entityManager.createNamedQuery("findByName&Email");
		Object object4 = query4.getResultList();

		List<PersonDto> res1 = query4.getResultList();
		for (PersonDto pd : res1) {
			System.out.println("values :" + pd.getName() + ", " + pd.getEmail());
		}

		System.out.println(" ");

		Query query5 = entityManager.createNamedQuery("findByAll");
		Object object5 = query5.getResultList();

		List<PersonDto> res2 = query5.getResultList();
		for (PersonDto pd : res2) {
			System.out.println("values :" + pd);
		}

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

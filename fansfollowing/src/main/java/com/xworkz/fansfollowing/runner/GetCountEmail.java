package com.xworkz.fansfollowing.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetCountEmail {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		Query query = entityManager.createNamedQuery("CountEmail");
		query.setParameter("byEmail", "4");
		Object object = query.getSingleResult();
		Long count = (Long) object;
		System.out.println(count);
		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			emf.close();
			entityManager.close();
		}

	}

}

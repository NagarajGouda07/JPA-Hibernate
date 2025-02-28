package com.xworkz.fansfollowing.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Count {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		Query query = entityManager.createNamedQuery("CountById");
		List<Object[]> object = query.getResultList();

		for (Object[] obj : object) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);

		}
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

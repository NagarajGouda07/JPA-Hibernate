package com.xworkz.fansfollowing.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllTypes {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		Query query1 = entityManager.createNamedQuery("findNameByIdAndAge");
		query1.setParameter("byId", 3).setParameter("byAge", 25);
		String name = (String) query1.getSingleResult();
		System.out.println("Query1: " + name);

		Query query2 = entityManager.createNamedQuery("findAgeByIdAndName");
		query2.setParameter("byId", 2).setParameter("byName", "nandan");
		Integer age = (Integer) query2.getSingleResult();
		System.out.println("Query2: " + age);

		Query query3 = entityManager.createNamedQuery("findEmailByIdAndName");
		query3.setParameter("byId", 4).setParameter("byName", "sachin");
		String st = (String) query3.getSingleResult();
		System.out.println("Query3: " + st);

		Query query4 = entityManager.createNamedQuery("findIsEligibleByIdAndName");
		query4.setParameter("byId", 2).setParameter("byName", "nandan");
		Boolean bl = (Boolean) query4.getSingleResult();
		System.out.println("Query4: " + bl);

//		Query query5=entityManager.createNamedQuery("findDobIdAndName");
//		query5.setParameter("byId",5).setParameter("byName", "likith");
//		LocalDate date=(LocalDate)query5.getSingleResult();
//		System.out.println("Query5: "+ date);

		Query query6 = entityManager.createNamedQuery("findEmailIdAndName");
		query6.setParameter("byId", 7).setParameter("byName", "arun");
		String st1 = (String) query6.getSingleResult();
		System.out.println("Query6: " + st1);

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

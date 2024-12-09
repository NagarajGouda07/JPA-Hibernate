package com.xworkz.fansfollowing.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteByNameAndAge {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		

		try {
			et.begin();

			Query query = entityManager.createNamedQuery("deleteByNameAndAge");
			query.setParameter("byName", "charan").setParameter("byAge", 23);
			int value = query.executeUpdate();
			if (value > 0) {
				System.out.println("deletd");
			} else {
				System.out.println("not deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
			
		} finally {
			emf.close();
			entityManager.close();
		}

	}

}

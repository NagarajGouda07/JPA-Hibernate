package com.xworkz.fansfollowing.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateByName {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();

			Query query = entityManager.createNamedQuery("UpdateByName");
			query.setParameter("income", 50000.0).setParameter("byName", "sachin");
			int value = query.executeUpdate();
			if (value > 0) {
				System.out.println("updated");
			} else {
				System.out.println("not updated");
			}
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();

			}
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();

		}

	}

}

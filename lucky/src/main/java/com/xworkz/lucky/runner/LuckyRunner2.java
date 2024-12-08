package com.xworkz.lucky.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LuckyRunner2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();

			int value = em.createNamedQuery("updateName").setParameter("setname", "charan jv")
					.setParameter("setEmail", "charan@gmail.com").setParameter("setNo", 9741591749L).executeUpdate();

			if (value > 0)
				System.out.println("name updated");
			else
				System.err.println("not updated");

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}

	}

}

package com.xworkz.ryzen_jpa.runner;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.ryzen_jpa.dto.Hp;

public class HpRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");

		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		

		try {
			et.begin();
			Hp hp = new Hp();
			hp.setId(4);
			hp.setRatings(4.5);
			hp.setName("intel");
			
			entityManager.persist(hp);
			System.out.println("data is saved..");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}

	}

}

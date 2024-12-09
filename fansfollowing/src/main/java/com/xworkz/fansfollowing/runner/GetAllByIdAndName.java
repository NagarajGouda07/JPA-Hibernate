package com.xworkz.fansfollowing.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.fansfollowing.entity.PersonEntity;

public class GetAllByIdAndName {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		Query query = entityManager.createNamedQuery("findAllByIdAndName");
		query.setParameter("byId", 3).setParameter("byName", "sachin");
		List<PersonEntity> list = query.getResultList();
		for (PersonEntity pe : list)
			System.out.println(pe.toString());
		System.out.println("-------");
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

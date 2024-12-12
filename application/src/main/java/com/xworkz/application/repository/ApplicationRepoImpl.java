package com.xworkz.application.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.application.entity.ApplicationEntity;

public class ApplicationRepoImpl implements ApplicationRepository {

	@Override
	public boolean save(ApplicationEntity applicationEntity) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(applicationEntity);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}

		return true;
	}

}

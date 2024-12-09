package com.xworkz.fansfollowing.runner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fansfollowing.entity.PersonEntity;



public class PersonRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<PersonEntity> list = new ArrayList<PersonEntity>();
		list.add(new PersonEntity("charan", 23, "charan@gmail.com", 9741591749L,
				Date.valueOf(LocalDate.of(2003, 01, 06)), 35000.00, "kolar", 4, true));
		list.add(new PersonEntity("nandan", 24, "nandan@gmail.com", 9553453749L,
				Date.valueOf(LocalDate.of(2002, 11, 26)), 35000.00, "kgf", 3, false));
		list.add(new PersonEntity("ajay", 25, "ajay@gmail.com", 863591749L, Date.valueOf(LocalDate.of(2002, 07, 06)),
				35000.00, "hubli", 4, true));
		list.add(new PersonEntity("sachin", 23, "sachin@gmail.com", 7536591749L,
				Date.valueOf(LocalDate.of(2002, 06, 24)), 50000.00, "hubli", 3, true));
		list.add(new PersonEntity("likith", 19, "likith@gmail.com", 8741591749L,
				Date.valueOf(LocalDate.of(2005, 01, 20)), 35000.00, "kolar", 1, true));
		list.add(new PersonEntity("chandan", 22, "chandan@gmail.com", 7651591749L,
				Date.valueOf(LocalDate.of(2004, 05, 06)), 35000.00, "kolar", 2, true));
		list.add(new PersonEntity("arun", 23, "arun@gmail.com", 8741591749L, Date.valueOf(LocalDate.of(2003, 02, 06)),
				35000.00, "bengaluru", 4, true));

		for (PersonEntity Entity : list) {
			em.persist(Entity);
		}

		try {
			et.begin();

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

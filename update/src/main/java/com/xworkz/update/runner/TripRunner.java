package com.xworkz.update.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.update.dto.TripDto;

public class TripRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");

		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			TripDto tripDto = new TripDto();

			tripDto.setId(1);
			tripDto.setName("Krishna");
			tripDto.setPlace("kashi");

			eM.merge(tripDto);
			System.out.println("data is saved..");
			eT.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}

	}

}

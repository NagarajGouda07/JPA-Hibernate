package com.xworkz.cricket_jsp.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cricket_jsp.dto.CricketDto;

public class CricketRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");

		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			CricketDto cricketDto = new CricketDto();
			
			cricketDto.setName("ishan");
			cricketDto.setNo_of_players(4);
			
			eM.persist(cricketDto);
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

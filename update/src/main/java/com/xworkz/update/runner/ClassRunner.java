package com.xworkz.update.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.update.dto.ClassDto;

public class ClassRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");

		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			ClassDto classDto = new ClassDto();
			
			classDto.setId(1);
			classDto.setClassName("Physics");
			classDto.setTotal_No_of_stud("50");
			classDto.setStudentName("Nagaraj007");

			eM.merge(classDto);
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

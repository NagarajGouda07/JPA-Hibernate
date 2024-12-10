package com.xworkz.standalone.service;

import java.util.List;

import com.xworkz.standalone.enitity.FreeFireEntity;
import com.xworkz.standalone.repository.FreeFireRepo;
import com.xworkz.standalone.repository.FreeFireRepoImpl;

public class FreeFireServiceImpl implements FreeFireService {

	@Override
	public boolean save(List<FreeFireEntity> li) {
		System.out.println(li);

		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.save(li);
		return true;
	}

	@Override
	public String getName(String email) {
		
		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.getName(email);
		
		return entityRepo.getName(email);
	}

	@Override
	public int getId(int age) {
		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.getId(age);
		return entityRepo.getId(age);
	}

	@Override
	public String getEmail(String name) {
		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.getEmail(name);
		
		return entityRepo.getEmail(name);
	}

	@Override
	public int getAge(int id) {
		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.getAge(id);
		
		return entityRepo.getAge(id);
	}

}

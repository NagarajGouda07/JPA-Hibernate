package com.xworkz.standalone.service;

import com.xworkz.standalone.enitity.FreeFireEntity;
import com.xworkz.standalone.repository.FreeFireRepo;
import com.xworkz.standalone.repository.FreeFireRepoImpl;

public class FreeFireServiceImpl implements FreeFireService{

	@Override
	public boolean save(FreeFireEntity entity) {
		
		System.out.println("entity == "+ entity.toString());
		
		FreeFireRepo entityRepo = new FreeFireRepoImpl();
		entityRepo.save(entity);
		return false;
	}

}

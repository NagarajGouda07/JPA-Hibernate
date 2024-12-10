package com.xworkz.standalone.service;

import java.util.List;

import com.xworkz.standalone.enitity.FreeFireEntity;

public interface FreeFireService {
	
	boolean save(List<FreeFireEntity> li);
	
	String getName(String email);

	public int getId(int age);
	
	String getEmail(String name);
	
	public int getAge(int id);

}

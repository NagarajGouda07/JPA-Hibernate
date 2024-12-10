package com.xworkz.standalone.runner;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.standalone.enitity.FreeFireEntity;
import com.xworkz.standalone.service.FreeFireService;
import com.xworkz.standalone.service.FreeFireServiceImpl;

public class FreeFireRunner {

	public static void main(String[] args) {
		List<FreeFireEntity> li = new ArrayList<>();

		li.add(new FreeFireEntity("naga", "naga@example.com", "1234567890", 20));
		li.add(new FreeFireEntity("abhi", "abhi@example.com", "958764321", 25));
		li.add(new FreeFireEntity("mahesh", "mahesh@example.com", "9876543210", 30));
		li.add(new FreeFireEntity("Nina", "nina@example.com", "9087654321", 18));
		li.add(new FreeFireEntity("naveen", "naveen@example.com", "4567891230", 22));
		li.add(new FreeFireEntity("Sophie", "sophie@example.com", "3216549870", 27));
		li.add(new FreeFireEntity("Nathan", "nathan@example.com", "6549873210", 19));
		li.add(new FreeFireEntity("Ella", "ella@example.com", "7890654321", 21));
		li.add(new FreeFireEntity("Steve", "steve@example.com", "1597534862", 26));
		li.add(new FreeFireEntity("rajesh", "rajesh@example.com", "7539514862", 24));

//		FreeFireService service = new FreeFireServiceImpl();
//		boolean saved = service.save(li);
//		System.out.println("Entities saved: " + saved);

		FreeFireService service1 = new FreeFireServiceImpl();
		String name = service1.getName("abhi@example.com");
		System.out.println("Name = " + name);

		FreeFireService service3 = new FreeFireServiceImpl();
		int id = service3.getId(25);
		System.out.println("Id : " + id);

		FreeFireService service4 = new FreeFireServiceImpl();
		String email = service4.getEmail("rajesh");
		System.out.println("Email = " + email);
		
		FreeFireService service2 = new FreeFireServiceImpl();
		int age = service2.getAge(5);
		System.out.println("Age : " + age);

	}

}

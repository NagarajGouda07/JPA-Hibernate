package com.xworkz.ryzen_jpa.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "days")
public class Hp {

	@Id
	private int id;

	private double ratings;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package com.xworkz.remove.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bag_ins")
public class BagDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "bagName")
	private String bagName;
	@Column(name = "bookName")
	private String bookName;
	@Column(name = "price")
	private double price;

	public BagDto() {
		super();
	}

	public BagDto(String bagName, String bookName, double price) {
		super();
		this.bagName = bagName;
		this.bookName = bookName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBagName() {
		return bagName;
	}

	public void setBagName(String bagName) {
		this.bagName = bagName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

package com.xworkz.fetch.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bat_db")
public class BatDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "brand")
	private String brand;
	@Column(name = "material")
	private String material;
	@Column(name = "weight")
	private double weight;
	@Column(name = "color")
	private String color;
	@Column(name = "size")
	private String size;
	@Column(name = "price")
	private double price;
	@Column(name = "isCustomizable")
	private boolean isCustomizable;
	@Column(name = "handleType")
	private String handleType;
	@Column(name = "category")
	private String category;
	@Column(name = "countryOfOrigin")
	private String countryOfOrigin;

	public BatDto() {
		super();
	}

	public BatDto(String brand, String material, double weight, String color, String size, double price,
			boolean isCustomizable, String handleType, String category, String countryOfOrigin) {
		super();
		this.brand = brand;
		this.material = material;
		this.weight = weight;
		this.color = color;
		this.size = size;
		this.price = price;
		this.isCustomizable = isCustomizable;
		this.handleType = handleType;
		this.category = category;
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isCustomizable() {
		return isCustomizable;
	}

	public void setCustomizable(boolean isCustomizable) {
		this.isCustomizable = isCustomizable;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}
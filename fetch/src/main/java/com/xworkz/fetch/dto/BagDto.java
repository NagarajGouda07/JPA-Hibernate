package com.xworkz.fetch.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fetch_db")
public class BagDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "price")
	private double price;
	@Column(name = "color")
	private String color;
	@Column(name = "material")
	private String material;
	@Column(name = "weight")
	private double weight;
	@Column(name = "size")
	private String size;
	@Column(name = "waterproof")
	private boolean waterproof;
	@Column(name = "brand")
	private String brand;

	public BagDto() {
		super();
	}

	public BagDto(String name, String type, double price, String color, String material, double weight, String size,
			boolean waterproof, String brand) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.color = color;
		this.material = material;
		this.weight = weight;
		this.size = size;
		this.waterproof = waterproof;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isWaterproof() {
		return waterproof;
	}

	public void setWaterproof(boolean waterproof) {
		this.waterproof = waterproof;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}

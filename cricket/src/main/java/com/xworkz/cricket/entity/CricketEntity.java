package com.xworkz.cricket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music")
public class CricketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_no")
	private Long phone_no;
	@Column(name = "age")
	private int age;
	@Column(name = "price")
	private Double price;

	public CricketEntity() {
		super();
	}

	public CricketEntity(String name, String email, String address, Long phone_no, int age, Double price) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone_no = phone_no;
		this.age = age;
		this.price = price;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CricketEntity [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phone_no=" + phone_no + ", age=" + age + ", price=" + price + "]";
	}

}

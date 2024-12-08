package com.xworkz.lucky.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "scholarship")

public class LuckyEntity {

	public LuckyEntity() {
		super();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	@Override
	public String toString() {
		return "LuckyEntity [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone_no="
				+ phone_no + ", dob=" + dob + ", income=" + income + ", address=" + address + ", year=" + year
				+ ", isEligible=" + isEligible + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_age")
	private int age;
	@Column(name = "student_email")
	private String email;
	@Column(name = "student_phoneNo")
	private long phone_no;
	@Column(name = "student_dob")
	private Date dob;
	@Column(name = "student_income")
	private Double income;
	@Column(name = "address")
	private String address;
	@Column(name = "current_year")
	private int year;
	@Column(name = "isEligible")
	private boolean isEligible;

	public LuckyEntity(String name, int age, String email, long phone_no, Date dob, Double income, String address,
			int year, boolean isEligible) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone_no = phone_no;
		this.dob = dob;
		this.income = income;
		this.address = address;
		this.year = year;
		this.isEligible = isEligible;
	}

}

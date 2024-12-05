package com.xworkz.findbyvalue.dto;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person_db")
@NamedQuery(name = "findByName", query = "select dto from PersonDto dto where dto.name ='John'" )
@NamedQuery(name = "findByEmail", query = "select dto from PersonDto dto where dto.email = 'sophie@example.com'" )
@NamedQuery(name = "findById", query = "select dto from PersonDto dto where dto.id = '10'")
@NamedQuery(name = "findByphone&age", query = "select dto from PersonDto dto where dto.id = '5'")
@NamedQuery(name = "findByName&Email", query = "select dto from PersonDto dto where dto.id = '6'")
@NamedQuery(name = "findByAll", query = "select dto from PersonDto dto")
public class PersonDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "age")
	private int age;

	public PersonDto() {
		super();
	}

	public PersonDto(String name, String email, String phone, int age) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDto [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}

}

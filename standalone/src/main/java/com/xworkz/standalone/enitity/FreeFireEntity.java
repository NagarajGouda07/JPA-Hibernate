package com.xworkz.standalone.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person_db3")

@NamedQuery(name="getNameByEmail", query="Select ps.name from FreeFireEntity ps where ps.email= :byEmail")

@NamedQuery(name = "getAgeById", query = "Select ps.age FROM FreeFireEntity ps WHERE ps.id = :id")

@NamedQuery(name="getIdByAge", query="Select ps.id From FreeFireEntity ps Where ps.age= :byAge")

@NamedQuery(name="getEmailByName", query="Select ps.email from FreeFireEntity ps where ps.name= :byName")

public class FreeFireEntity {

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

	public FreeFireEntity() {
		super();
	}

	public FreeFireEntity(String name, String email, String phone, int age) {
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
		return "FreeFireEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}

}

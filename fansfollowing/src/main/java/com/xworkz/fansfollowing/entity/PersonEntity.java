package com.xworkz.fansfollowing.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "scholarship")
@NamedQuery(name="findAll" ,query="select pe from PersonEntity pe")
@NamedQuery(name="CountById", query="select count(*),pe.name, pe.email from PersonEntity pe group by pe.age" )
@NamedQuery(name="findNameByIdAndAge" ,query="select pe.name from PersonEntity pe where pe.id = :byId and pe.age = :byAge")
@NamedQuery(name="findAgeByIdAndName" ,query="select pe.age from PersonEntity pe where pe.id =:byId and pe.name =:byName")
@NamedQuery(name="findEmailByIdAndName" ,query="select pe.email from PersonEntity pe where pe.id =:byId and pe.name =:byName")
@NamedQuery(name="findIsEligibleByIdAndName" ,query="select pe.isEligible from PersonEntity pe where pe.id =:byId and pe.name =:byName")
@NamedQuery(name="findDobIdAndName" ,query="select pe.dob from PersonEntity pe where pe.id =:byId and pe.name =:byName")
@NamedQuery(name="findAllByIdAndName" ,query="select pe from PersonEntity pe where pe.id =:byId and pe.name =:byName")
//@NamedQuery(name = "deleteByNameAndAge", query = "SELECT FROM PersonEntity pe WHERE pe.name = :name AND pe.age = :age")
@NamedQuery(name = "UpdateByName", query = "UPDATE PersonEntity pe SET pe.income = :income WHERE pe.name = :byName")
@NamedQuery(name="findNameAndEmailById" ,query="select pe.name, pe.email from PersonEntity pe where pe.id =:byId")
@NamedQuery(name="CountEmail" ,query="select count(*) as COUNT  from PersonEntity pe where pe.email >:byEmail")
@NamedQuery(name="findNameAndEmailAndAgeAndIncome" ,query="select pe.name, pe.email ,pe.age,pe.income from PersonEntity pe where pe.id >:byId")

public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_no")
	private long phone_no;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "income")
	private Double income;
	@Column(name = "address")
	private String address;
	@Column(name = "year")
	private int year;
	@Column(name = "isEligible")
	private boolean isEligible;

	public PersonEntity() {
		super();
	}

	public PersonEntity(String name, int age, String email, long phone_no, Date dob, Double income, String address,
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
		return "PersonEntity [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone_no="
				+ phone_no + ", dob=" + dob + ", income=" + income + ", address=" + address + ", year=" + year
				+ ", isEligible=" + isEligible + "]";
	}

}

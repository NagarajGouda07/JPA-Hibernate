package com.xworkz.update.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list")
public class ClassDto {

	@Id
	private int id;
	@Column(name = "className")
	private String className;
	@Column(name = "total_No_of_stud")
	private String total_No_of_stud;
	@Column(name = "studentName")
	private String studentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTotal_No_of_stud() {
		return total_No_of_stud;
	}

	public void setTotal_No_of_stud(String total_No_of_stud) {
		this.total_No_of_stud = total_No_of_stud;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}

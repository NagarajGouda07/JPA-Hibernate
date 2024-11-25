package com.xworkz.cricket_jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cricket_list")
public class CricketDto {

	@Id

	private int id;
	private String name;
	private int no_of_players;

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

	public int getNo_of_players() {
		return no_of_players;
	}

	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}

}

package com.pro.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="listOfOpening")
public class Devop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="enq_name")
	private String name;
	@Column	(name="enq_mail")
	private String mail;
	@Column(name="enq_number")
	private long number;
	
	public Devop() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Devop(String name, String mail, long number) {
		super();
		this.name = name;
		this.mail = mail;
		this.number = number;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Devop [id=" + id + ", name=" + name + ", mail=" + mail + ", number=" + number + "]";
	}
	

}

package com.automation.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DriverDetails")
public class Driver {
    @Id
    @GeneratedValue
	private int dId;
	private String name;
	private int contNo;

	public Driver() {
		super();
	}

	public Driver(int dId, String name, int contNo) {
		super();
		this.dId = dId;
		this.name = name;
		this.contNo = contNo;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContNo() {
		return contNo;
	}

	public void setContNo(int contNo) {
		this.contNo = contNo;
	}

	@Override
	public String toString() {
		return "Driver [dID=" + dId + ", name=" + name + ", contNo=" + contNo + "]";
	}

}


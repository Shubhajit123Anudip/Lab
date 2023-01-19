package com.Spring.entity;

public class Account {

	private String type;
	private double bal;

	public Account(String type, double bal) { 
		super();
		this.type = type;
		this.bal = bal;

	}

	public String toString() {

		return type + " " + bal;
	}
}

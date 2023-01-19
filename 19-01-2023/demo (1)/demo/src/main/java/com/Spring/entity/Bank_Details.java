package com.Spring.entity;

public class Bank_Details {
	private String b_name;
	private String ename;
	private Account acc;

	public Bank_Details() {
		System.out.println("Def cons");
	}

	public Bank_Details(String b_name, String ename, Account acc) { 
		super();
		this.b_name = b_name;
		this.ename = ename;
		this.acc = acc;

	}

	public void display() { 
		System.out.println(b_name + " " + ename);
		System.out.println(acc.toString());
	}
}

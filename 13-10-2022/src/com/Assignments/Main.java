/*Write a java class to develop an employee class object & 
 initialized the emp name & emp Id for 5 Emp.now write
 another class having name and from this class having 
 name and from this class you have to create 5 employee 
 objects but you are not allowed to use new keyword */
package com.Assignments;
class Employee{
	static int empId;
	static String name;
	static void show(int id,String n) {
		empId=id;
		name=n;
		System.out.println(empId+" "+name);
	}
}

public class Main {

	public static void main(String[] args) {
		Employee.show(10,"Suvo");
		Employee.show(20,"Sudip");
		Employee.show(30,"Samir");
		Employee.show(70,"Suman");
		Employee.show(80,"Souvik");
		

	}

}

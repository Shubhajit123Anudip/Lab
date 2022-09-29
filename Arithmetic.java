
/*1. A class named Arithmetic with a method named add that takes integers as
parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic*/
package com.cognizant.shapes;

public class Arithmetic {//parent class
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}

}
class Adder extends Arithmetic{//child class
	void run() {
	System.out.println("the sum is");
}
}
/*write a java method to check whether every digit of a
 given integer is even.Return true if every digit is odd otherwise false*/
package com.java;

import java.util.Scanner;

public class EvenOdd {//class

	public static void main(String[] args) {//main method
		Scanner s=new Scanner(System.in);
		System.out.println("Input an Integer:");
		int n=s.nextInt();//input
		System.out.println(test(n));

	}

public static boolean test(int n) {//method to check the numbers are even or not 
	if(n==0) {//if loop
		return false;
	}
	while(n!=0) {//while loop
		if((n%10)%2!=0) {
			return false;
		}
		n/=10;
	}
	return true;
}
}
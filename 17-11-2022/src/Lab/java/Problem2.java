package Lab.java;
/*
 * Problem code 2:
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.
 */

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers=");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try 
		{
			if(x<0||y<0) {
		System.out.println("Exception occure");
			}
		else
			System.out.println("Product of x and y: "+(x*y));
		}catch (Exception e)
		{
		System.out.println(e);
			}
	}
	}


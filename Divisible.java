/*Write a Java program to print numbers between 1 to 100 which are divisible by 3,
 *  5 and by both.*/
package com.cognizant.shapes;

public class Divisible{

	public static void main(String[] args) {
		System.out.println("Number divisible by 3 are");
		 System.out.print("");
   for(int i=1;i<=100;i++) {
	   if(i%3==0) {
		   System.out.print(i+",");
		   System.out.print("");
		    }
   }
       System.out.println("");
       System.out.println("Number divided by 5 are");
	   for(int j=1;j<=100;j++) {
		   if(j%5==0) {
			  System.out.print(j+",");
			  System.out.print("");
		   }
	   }
	    System.out.println("");
	    System.out.println("Number divided by both 3 & 5 are");
			   for(int k=1;k<=100;k++) {
				   if(k%3==0 && k%5==0) {
		 			   System.out.print(k+", ");
		 			  System.out.print("");
		     }
	      }
	  
	   }
}
   
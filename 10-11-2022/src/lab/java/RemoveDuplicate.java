/* Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters 
 */
package lab.java;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String s="Anudip foundation Skill & career development centre";//1st string
		System.out.println(s);//printing the string
	    System.out.println("Enter the String");//getting the second string from user
		  
      String str2=sc.nextLine();//for 2nd string
		
		  char arr[] = new char[s.length()];//taking char array upto 1st string length
		  char[] String = new char[200];//taking another char array object
       for (int i = 0; i < str2.length(); i++)//loop up to 2nd string length
 String[str2.charAt(i)]++;
System.out.println("The new string is: ");//printing the new string after removing
  for (int i = 0; i < s.length(); i++) {//loop up to 1st string length
		if (String[s.charAt(i)] == 0) //check the charecters
		    System.out.print(s.charAt(i));//print the rest 
		  }
		  }
		 }

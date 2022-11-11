//Write a program which creates a StringBuffer “This is StringBuffer” and performs the following.
package lab.java;


public class Program2 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("This is StringBuffer");//object of string bufferclass
       s.append("This is sample program");
       System.out.println("String is:"+s);
       s.insert(22,"Object");
       System.out.println("Insert is: " + s);
		s.replace(14, 20, "Builder");// (begienwith, endswith, string s)
		System.out.println("Replace is: " + s);
		s.reverse(); // reversing he whole string
		System.out.println("Reverse is: " + s);

	}

}

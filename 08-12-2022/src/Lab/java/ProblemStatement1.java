package Lab.java;

import java.util.ArrayList;
import java.util.List;

public class ProblemStatement1 {

	public static void main(String[] args) {
		List<String>al=new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Black");
		//current list
		System.out.println("Current color list is:"+al);
		al.add(3,"Yellow");
		//updated list
		System.out.println("Updated color list is:"+al);
	}

}

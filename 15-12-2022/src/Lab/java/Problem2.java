package Lab.java;
import java.util.HashSet;
public class Problem2 {
	HashSet<String>H1=new HashSet(); //creating hashset
	HashSet<String> storeCountryNames(String CountryName) {// method 1
		H1.add("India");//adding vale
		H1.add("Bangladesh");
		H1.add("China");
		H1.add("USA");
		return H1;
	}
	
	  void  retrieveCountry(String CountryName) {//method 2
		if(H1.contains(CountryName)) { //check the country is present or not
			System.out.println(CountryName+": is present in hashset"); 
		}
		else {	
			System.out.println("null"); //if not present then print null
		}
	 }
	
	public static void main(String[] args) {
		Problem2 h=new Problem2(); //object of main class
		System.out.println("HashSet countries "+h.storeCountryNames(""));//print the country names by calling the method
		h.retrieveCountry("USA"); //retrive a country i.e USA
	
			}
}

package Lab.java;
import java.util.ArrayList;
import java.util.Iterator;


public class Problem1 {
	ArrayList<Integer> B1=new ArrayList<Integer>();
	 ArrayList<Integer> storeEvenNumbers(int N) {//1st method
		 for(int i=2;i<=N;i++) {  //For lop for even numbers
		if(i%2==0) { //logic for even numbers
			B1.add(i);
		}
		 }
		 return B1;	 
	 }
	 ArrayList<Integer> B2=new ArrayList<Integer>();

	 ArrayList<Integer> printEvenNumbers() {//2nd method
		Iterator<Integer> itr=B1.iterator(); //using iterator
		while(itr.hasNext()) {
			B2.add(itr.next()*2); //even numbers multiply by 2
		}	 
		 return B2;
	 }
	 void retrieveEvenNumber(int n){//3rd method
		 if(B1.contains(n)) {
			 System.out.println(n +": is present");
		 }
		 else {
			 System.out.println("zero");
		 }
	 }
	public static void main(String[] args) { //main method
		Problem1 m=new Problem1(); //creating object of main method

		System.out.println("Stored Even Numbers "+m.storeEvenNumbers(20)); //print even numbers till 20
		System.out.println("After multiping 2 "+m.printEvenNumbers()); //print even numbers After multiping 2
		m.retrieveEvenNumber(4); //retrive the even number i.e 4	
		 }
}

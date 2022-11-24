/*Create two threads to print even number and odd numbers from 1-100?
 Note:after printing of all even numbers only odd numbers should print */
package lab.com;

class PrintEvenThread implements Runnable {
   @Override
   public void run() {
	   System.out.println("All even no are");
	   //for printing even numbers
	   for(int i=1;i<=100;i++) {
		   if(i%2==0) {
		   System.out.println(i+"");   
		   }}}}
class PrintOddThread implements Runnable{
	   @Override
	   public void run() {
		   System.out.println("All odd no are");
		   //for printing odd numbers
		   for(int j=1;j<=100;j++) {
			   if(j % 2 !=0) {
			   System.out.println(j+"");
		   }}}}
    class MainThread{
	public static void main(String[] args) {
		PrintEvenThread obj1=new PrintEvenThread();
		Thread t1=new Thread(obj1);
		t1.start();//thread will start
		PrintOddThread obj2=new PrintOddThread();
		Thread t2=new Thread(obj2);
		t2.start();
	}
}

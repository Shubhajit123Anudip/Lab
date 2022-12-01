package Lab.java;
import java.io.FileInputStream;

public class FileIntoByteArray {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\Suvo.txt");//destination
		    byte arr[]=new byte[1024];
			int i=0;
			while((i=f.read())>0) {
				System.out.print((char)i);
			}
			}catch(Exception e) {
			System.out.println(e);
		}
	}
}

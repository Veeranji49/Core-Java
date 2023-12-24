package Basics;
import java.util.Scanner;
public class SumofTriangels {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter two triangels:");
		int p=x.nextInt();
		int q=x.nextInt();
		int r=180-(p+q);
		System.out.println(r);
		
	}

}

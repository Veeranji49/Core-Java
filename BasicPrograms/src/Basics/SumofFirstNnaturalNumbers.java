package Basics;
import java.util.Scanner;
public class SumofFirstNnaturalNumbers {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=x.nextInt();
		int sum=n*(n+1)/2;
		System.out.println(sum);
		
	}
}

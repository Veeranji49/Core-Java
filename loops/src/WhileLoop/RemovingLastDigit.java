package WhileLoop;

import java.util.Scanner;

public class RemovingLastDigit {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		int d=n/10;
		System.out.println(d);
	}

}

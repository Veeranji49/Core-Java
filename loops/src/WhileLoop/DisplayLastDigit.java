package WhileLoop;

import java.util.Scanner;

public class DisplayLastDigit {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=s.nextInt();
		int d=n%10;
		System.out.println(d);
	}

}

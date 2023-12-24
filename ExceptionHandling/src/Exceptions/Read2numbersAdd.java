package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read2numbersAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid data");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:Denominator should not be zero");
		}
		finally
		{
			System.out.println("hello");
		}
	}

}

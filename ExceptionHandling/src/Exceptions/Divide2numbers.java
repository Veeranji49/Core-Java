package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Divide2numbers {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter 2 numbers:");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println("Result:"+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception:Invalid values");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:Denominator");
		}
	}

}

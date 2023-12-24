package ClassTest;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinallyBlock {
	public static void main(String[] args)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Add 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception:Invalid input given");
		}
		finally
		{
			System.out.println("correct");
		}
		
	}

}

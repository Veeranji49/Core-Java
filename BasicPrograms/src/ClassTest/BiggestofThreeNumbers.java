package ClassTest;
import java.util.Scanner;
public class BiggestofThreeNumbers {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a!=b||b!=c||c!=a)
		{
		if(a>b&&a>c)
		{
			System.out.println("a is big");
		}
		else if(b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}
		}
		else
		{
			System.out.println("Not unique");
		}
	}

}

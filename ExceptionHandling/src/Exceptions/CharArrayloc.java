package Exceptions;
import java.util.Scanner;
public class CharArrayloc {
	public static void main(String[] args)
	{
		Scanner y=new Scanner(System.in);
		try
		{
			char[] arr= {'9','3','5','2','1','6'};
			System.out.println("Enter 2 locations:");
			int loc1=y.nextInt();
			int loc2=y.nextInt();
			int a=arr[loc1]-48;
			int b=arr[loc2]-48;
			int c=a/b;
			System.out.println("found location:"+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception:Invalid values");
		}
		
	}

}

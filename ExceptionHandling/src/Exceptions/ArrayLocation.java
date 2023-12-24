package Exceptions;
import java.util.Scanner;
public class ArrayLocation {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);

		int[] arr= {10,20,30,40,50};
		System.out.println("Enter location to display");
		int loc=x.nextInt();
		System.out.println(arr[loc]);

	}

}

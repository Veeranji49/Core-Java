package Forloop;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=s.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}

}

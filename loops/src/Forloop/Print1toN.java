package Forloop;
import java.util.Scanner;
public class Print1toN {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=x.nextInt();
		for(int i=1; i<=n;i++)
		{
			System.out.println(i);
		}
	}

}

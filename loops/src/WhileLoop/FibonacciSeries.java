package WhileLoop;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto number:");
		int a=0,b=1,c;
		int n=sc.nextInt();
		System.out.println(a+","+b+",");
			for(int i=1; i<=n; i++)
			{
				
				int c1=a+b;
				System.out.println(c1+",");
				a=b;
				b=c1;
			}
		}
	}


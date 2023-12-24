package Basics1;
import java.util.Scanner;
public class ThirdAngleinaTriangle {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two angles of Triangles:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=180-(a+b);
		System.out.println(c);
	}

}

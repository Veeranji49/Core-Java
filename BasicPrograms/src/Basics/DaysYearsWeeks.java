package Basics;

import java.util.Scanner;

public class DaysYearsWeeks {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Days:");
		int days=sc.nextInt();
		int years=days/365;
		int weeks=(days*365)/7;
		int day=days-((years*365)+(weeks*7));
		System.out.println("day:"+day+"Weeks:"+weeks+"years:"+years);
	}

}

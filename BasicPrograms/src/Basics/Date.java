package Basics;

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days:");
		int days=sc.nextInt();
		int years=days/365;
		int weeks=(days%365)/7;
		int days1=days-((years*365)+(weeks*7));
		System.out.println(years+"years"+weeks+"weeks"+days1+"days");
	}

}

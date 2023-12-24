package Basics;

public class Swap2numberswithout3rd {
	public static void main(String[] args) {
		int a=4,b=6;
		System.out.println("Before swap:"+a+","+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swap:"+a+","+b);
	}

}

package Basics;

public class Swap2Numbers {
	public static void main(String[] args) {
		int a=3,b=5;
		System.out.println("Before Swap:"+a+","+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swap:"+a+","+b);
	}

}

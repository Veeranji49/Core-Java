package Basics;
import java.util.Scanner;
public class quantityperDozensincost {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter dozen bananas:");
		double cost=x.nextDouble();
		System.out.println("Enter quantity:");
		double quantity=x.nextDouble();
		double amount=(quantity/12)*cost;
		System.out.println(amount);
				
	}

}

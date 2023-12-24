package ClassTest;
import java.util.Scanner;
public class SumofLargestandSmallestDigit {
	public static void main(String[] args)
	{
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int number = scanner.nextInt();

		    int smallest = 9;
		    int largest = 0;

		    while (number > 0) {
		      int digit = number % 10;
		      smallest = Math.min(smallest, digit);
		      largest = Math.max(largest, digit);
		      number /= 10;
		    }

		    int sum = smallest + largest;
		    System.out.println("Sum of smallest and largest digit: " + sum);
		  }


	}


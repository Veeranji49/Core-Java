package StringsProblems;
import java.util.Scanner;
public class UppertoLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			char y=(char)(ch+32);
			System.out.println(y);
		}
	}
}

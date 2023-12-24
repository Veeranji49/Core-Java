package StringsProblems;
import java.util.Scanner;
public class charisvowelorNot {
	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter character:");
		 * char n=sc.next().charAt(0); if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
		 * System.out.println("It is vowel"); } else {
		 * System.out.println("It is not vowel"); }
		 */
		
		/*
		 * String s="abdlfjs@47209gjj;ledAITW@"; for(int i=0; i<=s.length()-1; i++) {
		 * char y=s.charAt(i);
		 * if((y=='a'||y=='e'||y=='i'||y=='o'||y=='u')||(y=='A'||y=='E'||y=='I'||y=='O'|
		 * |y=='U')) { System.out.println(y); } }
		 */
		
		String s="afjkruwezxm@#&%860447116";
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
			{
				System.out.println(y);
			}
		}
	}
}

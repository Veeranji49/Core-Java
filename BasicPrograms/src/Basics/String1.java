package Basics;

public class String1 {
	public static void main(String[] args) {
		String s="Python language";
		for(int i=0; i<=s.length()-1; i++)
		{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
		{
			System.out.println(ch);
		}
	}

}
}

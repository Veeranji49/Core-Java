package Givennumber;

public class PalindromeNumberorNot 
	{
	public static void main(String[] args)
	{
		int n=3663;
		
		int rev=0;
		int x=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(x==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}

}

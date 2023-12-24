package Givennumber;

public class CountNoofDigits {
	public static void main(String[] args) 
	{
		int n=6251;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		
	}

}

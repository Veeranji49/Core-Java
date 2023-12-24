package Givennumber;

public class EvensumOddsum {
	public static void main(String[] args)
	{
		int n=16437495;
		int even=0;
		int odd=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				even=even+d;
			}
			else
			{
				odd=odd+d;
			}
			n=n/10;
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}

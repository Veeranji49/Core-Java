package Givennumber;

public class PerfectNumberOrNot {
	public static void main(String[] args)
	{
		int n=6;
		int sum=0;
		for(int i=1; i<=n-1; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}

}

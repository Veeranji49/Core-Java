package Givennumber;

public class Leastdigit {
	public static void main(String[] args)
	{
		int n=274189;
		int least=9;
		while(n!=0)
		{
			int d=n%10;
			if(d<least)
			{
				least=d;
			}
			n=n/10;
		}
		System.out.println(least);
	}

}

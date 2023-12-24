package WhileLoop;

public class SumofFirstandLast {
	public static void main(String[] args)
	{
		int n=12345;
		int first=n%10;
		 n=n/10;
		while(n>=10)
		{
			n=n/10;
		}
		int last=n%10;
		System.out.println(first+last);
	}
}

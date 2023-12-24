package WhileLoop;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int x=n;
		while(n!=0)
		{
			int d=n%10;
			int fact=1; 
			for(int i=1; i<=d; i++)
			{
				fact =fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(x==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}

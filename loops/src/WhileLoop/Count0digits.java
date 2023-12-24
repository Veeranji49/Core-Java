package WhileLoop;

public class Count0digits {
	public static void main(String[] args) {
		int n=12340120;
		int count=0,r;
		while(n!=0)
		{
			r=n%10;
			if(r==0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}

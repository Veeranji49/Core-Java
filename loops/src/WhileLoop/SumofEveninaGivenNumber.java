package WhileLoop;

public class SumofEveninaGivenNumber {
	public static void main(String[] args) {
		int n=123456789;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			if(r%2==0)
			{
				sum=sum+r;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}

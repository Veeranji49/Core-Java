package WhileLoop;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=123456;
		while(n!=0)
		{
			System.out.print(n%10);
			n=n/10;
		}
	}

}

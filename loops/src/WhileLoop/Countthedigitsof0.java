package WhileLoop;

public class Countthedigitsof0 {
	public static void main(String[] args) {
		int n= 24340;
		int count=0;
		while(n!=0)
		{
			int r=n%10;
			if(r==0)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}

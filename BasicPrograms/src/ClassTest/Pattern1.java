package ClassTest;

public class Pattern1 {
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print(k);
			}
			for(int l=1+1; l<=i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}

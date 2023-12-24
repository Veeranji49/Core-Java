package PatternPro;

public class Pattern19 {
	public static void main(String[] args)
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				if(i%2==0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}

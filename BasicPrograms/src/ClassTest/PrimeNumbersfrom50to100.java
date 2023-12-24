package ClassTest;

public class PrimeNumbersfrom50to100 {
	public static void main(String[] args)
	{
		for(int i=50; i<=100; i++)
		{
			int count=0; 
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}

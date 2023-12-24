package Forloop;

public class CountFactorsofNumber {
	public static void main(String[] args) {
		int n=15;
		int count=0;
		for(int i=1; i<=15; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

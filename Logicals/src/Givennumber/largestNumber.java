                                                                                                                                                                                                                                      package Givennumber;

public class largestNumber {

	public static void main(String[] args) {
		int n=2353738;
		int large=0;
		while(n!=0)
		{
			int d=n%10;
			if(d>large)
			{
				large=d;
			}
			n=n/10;
		}
		System.out.println(large);
	}

}

package StringsProblems;

public class LowerDigitInaString 
{
	public static void main(String[] args) 
	{
		String s="123456";
		int smallest=s.length();
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int y=ch-48;
				if(y<smallest)
				{
					smallest=y;
				}
			}
		}
		System.out.println(smallest);
	}
}

package StringsProblems;

public class SumofDigitsintheString {
	public static void main(String[] args) {
		String s="abce123456789";
		/*int sum=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			if(y>='0'&&y<='9')
			{
				sum=sum+(y-48);
			}
		}
		System.out.println(sum);
	}
}*/
		int sum=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			if(y>='0'&&y<='9')
			{
				char x=(char)(y-48);
				sum=sum+x;
				
			}
		}
		System.out.println(sum);
		
		
		
	}
}

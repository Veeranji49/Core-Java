package StringsProblems;

public class HighestDigitinString {
	public static void main(String[] args) {
		String s="abc@123957";
		int highest=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int y=ch-48;
				if(y>highest)
				{
					highest=y;
				}
			}
		}
		System.out.println(highest);
	}
}

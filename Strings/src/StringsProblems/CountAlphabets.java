package StringsProblems;

public class CountAlphabets {
	public static void main(String[] args) {
		String s="abcedhdyr2635@3283";
		int count=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			if(y>='A'&&y<='Z'||y>='a'&&y<='z')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

package StringsProblems;

public class AlphabetsintheString {
	public static void main(String[] args) {
		/*
		 * String s="abce@Afir123"; for(int i=0; i<=s.length()-1; i++) { char
		 * y=s.charAt(i); if(y>='a'&&y<='z'||y>='A'&&y<='Z') { System.out.println(y); }
		 * }
		 */
		
		String s="abcesd@231639AHFS";
		for(int i=0; i<=s.length()-1; i++)
		{
			char j=s.charAt(i);
			if(j>='a'&&j<='z'||j>='A'&&j<='Z')
			{
				System.out.println(j);
			}
		}
	}
}

package StringsProblems;

public class ASCIIvaluesofString {
	public static void main(String[] args) {
		String s="Veeranji";
		/*
		 * for(int i=0; i<=s.length()-1; i++) { char y=s.charAt(i);
		 * System.out.println(i+"="+(int)y); }
		 */
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			System.out.println(i+"="+(int)y);
		}
	}
}

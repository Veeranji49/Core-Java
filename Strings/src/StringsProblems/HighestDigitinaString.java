package StringsProblems;

public class HighestDigitinaString {
	public static void main(String[] args) {
		String s="123456";
		int highest=0;
		/*
		 * for(int i=0; i<=s.length()-1; i++) { char y=s.charAt(i); if(y>='0'&&y<='9') {
		 * int x=(int)(y-48); if(x>highest) { highest=x; } } }
		 * System.out.println(highest);
		 */
		for(int i=0; i<=s.length()-1; i++)
		{
			char y=s.charAt(i);
			if(y>='0'&&y<='9')
			{
				int x=(int)(y-48);
				if(x>highest)
				{
					highest=x;
				}
			}
			
		}
		System.out.println(highest);
	}
}

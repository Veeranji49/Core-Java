package StringsProblems;

public class CountAll {
	public static void main(String[] args) {
		/*
		 * char[] arr= {'1','2','a','t','5','#','*'}; int c1=0,c2=0,c3=0; for(int i=0;
		 * i<=arr.length-1; i++) { char y=arr[i]; if(y>='a'&&y<='z'||y>='A'&&y<='Z') {
		 * c1++; } else if(y>='1'&&y<='9') { c2++; } else { c3++; } }
		 * System.out.println(c1); System.out.println(c2); System.out.println(c3);
		 */
	
		String s="afjs@978w0r7wAFAHSSK%#*&&*@";
		int count1=0, count2=0,count3=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char x=s.charAt(i);
			if((x>='a'&&x<='z')||(x>='A'&&x<='Z'))
			{
				count1++;
			}
			else if(x>='0'&&x<='9')
			{
				count2++;
			}
			else
			{
				count3++;
			}
		}
		System.out.println("Alphabets:"+count1);
		System.out.println("Digits:"+count2);
		System.out.println(count3);
	
	}

}

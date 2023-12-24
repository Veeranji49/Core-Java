package StringsProblems;

public class StringtoCharArray1 {
	public static void main(String[] args) {
		String s="abc@123";
		char[] arr=new char[s.length()];
		for(int i=0; i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		System.out.println("Character Array:");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

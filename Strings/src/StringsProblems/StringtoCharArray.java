package StringsProblems;

public class StringtoCharArray {
public static void main(String[] args) {
	/*
	 * String s="abc@123"; char[] arr=new char[s.length()]; for(int i=0;
	 * i<=s.length()-1; i++) { arr[i]=s.charAt(i); } System.out.println("Array:");
	 * for(int i=0; i<=arr.length-1; i++) { System.out.println(arr[i]); }
	 */
	
	String s="!%#^&#6236shflh";
	char[] arr=new char[s.length()];
	for(int i=0; i<=s.length()-1; i++)
	{
		arr[i]=s.charAt(i);
	}
	System.out.println("Array:");
	for(int i=0; i<=arr.length-1; i++)
	{
		System.out.print(arr[i]);
	}
}
}

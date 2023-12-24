package StringsProblems;

public class StringofArrLength {
	public static void main(String[] args) {
		String[] arr= {"abc@123","73dgjs","sfdhldfy"};
		for(int i=0; i<=arr.length-1; i++)
		{
			String s=arr[i];
			System.out.println(s.length());
		}
	}
}

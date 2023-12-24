package StringsProblems;

public class Split {
	public static void main(String[] args) {
		String s="Family is Everything";
		String[] arr=s.split(" ");
		for(String x:arr)
		{
			for(int i=0; i<=x.length()-1; i++)
			{
				System.out.print(x.charAt(i));
			}
		
		}
}
}
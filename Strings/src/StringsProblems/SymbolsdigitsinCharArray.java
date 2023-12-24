package StringsProblems;

public class SymbolsdigitsinCharArray {
	public static void main(String[] args) {
		char[] arr= {'2','3','5','7','9'};
		System.out.println("Display digits:");
		for(int i=0; i<=arr.length-1; i++)
		{
			char y=arr[i];
			if(y>='0'&&y<='9')
			{
				System.out.println(y);
			}
		}
	}
}

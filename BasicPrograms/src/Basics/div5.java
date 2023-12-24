package Basics;

public class div5 {
	public static void main(String[] args) {
		int[] arr= {12,15,27,20,5};
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}

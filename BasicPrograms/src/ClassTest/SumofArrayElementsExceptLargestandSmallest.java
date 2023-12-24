package ClassTest;

public class SumofArrayElementsExceptLargestandSmallest {
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0; i<=arr.length-1; i++)
		{
			sum=sum+arr[i];
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		 sum=sum-largest-smallest;
		 System.out.println(sum);
	}

}

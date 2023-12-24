package StringsProblems;

public class DisplayStringofArrinReverse {
	public static void main(String[] args) {
			String[] arr= {"bade123","3463kd","djdf89w"};
			for(int i=0; i<=arr.length-1; i++)
			{
				String s=arr[i];
				for(int i1=s.length()-1; i1>=0; i1--)
				{
					System.out.print(s.charAt(i1));
				}
				System.out.println();
			}
		}
}

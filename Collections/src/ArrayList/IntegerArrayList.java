package ArrayList;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		/*for(int i=0; i<=list.size()-1; i++)
		{
			System.out.print(list.get(i)+" ");
		}*/
		for(Integer x:list)																											
		{
			System.err.println(x);
		}
	}

}

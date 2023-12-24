package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		System.out.println("unsorted Arraylist:"+list);
		Collections.sort(list);
		System.out.println("sorted ArrayList:"+list);
	}

}

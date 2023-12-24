package ArrayListMethods;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);//To add an element
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ArrayList<Integer> solo=new ArrayList<Integer>();
		solo.add(1);
		solo.add(2);
		solo.add(3);//To add an element
		solo.add(4);
		solo.add(5);
		solo.add(6);
		
		System.out.println(list.size());
		System.out.println();
		System.out.println(solo);//Display
		System.out.println(list);//Display
		System.out.println(list.contains(6));//The element is there or not
		System.out.println(list.containsAll(solo));//Contains
		System.out.println(list.isEmpty());//List is empty or not
		list.addAll(solo);//To add All elements of solo to the list
		System.out.println(list);
		solo.set(3, 7);//To update an element
		System.out.println(solo);
		System.out.println(solo.get(0));//To Retrieve an element
		list.clear();
		System.out.println(list);
	}

}

package Vector;

import java.util.*;
public class Vector1 {
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);//To add the elements
		v.add(2);
		v.add(9);
		v.add(7);
		v.add(5);
		v.add(4);
		
		Vector<Integer> u=new Vector<>();
		u.add(3);
		u.add(5);
		u.add(6);
		u.add(7);
		u.add(9);
		System.out.println(u);//Display
		System.out.println(u.size());//index size
		System.out.println(u.isEmpty());//The index is empty or not
		System.out.println(v);//Display
		System.out.println(v.size());//index size
		System.out.println(v.capacity());//capacity
		System.out.println(v.get(1));//To Retrieve/Select
		v.remove(5);
		System.out.println(v);//To delete one location
		System.out.println(v.contains(4));//Element is there are not
		v.set(0,6);
		System.out.println(v);//To update an element,index must be specifeid.
		System.out.println(v.indexOf(5));//To find index of element
		System.out.println(v.lastElement());//To find Last Element
		System.out.println(v.firstElement());//To find first Element
		System.out.println(v.isEmpty());//List is Empty or Not
		System.out.println(v.containsAll(u));
		u.set(0,4);//To Update an element
		System.out.println(u);
		
		System.out.println(v.removeAll(u));//To remove all elements
		v.clear();//To clear all elements
		System.out.println(v);
		
		
	}

}

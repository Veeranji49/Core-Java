package ArrayList;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args)
	/*
	 * public static void main(String[] args) { ArrayList<Integer> list=new
	 * ArrayList<Integer>(); list.add(1); list.add(2); list.add(2); list.add(3);
	 * list.add(5); System.out.println(list);
	 * 
	 * Set<Integer> s=new TreeSet<Integer>(list);
	 * 
	 * System.out.println(s); }
	 */
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(2);
		System.out.println(list);
		
		Set<Integer> set=new TreeSet<Integer>(list);
		System.out.println(set);
	}
}

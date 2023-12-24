package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class MenuDrivenProgramonArrayList {
	private static final int case1 = 0;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		while(true)
		{
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.Retrieve an element");
			System.out.println("4.check element is present");
			System.out.println("5.sort the ArrayList");
			System.out.println("6.Reverse the ArrayList");
			System.out.println("7.Check the ArrayList is empty");
			System.out.println("8.clear the ArrayList");
			System.out.println("9.size of the ArrayList");
			System.out.println("10.print the ArrayList");
			System.out.println("11.Exit");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter element:");
				int element=sc.nextInt();
				list.add(element);
				System.out.println("Element is added to ArrayList.");
				break;
				
			case 2:
				System.out.println("Enter index of the element to remove:");
				int index=sc.nextInt();
				if(index>=0&&index<=list.size())
				{
					list.remove(index);
					System.out.println("Removed from ArrayList");
				}
				else
				{
					System.out.println("Invalid Index");
				}
				break;
				
			case 3:
				System.out.println("Enter the index of the element to retrive:");
				int loc=sc.nextInt();
				if(loc>0&&loc<=list.size())
				{
					int retrieveElement=list.get(loc);
					System.out.println(loc+retrieveElement);
				}
				else
				{
					System.out.println("Invalid index");
				}
				break;
			case 4:
				System.out.println("Enter ele:");
				int ele=sc.nextInt();
				boolean res=list.contains(ele);
				System.out.println("ArrayList Contains:"+ele+":"+res);
				break;
			}
		}
	}

}

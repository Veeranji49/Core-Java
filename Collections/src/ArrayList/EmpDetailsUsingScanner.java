package ArrayList;
import java.util.*;
public class EmpDetailsUsingScanner {
	public static void main(String[] args)
	{
		ArrayList<Empl> list=new ArrayList<Empl>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Employee details:");
		
		for(int i=1; i<=5;i++)
		{
			System.out.println("Enter Emp"+i+"details");
			int id=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			
			Empl e=new Empl(id,name,salary);
			list.add(e);
		}
		System.out.println("Details are:");
		for(Empl e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
		}
	}

}
class Empl
{
	int id;
	String name;
	double salary;
	
	Empl(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

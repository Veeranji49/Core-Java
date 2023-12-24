package ArrayList;
import java.util.Scanner;
import java.util.*;
public class EmpDetailsbyScanner {
	/*public static void main(String[] args)
	{
		ArrayList<Emp11> list=new ArrayList<Emp11>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Employee details:");
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter emp"+i+"details");
			int id=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			
			Emp11 e=new Emp11(id,name, salary);
			list.add(e);
		}
		System.out.println("Details are:");
		for(Emp11 e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
		}
	}
	
}
class Emp11
{
	int id;
	String name;
	double salary;
	
	Emp11(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

	public static void main(String[] args) {
		ArrayList<Hostel> list=new ArrayList<Hostel>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Hostel details:");
		for(int i=1; i<=3; i++)
		{
			System.out.println("Hostel"+i+"details");
			int id=sc.nextInt();
			String name=sc.next();
			double fees=sc.nextDouble();
			
			Hostel h=new Hostel( id, name, fees);
			list.add(h);
			
		}
		System.out.println("Details are:");
		for(Hostel h:list)
		{
			System.out.println(h.id+h.name+h.fees);
		}
	}
}
class Hostel
{
	int id;
	String name;
	double fees;
	
	Hostel(int id,String name,double fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
	}*/
	public static void main(String[] args) {
		
		ArrayList<Cloth> list=new ArrayList<Cloth>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee details:");
		for(int i=1; i<=3;i++)
		{
			System.out.println("Enter employee"+i+"details");
			int id=sc.nextInt();
			String name=sc.next();
			double cost=sc.nextDouble();
			
			Cloth c=new Cloth(id,name,cost);
			list.add(c);
		}
		
		for(Cloth c:list)
		{
			System.out.println(c.id+c.name+c.cost);
		}
	}
}
	
class Cloth
{
	int id;
	String name;
	double cost;
	
	Cloth(int id,String name,double cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
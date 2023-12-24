package ArrayList;
import java.util.*;
public class Listof3EmpDetails {
	public static void main(String[] args)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		/*
		Employee e1=new Employee(101,"anji",26000);
		Employee e2=new Employee(102,"veeru",27000);
		Employee e3=new Employee(103,"veeranji",28000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		*/
		
		list.add(new Employee(1,"anji",25000));
		list.add(new Employee(2,"veeru",26000));
		list.add(new Employee(3,"veeranji",27000));
		System.out.println("Details are:");
		for(Employee e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);		
		}
	}
}
class Employee
{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void details()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
}

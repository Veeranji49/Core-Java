package ArrayList;
import java.util.*;
public class PoJoClassDetails {
	public static void main(String[] args)
	{
		int[] ids= {1,2,3};
		String[] names= {"anji","veeru","cristiano"};
		double[] salary= {10000,20000,30000};
		
		ArrayList<Pojo> list=new ArrayList<Pojo>();
		for(int i=0; i<=ids.length-1; i++)
		{
			Pojo p=new Pojo();
			p.setId(ids[i]);
			p.setName(names[i]);
			p.setSalary(salary[i]);
			list.add(p);
		}
		System.out.println("Details are:");
		for(Pojo p:list)
		{
			System.out.println(p.getId()+","+p.getName()+","+p.getSalary());
		}
	}
}
class Pojo
{
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
}

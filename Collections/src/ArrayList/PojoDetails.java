package ArrayList;
import java.util.*;
public class PojoDetails 
{
	public static void main(String[] args)
	{
		int[] Id= {101,102,103,104,105,106};
		String[] Name= {"Amar","Hareen","Sathya","Annie","Raji","Harsha"};
		double[] Salary= {30000,35000,40000,45000,42000,50000};
		int[] Dept= {20,10,20,20,30,10};
		String[] Location= {"Hyderabad","Chennai","Banglore","Hyderabad","Pune","Banglore"};
		
		ArrayList<Employe> list=new ArrayList<Employe>();
		for(int i=0; i<=Id.length-1; i++)
		{
			Employe e=new Employe();
			e.setId(Id[i]);
			e.setName(Name[i]);
			e.setSalary(Salary[i]);
			e.setDept(Dept[i]);
			e.setLocation(Location[i]);
			list.add(e);
		}
		System.out.println("Details are:");
		for(Employe e:list)
		{
			System.out.println(e.getId()+","+e.getName()+","+e.getSalary()+","+e.getDept()+","+e.getLocation());
		}
	}
}
class Employe
{
	private int Id;
	private String Name;
	private double Salary;
	private int Dept;
	private String Location;
	
	public void setId(int Id)
	{
		this.Id=Id;
	}
	public int getId()
	{
		return this.Id;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setSalary(double Salary)
	{
		this.Salary=Salary;
	}
	public double getSalary()
	{
		return this.Salary;
	}
	public void setDept(int Dept)
	{
		this.Dept=Dept;
	}
	public int getDept()
	{
		return this.Dept;
	}
	public void setLocation(String Location)
	{
		this.Location=Location;
	}
	public String getLocation()
	{
		return this.Location;
	}
}

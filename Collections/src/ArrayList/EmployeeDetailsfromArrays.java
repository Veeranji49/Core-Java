package ArrayList;
import java.util.*;

public class EmployeeDetailsfromArrays {
	public static void main(String[] args)
	{
		int[] ids= {1,2,3,4,5};
		String[] names= {"anji","veeru","saroja","mallikarjuna","laxmi"};
		double[] salary= {20000,30000,40000,50000,60000};
		
		ArrayList<Emp12> list=new ArrayList<Emp12>();
		for(int i=0; i<=ids.length-1; i++)
		{
			Emp12 e=new Emp12(ids[i],names[i],salary[i]);
			list.add(e);
		}
		System.out.println("Details are:");
		for(Emp12 e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
		}
	}

}
class Emp12
{
	int id;
	String name;
	double salary;
	Emp12(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
}

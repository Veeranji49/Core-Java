package ArrayList;
import java.util.*;
public class ThreeEmpDetailsList {
	public static void main(String[] args)
	{
		int[] ids= {1,2,3};
		String[] names= {"anji","veeru","veeranji"};
		double[] salary= {21000,22000,23000};
		
		ArrayList<Em> list=new ArrayList<>();
		for(int i=0; i<=ids.length-1; i++)
		{
			Em e=new Em(ids[i],names[i],salary[i]);
			list.add(e);
		}
		System.out.println("Details are:");
		for(Em e:list)
		{
			System.out.println(e.id+","+e.name+","+e.salary);
		}
	}
}
class Em
{
	int id;
	String name;
	double salary;
	
	Em(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
}

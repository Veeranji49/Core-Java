package ArrayList;

import java.util.ArrayList;

public class ListofEmplyoees {
	public static void main(String[] args)
	{
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"Anji",25000) );
		list.add(new Emp(2,"Veeru",30000));
		list.add(new Emp(3,"Anitha",32000));
		/*for(int i=0; i<=list.size()-1; i++)
		{
			Emp e=list.get(i);
			e.details();
		}
		*/
		for(Emp e:list)
		{
			e.details();
		}
		
	}

}
class Emp
{
	int id;
	String name;
	double salary;
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void details()
	{
		System.out.println(this.id+","+this.name+","+this.salary);
	}
}

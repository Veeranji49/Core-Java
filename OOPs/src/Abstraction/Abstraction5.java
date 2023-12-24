package Abstraction;

public class Abstraction5 {
	public static void main(String[] args)
	{
		CristianoJr c=new CristianoJr("Cristiano Jr.",13,200000,"Portugal");
		c.display();
	}

}
abstract class Cristiano
{
	String name;
	int age;
	double networth;
	Cristiano(String name,int age,double networth)
	{
		this.name=name;
		this.age=age;
		this.networth=networth;
	}
	abstract void display();
}
class CristianoJr extends Cristiano
{
	String team;
	
	CristianoJr(String name, int age, double networth,String team)
	{
		super(name, age, networth);
		this.team=team;
	}
	void display()
	{
		System.out.println("Enter Cristiano son name:"+super.name);
		System.out.println("Enter Cristiano son age:"+super.age);
		System.out.println("Enter Cristiano networth:"+super.networth);
		System.out.println("Enter Cristiano team"+this.team);
	}
	
}


package Abstraction;

public class Abstraction {
	public static void main(String[] args) 
	{
		Child c=new Child(10,20);
		c.display();
		
	}

}
abstract class Parent
{
	int a;
	Parent(int a)
	{
		this.a=a;
	}
	abstract void display();
}
class Child extends Parent
{
	int b;
	Child(int a,int b)
	{
		super(a);
		this.b=b;
	}
	void display()
	{
		System.out.println("a="+super.a);
		System.out.println("b="+this.b);
	}
	
}

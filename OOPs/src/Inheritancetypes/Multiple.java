package Inheritancetypes;

public class Multiple {
	public static void main(String[] args)
	{
		CD obj=new CD();
		obj.execute1();
		obj.execute2();
	}

}
interface AB
{
	public abstract void execute1();
}
interface BC
{
	public abstract void execute2();
}
class CD implements AB,BC
{
	public void execute1()
	{
		System.out.println("hi  I am from A");
	}
	public void execute2()
	{
		System.out.println("hi i am from B");
	}
}

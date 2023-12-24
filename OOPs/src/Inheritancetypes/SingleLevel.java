package Inheritancetypes;

public class SingleLevel {
	public static void main(String[] args)
	{
		child c=new child();
		c.play();
		c.eat();
	}

}
class Parent
{
	public void eat()
	{
		System.out.println("Eating");
	}
}
class child extends Parent
{
	public void play()
	{
		System.out.println("playing");
	}
}

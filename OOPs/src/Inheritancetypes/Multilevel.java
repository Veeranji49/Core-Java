package Inheritancetypes;

public class Multilevel {
	public static void main(String[] args)
	{
		c obj=new c();
		obj.Recycle();
		obj.Reuse();
		obj.Return();
	}
	

}
class A
{
	public void Recycle()
	{
		System.out.println("Recycling");
	}
}
class B extends A
{
	public void Reuse()
	{
		System.out.println("Reusing");
	}
}
class c extends B
{
	public void Return()
	{
		System.out.println("Returning");
	}
}

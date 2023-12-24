package Inheritancetypes;

public class Multiple2 {
	public static void main(String[] args)
	{
		done d=new done();
		d.safety(16);
	}

}
interface bag
{
	public abstract void safety(int num);
}
interface almirah
{
	public abstract void safety(int num);
}
class done implements bag,almirah
{
	public void safety(int num)
	{
		System.out.println("Safety and secure...");
	}
}

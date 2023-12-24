package Inheritancetypes;

public class Hybrid3 {
	public static void main(String[] args)
	{
		praveen p=new praveen();
		p.show();
		p.java();
	}

}
class vinay
{
	public void oracle()
	{
		System.out.println("Oracle Developer");
	}
}
interface raghu
{
	public void show();
}
interface veer
{
	public void show();
}
class praveen extends vinay implements raghu,veer
{
	public void show()
	{
		System.out.println("This is from show method");
	}
	public void java()
	{
		System.out.println("Java developer");
	}
	
}

package Inheritancetypes;

public class Hybrid1 {
	public static void main(String[] args)
	{
		anjijr jr=new anjijr();
		jr.Love();
	}
}
class Amma
{
	public void Love()
	{
		System.out.println("love");
	}
}
class anji extends Amma
{
	public void Love()
	{
		System.out.println("care");
	}
}
class veeru extends Amma
{
	public void Love()
	{
		System.out.println("affection");
	}
}
class anjijr extends anji
{
	public void Love()
	{
		System.out.println("Loving");
	}
}

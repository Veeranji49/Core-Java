package ClassTest;

public class AbstractClass {
	public static void main(String[] args)
	{
		Veeru v=new Veeru(1,"anji",5000,true);
		v.display();
	}

}
abstract class Anji
{
	int id;
	String name;
	double fee;
	Anji(int id,String name, double fee)
	{
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	abstract void display();
}
class Veeru extends Anji
{
	boolean ishealthy;
	Veeru(int id,String name,double fee,boolean ishealthy)
	{
		super(id, name, fee);
		this.ishealthy=ishealthy;
	}
	void display()
	{
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.fee);
		System.out.println(this.ishealthy);
	}
}

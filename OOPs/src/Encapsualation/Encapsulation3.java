package Encapsualation;

public class Encapsulation3 {
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.setName("Togo");
		d.setIds(223);
		d.setCosts(200000.00);
		String name=d.getName();
		int ids=d.getIds();
		double costs=d.getCosts();
		System.out.println("Name of dog:"+name);
		System.out.println("Id of dog:"+ids);
		System.out.println("Cost of dog:"+costs);

	}
}
class Dog
{
	private String name;
	private int ids;
	private double costs;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setIds(int ids)
	{
		this.ids=ids;
	}
	public int getIds()
	{
		return this.ids;
	}
	public void setCosts(double costs)
	{
		this.costs=costs;
	}
	public double getCosts()
	{
		return this.costs;
	}

}

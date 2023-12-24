package SetandGet;

public class EmployeeDetails {
	public static void main(String[] args) {
		Emp.setFee(25000);
		Emp e=new Emp();
		e.setId(101);
		e.setName("Anji");
		double fee=Emp.getFee();
		int id=e.getId();
		String name=e.getName();
		System.out.println(id);
		System.out.println(name);
		System.out.println(fee);
		
	}

}
class Emp
{
	int id;
	String name;
	static double fee;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static void setFee(double fee)
	{
		Emp.fee=fee;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public static double getFee()
	{
		return Emp.fee;
	}
}

package Encapsualation;
class Encapsulation1 {
	public static  void main(String[] args)
	{
		Anji a=new Anji();
		a.setRoomno(106);
		a.setName("Anji");
		a.setFee(5000);
		a.setCourse("Java Full Stack");
		int Roomno=a.getRoomno();
		String name=a.getName();
		double fee=a.getFee();
		String course=a.getCourse();
		System.out.println("Candidate Roomno:"+Roomno);
		System.out.println("Candidate  Name:"+name);
		System.out.println("Candidate fee:"+fee);
		System.out.println("Candidate course:"+course);
	}

}
class Anji
{
	private int Roomno;
	private String name;
	private double fee;
	private String course;
	public void setRoomno(int Roomno)
	{
		this.Roomno=Roomno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public int getRoomno()
	{
		return this.Roomno;
	}
	public String getName()
	{
		return this.name;
	}
	public double getFee()
	{
		return this.fee;
	}
	public String getCourse()
	{
		return this.course;
	}
}

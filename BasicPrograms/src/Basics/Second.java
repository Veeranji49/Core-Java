package Basics;

public class Second extends First{
	int y;
public Second(int a,int y) {
	super(a);
	this.y=y;
}
void details()
{
	System.out.println(super.a);
	System.out.println(this.y);
}
}


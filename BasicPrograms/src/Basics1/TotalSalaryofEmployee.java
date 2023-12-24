package Basics1;

public class TotalSalaryofEmployee {
	public static void main(String[] args)
	{
		double basic=25000;
		double hra=0.25*basic;
		double ta=0.2*basic;
		double da=0.15*basic;
		double total=basic+hra+ta+da;
		System.out.println(total);
	}

}

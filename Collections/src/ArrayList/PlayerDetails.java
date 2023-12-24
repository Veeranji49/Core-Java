package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerDetails {

	public static void main(String[] args) {
		
		ArrayList<Player> list=new ArrayList<Player>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Player details:");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter Player"+i+"details");
			int id=sc.nextInt();
			String name=sc.next();
			double balance=sc.nextDouble();
			
			Player p=new Player(id,name,balance);
			list.add(p);
			
		}
		System.out.println("Details are:");
		for(Player p:list)
		{
			System.out.println(p.id+p.name+p.balance);
		}
	}
}
class Player
{
	int id;
	String name;
	double balance;
	
	Player(int id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	void details()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.balance);
	}
}
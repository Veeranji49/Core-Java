package Inheritancetypes;

public class Hierarchical {
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}

}
class Animal
{
	public void eat()
	{
		System.out.println("Eating...");
	}
}
class Cat extends Animal
{
	public void meow()
	{
		System.out.println("Eating milk...");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Eating biscuits..");
	}
}

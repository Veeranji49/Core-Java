package StackPro;
import java.util.Scanner;
//import java.util.Stack;
public class Stack1 {
	static int size=5;
	static int[] stk=new int[size];
	static int top=-1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peak");
			System.out.println("4.traverse");
			System.out.println("5.exit");
		
			
			System.out.println("Enter ypur choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				for(int i = 0; i <= stk.length -1; i++) {
					System.out.println("Enter element to push:");
					int ele=sc.nextInt();
					Stack1.push(ele);
				}
			}
			else if(ch==2)
			{
				Stack1.pop();
			}
			else if(ch==3)
			{
				
				Stack1.peek();
			}
			else if(ch==4)
			{
				Stack1.traverse();
			}
			else if(ch==5)
			{
				System.out.println("End of stack operations");
				System.exit(1);
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
		
	}
	static void push(int ele)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stk[top]=ele;
			System.out.println("Element pushed on Stack"+stk[top]);
		}
	}
	static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("popped:"+stk[top]);
			top--;
		}
	}
	static void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("peek:"+stk[top]);
		}
	}
	static boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack elements are:");
			for(int i=top; i>=0; i--)
			{
				System.out.println(stk[i]);
			}
		}
	}
}

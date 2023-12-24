package Stack;
import java.util.*;
public class Stack2 {
	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		
		System.out.println(stk);
		System.out.println("Pop is:"+stk.pop());
		System.out.println("Pop is:"+stk.pop());
		System.out.println(stk);
		System.out.println("Peek is:"+stk.peek());
		System.out.println(stk);
		stk.push(60);
		stk.push(70);
		System.out.println(stk);
		System.out.println(stk.indexOf(30));
		System.out.println(stk.search(10));
		System.out.println(stk.contains(30));
	}

}

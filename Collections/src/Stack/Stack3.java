package Stack;
import java.util.*;
public class Stack3 {
	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		System.out.println(stk);
		System.out.println("Pop is:"+stk.pop());
		System.out.println("Pop is:"+stk.pop());
		stk.push(7);
		stk.push(8);
		System.out.println(stk);
		System.out.println("peek is:"+stk.peek());
		System.out.println("peek is:"+stk.peek());
		System.out.println(stk);
		System.out.println("search is:"+stk.search(2));
		System.out.println("Empty :"+stk.empty());
		System.out.println("Stack is:"+stk);
	}

}

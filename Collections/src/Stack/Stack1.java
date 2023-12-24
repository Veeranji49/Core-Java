package Stack;
import java.util.*;
public class Stack1 {
	public static void main(String[] args)
	{
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(3);//To add an element
		stk.push(4);
		stk.push(5);
		System.out.println("Stack is:"+stk);
		System.out.println("Pop is:"+stk.pop());//To Remove an element
		System.out.println("Pop is:"+stk.pop());
		System.out.println("Stack is:"+stk);
		
		stk.push(5);
		stk.push(6);
		stk.push(7);
		System.out.println(stk);
		System.out.println("Peek is:"+stk.peek());//Displays the top element but not removes
		System.out.println("Peek is:"+stk.peek());
		System.out.println(stk);
		
		System.out.println("Searching:"+stk.search(2));//
		System.out.println("Index:"+stk.indexOf(2));
		System.out.println(stk);
		System.out.println(stk.empty());
	}

}

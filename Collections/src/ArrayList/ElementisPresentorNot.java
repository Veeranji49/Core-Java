package ArrayList;
import java.util.ArrayList;
public class ElementisPresentorNot {
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("anji");
		list.add("hari");
		list.add("veeresh");
		list.add("saroja");
		list.add("Lakshmi");
		
		boolean element=list.contains("anji");
		System.out.println(element);
	}

}

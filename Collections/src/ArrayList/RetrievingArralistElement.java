package ArrayList;
import java.util.ArrayList;
public class RetrievingArralistElement {
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Anji");
		list.add("Hari");
		list.add("sai");
		System.out.println(list);
		String element=list.get(0);
		System.out.println(element);
	}

}

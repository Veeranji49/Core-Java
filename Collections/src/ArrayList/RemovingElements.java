package ArrayList;
import java.util.ArrayList;
public class RemovingElements {
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Anji");
		list.add("Hari");
		list.add("Veeru");
		list.add("sai");
		System.out.println("Before the removal of Lists:"+list);
		list.remove("Veeru");
		System.out.println("After the removal of Lists:"+list);
	}

}

import java.util.ArrayList;
import java.util.ListIterator;

public class M44
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		
		ListIterator lit = list.listIterator();

		while(lit.hasNext())
		{
			Object obj = lit.next();
			// lit.add(23);
			if(obj.equals(91))
			{
				lit.set("abc");//replacement of object
			}
			System.out.println(obj + ",");
		}
		System.out.println();
		System.out.println(list);
	}
}
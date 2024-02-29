import java.util.ArrayList;
import java.util.Iterator;

public class M39
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		Iterator it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		list.add(50);

		Iterator it2 = list.iterator();

		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
	// 	Iterator it2 = list.iterator();
	// 	list.add(60);

	// 	while (it2.hasNext()) {
	// 		System.out.println(it2.next());
	// 	}			
		System.out.println(list);
	}
}

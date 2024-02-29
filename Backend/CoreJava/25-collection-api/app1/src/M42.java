import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M42
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		ListIterator it = list.listIterator();
		
		// while (it.hasNext())
		// {
		// 	if (it.nextIndex() == 2) 
		// 	{
		// 		it.add(100);
		// 	}
		// 	System.out.println(it.next() + ",");
		// }
		// // it.add(50);
		// System.out.println(it.hasNext());
		// System.out.println("---------");

		// while (it.hasPrevious()) 
		// {
		// 	System.out.println(it.previous() + ",");
		// }

		// System.out.println(it.hasPrevious());

		// ListIterator it2 = list.listIterator();

		// while (it2.hasNext())
		// {
		// 	if (it2.nextIndex() == 2) 
		// 	{
		// 		it2.add(100);
		// 	}
		// 	System.out.println(it2.next() + ",");
		// }
		
		it.next();
		it.add(100);
		
		if (it.hasPrevious()) 
		{
			System.out.println(it.previous() + ",");
			System.out.println(it.next() + ",");
		}



		System.out.println("-------------");

		System.out.println(list);

	}
}

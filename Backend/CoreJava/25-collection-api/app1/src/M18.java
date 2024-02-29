import java.util.ArrayList;
import java.util.Collections;
class M18 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(0);
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(10);
		System.out.println("initial list before sort: " + list);
		// Collections.swap(list,2,1);
		Collections.sort(list);

		System.out.println("final list after sort: " + list);
	}
}

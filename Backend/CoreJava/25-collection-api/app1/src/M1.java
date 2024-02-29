import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Iterable;

public class M1
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[])
	{
		
		ArrayList list = new ArrayList();
		LinkedList list1 = new LinkedList();
		list.add(90);
		list.add("abc");
		list.add('a');
		list.add(true);
		list.add(48);
		System.out.println(list);
		System.out.println(list1);
		
	}
}
/*
 * .in every Class tostring method of object class got overrided.
. because of this we get the content instead of class name and hashcode.
.in arraylist class tostring method from object class got overrided.
*/



import java.util.ArrayList;

public class M10
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(1);
		list.add(4.0F);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(6.0F);
		list.add("abc");
		System.out.println(list);
		ArrayList list1 = new ArrayList();
		list1.add(1);
		boolean flag = list.remove(new Float(4.0F));
		list.removeAll(list1);
		System.out.println(list);
		System.out.println(flag);
		flag = list.remove(new Integer(12));
		System.out.println(flag);
	}
}

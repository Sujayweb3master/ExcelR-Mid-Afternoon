import java.util.ArrayList;
import java.util.Calendar;
class M8 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		Integer obj = 10;
		Thread t1 = new Thread();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(23);
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(t1);
		System.out.println(list);
	}
}
/*
1. In all these classes toString method of object class got overrided to return the content instead of the memory address.
*/

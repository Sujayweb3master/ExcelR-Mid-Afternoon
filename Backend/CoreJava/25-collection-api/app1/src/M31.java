import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class M31
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		int[] list1 = {2, 1, 3, 4};
		int[] list2 = new int[5];
		list.add(10);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(4);
		System.out.println("initial: " +  list);
		Collections.sort(list);
		
		System.out.println("sorted: " +  list);
		int i = Collections.binarySearch(list, 6);
		Arrays.sort(list1);
		for(Object j : list1) {
			System.out.println(j);
		}
		System.out.println(i);
	}
}

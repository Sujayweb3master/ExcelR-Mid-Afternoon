import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class M22
{
	public static void main(String[] args) 
	{
		String[] array = {"A", "B", "C", "D"};

		System.out.println("initial list before sort: " + Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		
		//for (int i = 0; i < array.length; i++)
		//{
		//	System.out.print(array[i] + ", ");
		//}

	System.out.println("initial list after sort: " + Arrays.toString(array));
	}
}

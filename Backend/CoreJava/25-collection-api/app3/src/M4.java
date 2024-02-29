import java.util.HashSet;

public class M4 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		//add method returns boolean value if success returns true.	
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));

		System.out.println(set);
	}
}

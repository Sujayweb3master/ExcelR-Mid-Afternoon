public class W
{
	static void test(String...varArg)
	{ 
		//by default var-arg is an array
		//iterating an array by using for-each loop
		if (varArg.length == 0)
		{
			System.out.println("No elements");
			return;
		}
		int counter = 1;

		for(String s1 : varArg)
		{
			if (s1 == varArg[0]) 
				System.out.print(s1);
			else
				System.out.print("," + s1);
		}
		
		for(String s1 : varArg)
		{ 
			if (counter == 1) 
			{
				System.out.print(s1);
				counter++;
			}
			else
			{
				System.out.print("," + s1)
			}
			
		}
		System.out.println();
	}
	public static void main(String [] args)
	{
		test();
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("hello","test","xyz","abc");
	}
}

class D 
{
	static void test()
	{
		System.out.println("test()");
	}

	static String test(int i)
	{
		System.out.println("test(int)");
		return "abc";
	}

	static String test(String str)
	{
		System.out.println("test(String)");
		return "abc";
	}

	static char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}

	static boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		D.test();
		D.test(10);
		D.test(10.0f, 20.0);
		D.test('a', "abc", true);
		System.out.println("done");
	}
}

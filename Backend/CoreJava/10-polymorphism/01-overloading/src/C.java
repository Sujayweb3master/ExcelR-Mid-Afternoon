class C 
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

	static char test(int i, int j)
	{
		System.out.println("test(int, int)");
		return 'a';
	}

	static boolean test(int i, int j, int k)
	{
		System.out.println("test(int, int, int)");
		return true;
	}

	public static void main(String[] args) 
	{
		C.test();
		C.test(10);
		C.test(10, 20);
		C.test(10, 20, 30);
		System.out.println("done");
	}
}

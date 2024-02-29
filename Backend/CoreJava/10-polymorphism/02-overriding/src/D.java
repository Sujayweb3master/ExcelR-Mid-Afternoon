class C
{
	void test()
	{
		System.out.println("from test-C");
	}
}
class D extends C 
{
	void test()
	{
		System.out.println("from test-D");
	}

	public static void main(String[] args) 
	{
		C c1 = new D();
		c1.test();
		System.out.println("done");
	}
}

interface A
{
	void test();
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void test()
			{
				System.out.println("from test AIC");
			}
		};
		a1.test();
		System.out.println("--------------");
		
		A a2 = () -> System.out.println("from test from LE");
		A a3 = () -> System.out.println("This is from use of Lambda Expression");
		a2.test();
		a3.test();

	}
}
//lambda expressions 1.8








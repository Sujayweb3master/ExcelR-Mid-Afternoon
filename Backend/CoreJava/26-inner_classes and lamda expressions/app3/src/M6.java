interface A
{
	final int  I = 23;
	public int test();

	static void test1()
	{
		System.out.println("from test");
	}
}
class M6
{
	public static void main(String[] args) 
	{
		//if method body contains only return value then return statement is not allowed
		A a2 = () -> {
						return 2000;
					};
					
		A a3 = new A() 
						{
							public int test() {
								return 2000;
							}
						};
		int i = a2.test();
		System.out.println(i);
	}
}

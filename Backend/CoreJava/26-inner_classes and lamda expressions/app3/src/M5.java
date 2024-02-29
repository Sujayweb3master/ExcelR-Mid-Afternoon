interface A
{
	void test(int i, double j);
}
class M5
{
	public static void main(String[] args) 
	{
		//mentioning the types is optional
		A a2 = (x, y) -> {
						System.out.println("from test:LE " + x);
						System.out.println("from test:LE " + y);
						System.out.println("from test");
					 };
		a2.test(20, 3.4);
	}
}

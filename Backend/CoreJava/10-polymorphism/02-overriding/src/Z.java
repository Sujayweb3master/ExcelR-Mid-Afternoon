class Y
{
	void test1()
	{
		System.out.println("from test1-Y");
	}
}
class Z extends Y
{
	void test1()
	{
		System.out.println("from test1-Z");
	}

	public static void main(String[] args) 
	{
		Z obj1 = new Y();
		obj1.test1();
		System.out.println("done");
	}
}

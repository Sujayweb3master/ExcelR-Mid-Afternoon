//Example for Hierarchical Inheritance
class Z13 
{
	void test()
	{
		System.out.println("test");
	}
}
class Z14 extends Z13
{
	public static void main(String[] args) 
	{
		Z14 obj1 = new Z14();
		obj1.test();
		System.out.println("done from Z14");
	}
}
class Z15 extends Z13
{
	public static void main(String[] args) 
	{
		Z15 obj1 = new Z15();
		obj1.test();
		System.out.println("done from Z15");
	}
}

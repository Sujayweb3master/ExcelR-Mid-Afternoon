class B1 {

	B1() {
		System.out.println("B1()");
	}

	B1(boolean k1) {
		System.out.println("B1(boolean)");
	}
}

class B extends B1
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	B(boolean k)
	{
		System.out.println("B(boolean)");
	}
	static
	{
		System.out.println("B-SIB");
	}
	{
		System.out.println("B-IIB");
	}
	void test1()
	{
		System.out.println("B-test1");
	}
}

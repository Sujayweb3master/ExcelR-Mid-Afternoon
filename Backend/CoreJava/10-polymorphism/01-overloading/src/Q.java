class P
{
	static int i;
	boolean k;

	static public void test()
	{
		System.out.println("from P test()");
	}
}
class Q extends P
{

	{
		super.test();
	}

	public void test(int i)
	{
		super.test();
		System.out.println("from Q test(int)");
		System.out.println(super.i);
		System.out.println(super.k);
	}

	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}

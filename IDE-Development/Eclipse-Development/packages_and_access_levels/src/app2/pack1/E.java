package app2.pack1;
class D
{
	private void test1()
	{
		System.out.println("from D.test1()");
	}
	//default(friendly)
	void test2()
	{
		System.out.println("from D.test2()");
	}
}
class E //extends D
{
	public static void main(String[] args) 
	{
		D obj = new D();
		//obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
/*default ==> friendly ==> package-level
same class - YES
same package sub-class - YES
same package non-sub-class - YES
outside package - NO
*/

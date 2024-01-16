interface S
{
	void test1();
}
enum T implements S
{
	CON1, CON2 {
		public void test1() {
			System.out.println("inner");
		}
	}
	, CON3;
	public void test1()
	{
		System.out.println("from test1");
	}
}
class Z
{
	public static void main(String[] args)
	{
		T t1 = T.CON2;
		t1.test1();
	}
}
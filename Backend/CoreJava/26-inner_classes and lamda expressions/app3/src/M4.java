interface A
{
	void test(int i);
}
class M4
{
	public static void main(String[] args) 
	{
		//if it is overloading then datatype is required 
		//but here only one method so there is no need of specifying datatype
		//just we can supply identifier to the argument
		A a2 = (x) -> {
						System.out.println("from test: LE: " + x);
						System.out.println("from test: LE");
						System.out.println("from test LE");
					 };
		a2.test(20);
	}
}

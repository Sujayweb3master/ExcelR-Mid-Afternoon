public class O
{
	//first preference goes to same type
	// static void test(byte i)
	// {
	// 	System.out.println("byte");
	// }
	// static void test(short i)
	// {
	// 	System.out.println("short");
	// }
	// static void test(int i)
	// {
	// 	System.out.println("int");
	// }
	/*static void test(Byte b)
	{
		System.out.println("Byte");
	}*/
	
	static void test(Double d1)
	{
		System.out.println("Double");
	}
	/*static void test(Number n1)
	{
		System.out.println("Number");
	}*/
	// static void test(Object obj)
	// {
	// 	System.out.println("Object");
	// }
	// static void test(byte...b)
	// {
	// 	System.out.println("var-arg");
	// }
	static void test(Integer...i) 
	{
		System.out.println("var-arg widening");
	}
	static void test(Object... o)
	{
		System.out.println("var-arg widening of object");
	}
	public static void main(String[] args)
	{
		byte b1 = 10;
		test(b1);
		Byte b2 = 20;
		test(b2);

	}
}
	

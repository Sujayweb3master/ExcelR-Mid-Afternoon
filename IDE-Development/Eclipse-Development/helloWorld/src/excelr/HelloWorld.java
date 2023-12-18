package excelr;

public class HelloWorld {

	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("Hello World");
		test();
		System.out.println(i);
	}
	
	static void test()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("iteration: " + i);
		}
	}
}

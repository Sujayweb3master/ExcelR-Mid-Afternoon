public class V
{
	//var-arg by default is an array
	static void test(int...x)
	{
		System.out.println("size: " + x.length);
		if(x.length == 0) 
		{
			System.out.println("indexes: 0");
			return;
		}
		System.out.println("index starting from 0 and up to: " + (x.length - 1));
	}
	public static void main(String [] args)
	{
		test();
		test(20,40,70);
		test(90,20,10,60,50);
	}
}

class K 
{

	static int j = 10;
	public static void main(String[] args) 
	{
		//3rd type of inner class
		//we can develop an inner class inside a method,constructor,IIB,SIB
		//it is the local inner class
		//class A visibility now within the main method
		class A1
		{
			int i = 10;

			
			void test()
			{
				System.out.println("from A");
				i = 12;
				j = 123;
				System.out.println(i);
			}

			
		}
		A1 a1 = new A1();
		a1.test();
		System.out.println(j);
		System.out.println("done");
	}

	{
		// A1 obj1 = new A1();Not possible 

	}
}


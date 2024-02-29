class M8
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{

			{
				System.out.println("AIC-IIB");
			}
		};
		b1.test1();
		
		System.out.println("done");
		new M8().test();
	}

	void test() {
		{
			System.out.println("inside block");
		}
	}

}

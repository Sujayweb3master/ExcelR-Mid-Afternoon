class M18
{
	public static void main(String[] args) 
	{
		// E e1 = new E();
		// e1.method1(new A()
		// 		   {
		// 				void test2()
		// 				{
		// 					System.out.println("from A.AIC.test2");
		// 				}
		// 		   });

		E e2 = new E(new A()
							{
								void test2() 
								{
									System.out.println("from AIC-test2");
								}
							}		
					);
		e2.method1(null);
		System.out.println("done");
	}
}


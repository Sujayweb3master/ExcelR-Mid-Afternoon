class C
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("1");
		try {
			C c2 = (C) c1.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}//downcasting return value of clone method to C type 
		System.out.println("2");
		System.out.println("done");
	}
}
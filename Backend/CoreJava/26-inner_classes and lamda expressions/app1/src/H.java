import java.util.LinkedList;
class H	
{
	private class B
	{
	}
	private static class C
	{
	}
	public static void main(String[] args) 
	{
//while specifying inner class for the datatype purpose, we have to go for outer.inner
//no matter inner is static, non-static
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}

class H1 {
	public static void main(String[] args) {

	}
}
class I <X>
{
	X f1;
}
class M9
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String [] args)
	{
		I obj1 = new I ();
		I <String> obj2 = new I <String> ();
		obj1.f1 = new Object();
		obj1.f1 = "abc";
		obj2.f1 = "abc";
		System.out.println(obj1);
		System.out.println("done");		
	}
}
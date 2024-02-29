class D <Z>
{
	String s1;
	Z s2;
}
class M4
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		D d1 = new D();
		d1.s2 = 100;// up casted to object type as we have not specified the type
		d1.s1 = "abc";
		D <String> d2 = new D <String> ();
		d2.s2 = "abc";
		d2.s1 = "abc";
		D <Double> d3 = new D <Double> ();
		d3.s2 = 9.989;
		d3.s1 = "abc";
		System.out.println("done");
	}
}
class Z <A1 extends P>
{
	A1 i;
}
class M12
{
	public static void main(String [] args)
	{
		
		Z <P> t1 = new Z<P>();
		Z <Q> t2 = new Z<Q>();
		Z <R> t3 = new Z<R>();
		Z <S> t4 = new Z<S>();
		Z <T> t5 = new Z<T>();

		t1.i.s1 = "weoh";
		t2.i.s1 = "woehf32";

		// Z <String> t6 = new Z <String> ();
		System.out.println("done");
	}
}
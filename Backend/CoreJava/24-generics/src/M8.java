class H <X>
{
	private X i;
	H()
	{
		
	}
	H(X i)
	{
		this.i = i;
	}
	public void set(X i)
	{
		this.i = i;
	}
	public 	X get()
	{
		return i;
	}
}
class M8
{
	public static void main(String[] args)
	{
		H <String> h1 = new H <String> ();
		h1.set("abc");
		H <Integer> h2 = new H <Integer> (90);
		String s1 = h1.get();
		int i = h2.get();
		System.out.println(s1);
		System.out.println(i);		
	}
}
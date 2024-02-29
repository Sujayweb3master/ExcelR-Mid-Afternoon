class B 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("world");
		String s4 = new String("world");
		System.out.println(s3.equals(s4));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase("HellO"));
	}
}

class A
{
	public static void main(String[] args)
	{
		String s1 = "abc SEPERATOR xyz SEPERATOR hello SEPERATOR 123";
		String[] splits = s1.split(" SEPERATOR ");
		for(String split : splits)
		{
			System.out.println(split);
		}
	}
}

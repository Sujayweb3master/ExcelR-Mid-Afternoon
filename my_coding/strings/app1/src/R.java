class R
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = null;
		String s3 = s1 + s2;
		String s4 = s2 + s1;
		System.out.println(s1);//abc
		System.out.println(s2);//null
		System.out.println(s3);//abcnull
		System.out.println(s4);//nullabc
	}
}

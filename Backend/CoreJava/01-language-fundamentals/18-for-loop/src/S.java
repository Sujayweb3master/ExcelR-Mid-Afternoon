class S
{
	public static void main(String[] args)
	{
		int i;
		for(i = 0, System.out.println("INITIALIZER");
		i < 5;
		i++, System.out.println("INCREMENT"))
		{
			System.out.println("BODY");
		}
	}
}
/*
INTIALIZER
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
*/
class M7 
{
	public static void main(String[] args) 
	{
		Integer obj1 = 100;
		Integer obj2 = new Integer(100);
		Character obj3 = 'a';
		Character obj4 = new Character('a');
		Float f1 = 23.2f;
		Double d1 = 23324.89;
		Long l1 = 9374l;
		Short s1 = 23;
		Byte b1 = 10;
		Boolean obj5 = true;
		Boolean obj7 = true;
		Boolean obj6 = new Boolean(false);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
		System.out.println(obj7.hashCode());
		System.out.println("-------");
		System.out.println(f1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println("----------");
		System.out.println(s1.hashCode());
		System.out.println(b1.hashCode());
		System.out.println(l1.hashCode());

	}
}
/*
in every
wrapper class hashcode method got overrided and returning same
value not an address. in String, Wrapper, Collection classes
toString(), equals(), hashcode() overrided. in StringBuffer and 
StringBuilder class only toString() got overrided not the
hashCode() and equals().
*/
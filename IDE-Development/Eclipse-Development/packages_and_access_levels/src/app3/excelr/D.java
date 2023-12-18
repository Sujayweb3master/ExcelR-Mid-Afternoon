package app3.excelr;
class D extends C
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
	}
}

/*
default
--------------
within the same class - YES
within same package direct-sub-class - YES
within same package not-the-direct-sub-class - YES
within same package non-sub-class - YES
*/

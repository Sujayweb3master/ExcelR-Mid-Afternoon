//non-static, static, local inner classes

//outer class cant be static
//static is applied to the only members of a class
class A 
{
	static int i;
	//inner class
	//non-static member of A
	class B
	{
	}
	//another inner class
	//static member of A
	static class C
	{
	}
	public static void main(String[] args) 
	{
		A a1 = null;
		//even though B is non-static we are using B inside static main method
		//in general we cant able to use non-static inside static without reference
		//any class can be used any where if usage is datatype usage
		B b1 = null;
		C c1 = null;
		A a2 = new A();

		A.B b2 = a2.new B();
		System.out.println("done");
	}
}
/*
1. class inside a class is inner class
*/
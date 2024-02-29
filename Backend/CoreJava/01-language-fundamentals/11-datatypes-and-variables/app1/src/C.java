class C
{
	public static void main(String[] args) 
	{
		//local variable, local to main method
		int i;//declaration
		i = 10;//initialization
		System.out.println(i);
		i = 20;//re-initialization
		System.out.println(i);
		i = 30;//re-initialization
		System.out.println(i);
		System.out.println(i);
	}
}
//The same local variables we can able to re-initialize any no. of times. 
//local variables cant be accessed outside of the declared blocks.
//scope of the local variables(visibility) limited to that declared blocks only.
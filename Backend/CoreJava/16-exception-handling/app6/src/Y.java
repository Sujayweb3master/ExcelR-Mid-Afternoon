class X
{
	X() throws ClassNotFoundException
	{
	}
}
class Y extends X
{
	Y() throws ClassNotFoundException
	{
		super();
		
	}

	public static void main(String[] args) {
		try {
			Y y1 = new Y();
		} 
		catch (ClassNotFoundException ex) {

		}
		finally {

		}
	}
}

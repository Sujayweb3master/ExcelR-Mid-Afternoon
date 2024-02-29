import java.io.File;
//Exception is a part of java.lang package but IOException we should import
import java.io.IOException;	

class F6
{
	public static void main(String[] args)
	{
		File f1 = null;
		try
		{
			f1 = new File("xyz.txt");
		}
		catch (NullPointerException exs)
		{
			System.out.println("from catch: " + exs);
		}

			System.out.println("a: " + f1.exists());
		
		//instead of throws
		try
		{
			System.out.println("b: " + f1.createNewFile());
		}
		catch(IOException ex)
		{
			System.out.println("from catch: " + ex);
		}
		System.out.println("c: " + f1.exists());
		System.out.println("done");
		System.out.println("32" + 23);
	}
}

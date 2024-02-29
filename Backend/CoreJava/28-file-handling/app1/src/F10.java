import java.io.File;
import java.io.IOException;	

class F10
{
	public static void main(String[] args)
	{
		//constructors takes two arguments 
		//one takes path, another creates file
		//the path should be available
		File file = new File("/media/sujay18/Education/File-Handling/", "test3.txt");
		System.out.println("a: " + file.exists());
		try
		{
			System.out.println("b: " + file.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c: " + file.exists());
		System.out.println("done:");
	}
}

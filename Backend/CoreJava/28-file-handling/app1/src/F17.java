import java.io.File;

public class F17
{
	public static void main(String[] args)
	{
		File directory = new File("/media/sujay18/Education/File-Handling/");
		//path referred through reference variable
		File file = new File(directory, "directory5");
		System.out.println("a: " + file.exists());
		System.out.println("b: " + file.mkdir());
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}

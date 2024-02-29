import java.io.File;

public class F14
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("directory");
		System.out.println("a: " + file.exists());
		//file.mkdir() - returns a boolean value
		System.out.println("b: " + file.createNewFile());
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}

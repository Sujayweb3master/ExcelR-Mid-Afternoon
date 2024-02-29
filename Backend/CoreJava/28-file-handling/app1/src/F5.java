import java.io.File;

public class F5
{
	public static void main(String[] args) throws Exception
	{	
		//you can create literally any kind of file
		File f1 = new File("xyz.java");
		//returns boolean value
		//second time returns false
		boolean flag = f1.createNewFile();
		System.out.println(flag);
		System.out.println("done");
	}
}

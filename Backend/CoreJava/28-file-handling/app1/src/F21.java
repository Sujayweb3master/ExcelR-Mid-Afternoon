import java.io.File;

public class F21
{
	public static void main(String[] args)
	{
		File file = new File("/media/sujay18/Education/File-Handling/");
		//reading all the members of the directory
		File[] members = file.listFiles();
		for(File member : members)
		{
			//you will get file names with extensions
			System.out.println(member.getName());
		}
	}
}

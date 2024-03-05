import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F3
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("/media/sujay18/Education/File-Handling/test1.txt");
		FileWriter out = new FileWriter(f1);
		//char to int conversion
		out.write('a');
		out.flush();
		out.close();
		char ch = 68;
		int i = 'a';
		System.out.println((char)i);
		System.out.println("done");
	}
}
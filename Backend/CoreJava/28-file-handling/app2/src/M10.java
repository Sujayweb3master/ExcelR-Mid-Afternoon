import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("/media/sujay18/Education/File-Handling/test3.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		System.out.println(s1);
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();

	}
}

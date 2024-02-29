import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M9 {
	public static void main(String[] args)  throws IOException {
		FileWriter out = new FileWriter("/media/sujay18/Education/File-Handling/test22.txt", true);
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
		
	}
}

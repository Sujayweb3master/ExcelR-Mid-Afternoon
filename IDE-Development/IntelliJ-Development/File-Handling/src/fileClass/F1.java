package fileClass;

import java.io.File;
import java.io.IOException;

public class F1
{
    public static void main(String[] args)
    {
        int i = 109;
        //giving a relative path name
        File file = new File("test1.txt");

        System.out.println(file.exists());
        i = 12;

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(file.exists());
        System.out.println("done");
    }
}

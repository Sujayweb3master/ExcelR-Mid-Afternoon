package fileClass;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class F4
{
    public static void main(String[] args)
    {
        File dirPath = new File("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/Files/");
        File file = new File(dirPath.toString());

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println(file.length());
        System.out.println(Arrays.toString(file.listFiles()));



    }
}

package fileClass;

import java.io.File;
import java.io.IOException;

public class F3
{
    public static void main(String[] args)
    {
        File dirPath = new File("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/Files/");
        File file = new File(dirPath,"test2.txt");

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}

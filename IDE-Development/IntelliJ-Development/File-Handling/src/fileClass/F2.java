package fileClass;

import java.io.File;
import java.io.IOException;

public class F2
{
    public static void main(String[] args)
    {
        // here we are using absolute path name
        File file = new File("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/Files/test1.txt");

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

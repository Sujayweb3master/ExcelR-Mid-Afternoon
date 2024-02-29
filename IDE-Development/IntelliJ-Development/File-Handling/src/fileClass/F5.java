package fileClass;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class F5
{
    public static void main(String[] args)
    {
        File dirPath = new File("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/");
        File directory = new File(dirPath,"Files-test-version");
        System.out.println(directory.exists());
        directory.mkdir();
        System.out.println(directory.exists());
    }

}

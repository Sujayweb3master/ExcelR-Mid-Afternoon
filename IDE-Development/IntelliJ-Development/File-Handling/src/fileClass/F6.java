package fileClass;

import java.io.File;

public class F6
{
    public static void main(String[] args)
    {
        File dirPath = new File("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/Files/");
        File file = new File(dirPath,"test1.txt");

/*
        if you want to check for these files and folders
        it should be available otherwise simply you will get false.
*/
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}

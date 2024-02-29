package readAndWriteClass;


import java.io.FileWriter;
import java.io.IOException;

public class F1
{
    public static void main(String[] args)
    {
        FileWriter out = null;

        try
        {
            out = new FileWriter("/home/sujay18/excelr/ExcelRMidAfternoon/IDE-Development/Files/test1.txt");

            out.write("first ");
            out.write("second ");
            out.write("third");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            try
            {
                out.flush();
                out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }
}

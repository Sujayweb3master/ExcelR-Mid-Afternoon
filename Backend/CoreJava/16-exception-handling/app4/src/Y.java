import java.text.ParseException;
import java.text.SimpleDateFormat;
class Y
{
	public static void main(String[] args) 
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try
		{
			df.parse("");
		}
		catch (ParseException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}

//Util Dev and Transaction management
/*
- in the previous programs we were establishing a connection
  establishing a connection it requires registering a driver,
  reading constants from the properties file.
- instead of developing establishig connection in every JDBC
  program, we can develop a seperate Util class
*/
//importing all the members seperately
import java.sql.DriverManager;//class
import java.sql.SQLException;//class
import java.sql.Connection;//interface
import java.sql.Statement;
class M1
{
	//wherever we try to interact with the database just
	  //call the getConnection() from util 
	//wht this method is doing
	  //reading all the the properties from a properties file
	public static void main(String[] args)
	{
		//String sqld = "DROP TABLE BOOK1";
		String sql = "CREATE TABLE BOOK1(ID NUMBER, TITLE VARCHAR2(90), AUTHOR VARCHAR2(90), PRICE NUMBER)";
		try(Connection con = Util.getConnection();
			Statement stmt = con.createStatement())
		{
			stmt.execute(sql);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
- We might have to change the driver class for that we need to modify
the code.
-we might have to change IP address, XE or port number.
-we might have to chage username and password
- its not advisable to hardcode instead we get that 
info from the properties file.
-------------------
- properties file should be kept under classes where we trigger
java command.
- in the properties file property_field_name=value
- should not be having any unncessary spaces
- extension should be .properties
driverClassName=oracle.jdbc.driver.OracleDriver
url=jdbc:oracle:thin:@localhost:1521:XE
username=system
password=admin







public class DriverManager
extends Object
The basic service for managing a set of JDBC drivers.
*/
/*
public class SQLException
extends Exception
implements Iterable<Throwable>
An exception that provides information on a database access error or other errors.
*/
/*
public interface Connection
extends Wrapper, AutoCloseable
A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection.

A Connection object's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the capabilities of this connection, and so on. This information is obtained with the getMetaData method.
*/
/*
public interface Statement
extends Wrapper, AutoCloseable
The object used for executing a static SQL statement and returning the results it produces.

By default, only one ResultSet object per Statement object can be open at the same time. Therefore, if the reading of one ResultSet object is interleaved with the reading of another, each must have been generated by different Statement objects. All execution methods in the Statement interface implicitly close a statment's current ResultSet object if an open one exists.
*/
/*
What are checked exceptions?
Checked exceptions are checked at compile-time.
It means if a method is throwing a checked exception 
then it should handle the exception using try-catch block or
it should declare the exception using throws keyword, 
otherwise the program will give a compilation error.

Generally, checked exceptions denote error scenarios which 
are outside the immediate control of the program. ... 
Checked exceptions are subclasses of Exception class. 
Example of checked exceptions are : ClassNotFoundException, 
IOException, SQLException and so on.
*/

/*
The printStackTrace() method in Java is a tool used to 
handle exceptions and errors. It is a method of Java's 
throwable class which prints the throwable along with other 
details like the line number and class name where the exception 
occurred.
*/

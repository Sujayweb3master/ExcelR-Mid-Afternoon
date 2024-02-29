import java.sql.*;
// import com.mysql.jdbc.Driver;
class A 
{
	public static void main(String[] args) throws Exception
	{
		String sql1 = "DROP TABLE IF EXISTS JDBC20";
		String sql2 = "CREATE TABLE JDBC20(ID INTEGER)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(  
"jdbc:mysql://127.0.0.1:3306/MYSQL_NOTES", "JavaMidAfternoon", "password");  
		Statement stmt = con.createStatement();
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}

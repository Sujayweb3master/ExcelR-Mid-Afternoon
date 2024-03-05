import java.sql.*;
class B 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/excelr", "president","admin");  
		Statement stmt = con.createStatement();
		String sql = "INSERT INTO JDBC10 VALUES(1000)";
		stmt.execute(sql);
		System.out.println("done");
	}
}

import java.sql.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		String sql1 = "DROP TABLE TEST10";
		String sql2 = "CREATE TABLE TEST10(ID NUMBER)";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db","root","root");  
		Statement stmt = con.createStatement();
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}

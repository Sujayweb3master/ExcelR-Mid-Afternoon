import java.sql.*;

class A 
{
    public static void main(String[] args) throws Exception
    {
        
        String sql1 = "INSERT INTO PERSON VALUES(18, 'PRERANA', 25)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president","admin" );
        Statement stmt = con.createStatement();
        stmt.execute(sql1);
        System.out.println("done");


    }
}
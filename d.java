import java.sql.*;
//import java.sql.Connection;
///import java.sql.Statement;
class d {
	public static void main(String v[])
		{
	try{

Class.forName("Sun.Jdbc.Odbc.Driver");
Connection con=DriverManager.getConnection("jdbc:odbc:muk") ;
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("insert name='muk' into table");
//rs.executeUpdate();
stmt.close();
con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}

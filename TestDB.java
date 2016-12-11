import java.sql.*;
import java.io.*;
import java.util.*;
/**
  6. This program tests that the database and the JDBC
  7. driver are correctly configured.
  8. */
class TestDB
{
	public static void main (String args[])
	{
		try
		{
			Connection conn = getConnection();
			Statement stat = conn.createStatement();

			stat.execute("CREATE TABLE Greetings(Name CHAR(20))");
			stat.execute( "INSERT INTO Greetings VALUES ('Hello,World!')");

			ResultSet result= stat.executeQuery("SELECT * FROM sGreetings");
			result.next();

			System.out.println(result.getString(1));
			result.close();
			stat.execute("DROP TABLE Greetings");
			stat.close();
			conn.close();
		}
		catch (SQLException ex)
		{
			while (ex != null)
			{
				ex.printStackTrace();
				ex = ex.getNextException();
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	/**
	  48. Gets a connection from the properties
	  specified
	  49. in the file database.properties
	  50. @return the database connection
	  51. */
	public static Connection getConnection()
		throws SQLException, IOException
		{
			Properties props = new Properties();
			FileInputStream in
				= new
				FileInputStream("database.properties");
			props.load(in);
			in.close();

			String drivers =
				props.getProperty("jdbc.drivers");
			if (drivers != null)
				System.setProperty("jdbc.drivers",
						drivers);
			String url = props.getProperty("jdbc.url");
			String username =
				props.getProperty("jdbc.username");
			String password =
				props.getProperty("jdbc.password");
			return
				DriverManager.getConnection(url,username, password);

		}
}

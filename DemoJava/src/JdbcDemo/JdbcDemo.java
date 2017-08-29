package JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3) + " " +rs.getDouble(4));
				
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

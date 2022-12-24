package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			Statement s = con.createStatement();
			int i = s.executeUpdate("insert into student values(1,'Mayur',65.74,'1997-12-21')");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Value inserted!!!");
	}

}

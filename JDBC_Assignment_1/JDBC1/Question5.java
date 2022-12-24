package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Question5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			Statement s = con.createStatement();
			ResultSet rs  = s.executeQuery("select count(*) from student");
			while(rs.next()) {
			System.out.println("total entries in table :" +rs.getInt(1));
			}
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}

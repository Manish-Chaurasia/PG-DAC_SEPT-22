package JDBC1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			CallableStatement s = con.prepareCall("{call insert_studentRecord(?,?,?)}");
			s.setInt(1, rollno);
			s.setString(2, name);
			s.setDouble(3, marks);
			int i = s.executeUpdate();
			System.out.println(i+ "record updated");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

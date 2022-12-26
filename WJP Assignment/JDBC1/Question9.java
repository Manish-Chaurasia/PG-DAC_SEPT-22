package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Question9 {
	
	static PreparedStatement s ;
	static Scanner sc;

	public static void main(String[] args) {
		
			
			sc = new Scanner(System.in);
			boolean flag=true;
			do {
				System.out.println("press 0 to exit");
				System.out.println("press 1 to Create");
				System.out.println("press 2 to Read");
				System.out.println("press 3 to Update");
				System.out.println("press 4 to Delete");
				byte ch = sc.nextByte();
				switch(ch) {
				case 0:
						flag = false;
						break;
						
				case 1:
					createRecord();
					break;
				case 2:
					readRecord();
				break;
				case 3:
					updateRecord();
					break;
				case 4:
					deleteRecord();
					break;
				default:
					System.out.println("wrong choice");
				}
			}while(flag);
		

	}
	
	static void createRecord() {
		
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		System.out.println("Enter date of birth(YYYY-MM-DD)");
		String dob = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.prepareStatement("insert into student values(?,?,?,?)");
			s.setInt(1, rollno);
			s.setString(2, name);
			s.setDouble(3,  marks);
			s.setString(4, dob);
			int i = s.executeUpdate();
			System.out.println(i+" record inserted");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	static void readRecord() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.prepareStatement("select * from student");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getDate(4));
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void updateRecord() {
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		System.out.println("Enter date of birth(YYYY-MM-DD)");
		String dob = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.prepareStatement("update student set name = ? , marks = ? , dob = ? where rno = ?");
			s.setInt(4, rollno);
			s.setString(1, name);
			s.setDouble(2,  marks);
			s.setString(3, dob);
			int i = s.executeUpdate();
			System.out.println(i+" record updated");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void deleteRecord() {
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.prepareStatement("delete from student where rno = ?");
			s.setInt(1, rollno);
			int i = s.executeUpdate();
			System.out.println(i+" record deleted");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

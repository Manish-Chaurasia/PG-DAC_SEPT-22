package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Question6 {
	
	static Scanner sc;
	static Statement s;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.createStatement();
			sc = new Scanner(System.in);
			boolean flag = true;
			do {
				System.out.println("press 0 to exit");
				System.out.println("press 1 to Create");
				System.out.println("press 2 to Read");
				System.out.println("press 3 to Update");
				System.out.println("press 4 to Delete");
				byte ch = sc.nextByte();
				switch(ch) {
					case 0:
							flag=false;
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
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	static void createRecord() throws SQLException {
		
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		System.out.println("Enter date of birth(YYYY-MM-DD)");
		String dob = sc.next();
		int i = s.executeUpdate("insert into studentinfo values("+rollno+" , '"+name+"',"+marks+", '"+dob+"')");
		System.out.println(i+" record inserted");
	}
	
	static void updateRecord() throws SQLException {
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();
		System.out.println("Enter date of birth(YYYY-MM-DD)");
		String dob = sc.next();
		int i = s.executeUpdate("update studentinfo set name='"+name+"' ,marks = "+marks+", dob= '"+dob+"' where rno = "+rollno );
				System.out.println(i +" row updated");
	}
	
	static void readRecord() throws SQLException {
		ResultSet rs = s.executeQuery("select * from studentinfo");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getDate(4));
		}
	}
	
	static void deleteRecord() throws SQLException {
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		int i = s.executeUpdate("delete from studentinfo where rno = "+rollno );
				System.out.println(i +" row deleted");
	}
}

package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Question12 {
	
	static PreparedStatement s ;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		boolean flag=true;
		do {
			System.out.println("press 0 to exit");
			System.out.println("press 1 to Insert Employee Information");
			System.out.println("press 2 to Insert Employee Address");
			byte ch = sc.nextByte();
			switch(ch) {
			case 0:
					flag = false;
					break;
					
			case 1:
				insertEmpInfo();
				break;
			case 2:
				insertEmpAddress();
			break;
			default:
				System.out.println("wrong choice");
			}
		}while(flag);
	

}
	
static void insertEmpInfo() {
		
		System.out.println("Enter Employee ID:");
		int eid = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter Salary");
		double sal = sc.nextDouble();
		System.out.println("Enter Join Date(YYYY-MM-DD)");
		String doj = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
			s = con.prepareStatement("insert into emp_info values(?,?,?,?)");
			s.setInt(1, eid);
			s.setString(2, name);
			s.setDouble(3, sal);
			s.setString(4, doj);
			int i = s.executeUpdate();
			System.out.println(i+" record inserted");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

static void insertEmpAddress() {

	System.out.println("Enter Address ID:");
	int aid = sc.nextInt();
	System.out.println("Enter city:");
	String city = sc.next();
	System.out.println("Enter country");
	String cont = sc.next();
	System.out.println("Enter employee ID:");
	int eid = sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac?useSSL=false","root","sept22");
		s = con.prepareStatement("insert into emp_address values(?,?,?,?)");
		s.setInt(1, aid);
		s.setString(2, city);
		s.setString(3, cont);
		s.setInt(4, eid);
		int i = s.executeUpdate();
		System.out.println(i+" record inserted");
	
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}


}

	
			
//			Statement s = con.createStatement();
//			boolean flag1 = s.execute("create table emp_info(empid int primary key , name varchar(25),salary float(10,2),joindate date)");
//			boolean flag2 = s.execute("create table emp_address(addid int , city varchar(25) , country varchar(25), empid int ,foreign key(empid) references emp_info(empid)) ");
//		

	


	}

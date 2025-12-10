package com.excelR;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DynamicInsert {
 public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter toy id : ");
	int id=sc.nextInt();
	System.out.print("Enter toy name : ");
	String name=sc.next();
	System.out.print("Enter toy price : ");
	double price=sc.nextDouble();
	System.out.print("Enter toy qunatity : ");
	int quantity=sc.nextInt();
	
	//load and register
	DriverManager.registerDriver(new Driver());
    //Establish the connection
	DriverManager.getConnection
		("jdbc:mysql://localhost:3306/database1?user=root&password=root");
	
}
}

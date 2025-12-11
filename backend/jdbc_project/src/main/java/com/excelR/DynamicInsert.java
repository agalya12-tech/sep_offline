package com.excelR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DynamicInsert {
 public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter toy id : ");
	int id=sc.nextInt();
	System.out.print("Enter toy name : ");
	String name=sc.next();
	System.out.print("Enter toy price : ");
	double price=sc.nextDouble();
	System.out.print("Enter toy qunatity : ");
	int quantity=sc.nextInt();
	 try {
	//load and register
	DriverManager.registerDriver(new Driver());
    //Establish the connection
	Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/database1?user=root&password=root");
    //creation of statements
	PreparedStatement ps=con.prepareStatement("insert into toys values(?,?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setDouble(3,price );
	ps.setInt(4, quantity);
    //execution of statement
	ps.execute();
   //close
	ps.close();
	con.close();
	System.out.println("Inserted "+name);}
	 catch (Exception e) {
		 System.err.println(e.getMessage());
	}
	
	
	
}
}

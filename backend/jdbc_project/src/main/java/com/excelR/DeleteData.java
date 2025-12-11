package com.excelR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DeleteData {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String query="delete from toys where id=?";
		
		DriverManager.registerDriver(new Driver()); 
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/database1","root","root");
		PreparedStatement ps=con.prepareStatement(query);
		System.out.println("Enter id to delete your toy : ");
		int id=sc.nextInt();
		ps.setInt(1, id);
        int res=ps.executeUpdate();
        if(res>0)
        System.out.println("toy deleted successfully");
        else
        	System.out.println("Toy id : "+id +" is not exist to delete");
	    ps.close();
	    con.close();
	}
}

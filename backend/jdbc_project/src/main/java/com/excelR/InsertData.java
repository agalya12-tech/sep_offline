package com.excelR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertData {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement s=null;
		try {
//          Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new Driver());
			String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String pwd = "root";
			con = DriverManager.getConnection(url, user, pwd);
			s = con.createStatement();
			s.execute("insert into database1.toys values(1,'superman',450,10)");
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
			con.close();
		}

	}
}

package com.excelR;

import java.sql.*;


import com.mysql.cj.jdbc.Driver;

public class FetchRecords {
	public static void main(String[] args) throws SQLException {
		String query="select * from toys where id=1 and name='superman'";
		DriverManager.registerDriver(new Driver()); 
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/database1","root","root");
	    Statement s=con.createStatement();
//	    System.out.println(s.execute(query));
	    ResultSet rs = s.executeQuery(query);
        if(rs.next()) {
        	System.out.println("ID : "+rs.getInt("id"));
        	System.out.println("Name : "+rs.getString("name"));
        	System.out.println("Price : "+rs.getDouble("price"));
        	System.out.println("Quanity : "+rs.getInt("quantity"));
        	System.out.println("====================");
        }
	    s.close();
	    con.close();
	}

}


/*
 * execute()
 * DML -data manipulation language
 *      (insert , update ,delete)  --false
 * DQL  -data query language
 *       (select)--true
 *       
 *       
 * executeQuery()
 * DQL---ResultSet
 * DMl---Exception
 * */






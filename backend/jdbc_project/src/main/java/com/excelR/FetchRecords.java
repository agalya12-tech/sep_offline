package com.excelR;

import java.sql.*;


import com.mysql.cj.jdbc.Driver;

public class FetchRecords {
	public static void main(String[] args) throws SQLException {
		String query="select * from toys";
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
	    Statement s=con.createStatement();
	  
//	    System.out.println(s.execute(query));
	    System.out.println(s.executeQuery(query));

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






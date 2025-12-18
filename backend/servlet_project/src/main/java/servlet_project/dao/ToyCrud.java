package servlet_project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

import servlet_project.dto.Toy;

public class ToyCrud {
	public int insertToy(Toy toy) throws SQLException {

		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into toys values(?,?,?,?)");
		ps.setInt(1, toy.getId());
		ps.setString(2, toy.getName());
		ps.setDouble(3, toy.getPrice());
		ps.setInt(4, toy.getQuantity());
		int res = ps.executeUpdate();
		ps.close();
		con.close();
		return res;
	}

	public List<Toy> fetchToys() throws SQLException {
		String query = "select * from toys";
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root", "root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		List<Toy> list = new ArrayList<Toy>();
		while (rs.next()) {
			list.add(new Toy(rs.getInt(6), rs.getString(2), 
					rs.getDouble("price"), rs.getInt(4)));

		}
		s.close();
		con.close();
		return list;
	}

}

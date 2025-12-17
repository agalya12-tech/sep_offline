package servlet_project.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

import servlet_project.dto.Toy;
public class ToyCrud {
	public int insertToy(Toy toy) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/database1?user=root&password=root");
		PreparedStatement ps=con.prepareStatement
				("insert into toys values(?,?,?,?)");
		ps.setInt(1, toy.getId());
		ps.setString(2, toy.getName());
		ps.setDouble(3,toy.getPrice() );
		ps.setInt(4, toy.getQuantity());
		int res=ps.executeUpdate();
		ps.close();
		con.close();
		return res;
	}
}

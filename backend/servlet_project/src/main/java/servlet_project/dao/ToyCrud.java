package servlet_project.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
public class ToyCrud {
	public int insertToy(int id, String name,double price,int quantity) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/database1?user=root&password=root");
		PreparedStatement ps=con.prepareStatement("insert into toys values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3,price );
		ps.setInt(4, quantity);
		int res=ps.executeUpdate();
		ps.close();
		con.close();
		return res;
	}
}

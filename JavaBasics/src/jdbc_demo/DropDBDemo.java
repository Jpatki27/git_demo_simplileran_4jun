package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDBDemo {
	
			
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			String dbUrl = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "root";
			String query = "drop Database sample;";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
	}

}

package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "delete from movies where title = 'Resident Evil';";
		//String query = "Update movies Set director = 'Arnold' where title = 'Resident Evil';";
		//String query = "Insert into movies Value (\"Resident Evil\", \"Action\", \"Keifer Sutherland\", 2015);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
	}


}

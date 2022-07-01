package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/Amazon_Mobile";
		String username = "root";
		String password = "root";
		//String query = "delete from movies where title = 'Resident Evil';";
		//String query = "Update movies Set director = 'Arnold' where title = 'Resident Evil';";
		String query = "Insert into products Value (\"Samsung\", \"S21-Ultra\", \"899.99"\;";"
		String query2 = "Insert into products Value (\"Apple\", \"iPhone 13\", 1099.99);";
//				+ "(\"Samsung\", \"Galaxy A13\", 189.99)"
//				+ "(\"Samsung\", \"Galaxy S22+\", 999.92)"
//				+ "(\"OnePlus\", \"Nord N10\", 198.00)"
//				+ "(\"Apple\", \"iPhone 11 Pro\", 464.95);";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
	}


}

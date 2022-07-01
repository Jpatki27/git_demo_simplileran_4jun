package AmazonMobileTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsertion {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//1) Create DB Connection
		String dbUrl = "jdbc:mysql://localhost:3306/Amazon_Mobile";
		String username = "root";
		String password = "root";

	//2) Insert rows into products table
		String query = "Insert into products Value (\"Samsung\", \"S21-Ultra\", 899.99);";
		String query2 = "Insert into products Value (\"Apple\", \"iPhone 13\", 1099.99);";
		String query3 =	"Insert into products Value (\"Samsung\", \"Galaxy A13\", 189.99);";
		String query4 =	"Insert into products Value (\"Samsung\", \"Galaxy S22+\", 999.92);";
		String query5 =	"Insert into products Value (\"OnePlus\", \"Nord N10\", 198.00);";
		String query6 =	"Insert into products Value (\"Apple\", \"iPhone 11 Pro\", 464.95);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		stmt.executeUpdate(query2);
		stmt.executeUpdate(query3);
		stmt.executeUpdate(query4);
		stmt.executeUpdate(query5);
		stmt.executeUpdate(query6);
	
	
   //3) Return Table rows	
		String dbQuery = "Select * from products;";
		ResultSet rs = stmt.executeQuery(dbQuery);
		
		while (rs.next()) {
		System.out.print("Brand: " + rs.getString("brand") + " \t");
		System.out.print("Model: " + rs.getString("model") + " \t");
		System.out.print("Price: " + rs.getString("Price") + " \t");
		System.out.println();
		}
	}
}

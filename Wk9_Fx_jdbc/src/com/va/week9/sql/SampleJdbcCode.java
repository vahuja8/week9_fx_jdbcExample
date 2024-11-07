package com.va.week9.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJdbcCode  {
	
	public void runJdbcCode() {

 {
		
		
		String url = "jdbc:mysql://localhost:3306/comp228_13"; // table details
		String username = "root"; // MySQL credentials
		String password = "class123"; // password of your database..

		String query = "select * from student"; // query to be run
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // this is to load the database driver.. 
			// would change as per the database to be used.. 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		} // Driver name
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Established successfully");
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// setup the connection.. for db.. 
		ResultSet rs = null;
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Execute the sql query
		try {
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fname;
		try {
			fname = rs.getString("firstName");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Retrieve name from db
		String lname;
		try {
			lname = rs.getString("lastName");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // close statement
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // close connection
		System.out.println("Connection Closed....");
	}
	}
}

package com.va.week9.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJdbcCode {

	public static void main(String[] args) throws SQLException {
		
		
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
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		Statement st = con.createStatement();
		// setup the connection.. for db.. 
		ResultSet rs = st.executeQuery(query); // Execute the sql query
		rs.next();
		String fname = rs.getString("firstName"); // Retrieve name from db
		String lname = rs.getString("lastName");

		System.out.println(fname + lname); // Print result on console
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
	
}

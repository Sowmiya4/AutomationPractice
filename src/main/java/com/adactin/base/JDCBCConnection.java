package com.adactin.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDCBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// url= jdbc:db_type://ipaddress:port/db_name
		String url = "jdbc:mysql://localhost:3306/world";

		String username = "root";

		String password = "admin";

		String query = "select * from world.city";

		// Load the driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create a connection
		Connection con = DriverManager.getConnection(url, username, password);

		// Create Statement Object for query
		Statement st = con.createStatement();

		// execute the query
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String string = rs.getString(2);

			if (string.equalsIgnoreCase("pondicherry")) {
				System.out.println(string);

			}
		}

	}

}

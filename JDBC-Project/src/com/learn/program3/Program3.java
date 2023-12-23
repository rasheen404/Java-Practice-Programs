package com.learn.program3;

//import java.sql package.
import java.sql.*;

public class Program3 {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";

		// Query to be Executed
		String query = "INSERT INTO STUDENT VALUES(3,'MOHAN'),(4,'MOHIT')";
		try {

			// Loading the Driver

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully.");

			// Establish the Connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			// Creating the Statement.
			Statement statement = connection.createStatement();

			// Executing the Query
			statement.execute(query);
			System.out.println("query executed successfully. ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

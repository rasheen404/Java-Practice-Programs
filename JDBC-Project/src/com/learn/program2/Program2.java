package com.learn.program2;

//1. import java.sql package.
import java.sql.*;

public class Program2 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";

		String query = "CREATE TABLE STUDENT(ROLL INT , NAME VARCHAR(10))";
		try {

			// 2.Loading the Driver

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully.");

			// 3. Establish the Connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			Statement statement = connection.createStatement();
			statement.execute(query);
			System.out.println("query executed successfully. ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

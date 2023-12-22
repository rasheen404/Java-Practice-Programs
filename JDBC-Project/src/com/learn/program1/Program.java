package com.learn.program1;

//1. import java.sql package.
import java.sql.*;

public class Program {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		try {

			// 2.Loading the Driver

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully.");

			// 3. Establish the Connection
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

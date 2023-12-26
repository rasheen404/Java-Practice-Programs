package com.Hospital.ADDBATCH;

import java.sql.*;
import java.util.Scanner;

public class AddBatch {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		String query = "INSERT INTO HOSPITAL VALUES(?,?,?)";

		try {
//Establishing the Connection.
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			Scanner scanner = new Scanner(System.in);

			// Retreiveing number of Rows from User
			System.out.print("Enter the Number of Rows to be Inserted : ");
			int rows = scanner.nextInt();

			// preparing Statement Connection for query
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Retriveing data from User .
			for (int i = 1; i <= rows; i++) {
				System.out.println("Enter the id of patient " + i + " : ");
				int p_id = scanner.nextInt();
				System.out.println("Enter the name of patient " + i + " : ");
				String p_name = scanner.next();
				System.out.println("Enter the age of patient " + i + " : ");
				int p_age = scanner.nextInt();

				preparedStatement.setInt(1, p_id);
				preparedStatement.setString(2, p_name);
				preparedStatement.setInt(3, p_age);

				// Adding Data to Batch
				preparedStatement.addBatch();

			}

			// Executing the Batch
			preparedStatement.executeBatch();
			System.out.println("Query is Executed successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

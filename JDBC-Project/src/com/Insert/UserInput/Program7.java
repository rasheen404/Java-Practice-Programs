package com.Insert.UserInput;

//import java.sql package.
import java.sql.*;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";

		// Query to be Executed
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		try {

			// Loading the Driver

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully.");

			// Establish the Connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			// Creating the Statement.
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Employee ID : ");
			int emp_id = scanner.nextInt();
			System.out.print("Enter the Employee Name : ");
			String emp_name = scanner.next();
			System.out.print("Enter the Employee Salary : ");
			int emp_salary = scanner.nextInt();

			preparedStatement.setInt(1, emp_id);
			preparedStatement.setString(2, emp_name);
			preparedStatement.setInt(3, emp_salary);

			// Executing the Query
			preparedStatement.execute();
			System.out.println("query executed successfully. ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

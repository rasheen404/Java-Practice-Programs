package com.Employee.userinput;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.Query;

public class EmployeeJDBC {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Choice : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				insert(connection);
				break;
			case 2:
				update(connection);
				break;

			case 3:
				delete(connection);
				break;

			case 4:
				fetchData(connection);
				break;

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	static void insert(Connection connection) throws Exception {
		PreparedStatement preparedStatement = null;

		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Employee ID : ");
		int emp_id = scanner.nextInt();
		System.out.print("Enter the Employee Name : ");
		String emp_name = scanner.next();
		System.out.print("Enter the Employee Salary : ");
		int emp_salary = scanner.nextInt();

		preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, emp_id);
		preparedStatement.setString(2, emp_name);
		preparedStatement.setInt(3, emp_salary);
		preparedStatement.execute();

		System.out.println("Row is Inserted.");
	}

	static void update(Connection connection) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "UPDATE EMPLOYEE SET EMP_NAME=? WHERE EMP_ID=?";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Employee Name : ");
		String emp_name = scanner.next();
		System.out.print("Enter the Employee ID : ");
		int emp_id = scanner.nextInt();

		preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, emp_name);
		preparedStatement.setInt(2, emp_id);
		preparedStatement.executeUpdate();

		System.out.println("Row is Updated.");
	}

	static void delete(Connection connection) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID=?";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Employee ID : ");
		int emp_id = scanner.nextInt();

		preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, emp_id);
		preparedStatement.execute();

		System.out.println("Row are Deleted.");
	}

	static void fetchData(Connection connection) throws Exception {
		PreparedStatement preparedStatement = null;
		String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID=?";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Employee ID : ");
		int emp_id = scanner.nextInt();

		preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, emp_id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
		}
		System.out.println("Row are Fetched.");
	}

}

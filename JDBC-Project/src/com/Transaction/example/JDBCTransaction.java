package com.Transaction.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCTransaction {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		String query1 = "UPDATE BANK SET BALANCE = BALANCE-? WHERE Account_no = 1111 "; // ? mark is Place Holder
		String query2 = "UPDATE BANK SET BALANCE = BALANCE+? WHERE Account_no = 3333 ";// ? mark is Place Holder

		try {
			// Connection is Establishing to DataBase.
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			// preparing the Statement for the Query
			PreparedStatement preparedStatement1 = connection.prepareStatement(query1);
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);

			// Retrieving the Amount From the user input and Storing in the Amount Variable.
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Amount to be Transfered : ");
			int Amount = scanner.nextInt();

			// Setting the user entered input in the place Holder of the Query
			preparedStatement1.setInt(1, Amount);
			preparedStatement2.setInt(1, Amount);

			// Executing the query of first and giving the output
			preparedStatement1.executeUpdate();
			System.out.println("Amount is Debited From Account Number 1111.");

			// Executing the Query of 2 and Giving the output
			preparedStatement2.executeUpdate();
			System.out.println("Amount is Credited to Account Number 3333.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

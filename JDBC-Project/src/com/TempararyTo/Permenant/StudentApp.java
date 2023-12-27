package com.TempararyTo.Permenant;

import java.sql.*;

public class StudentApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		Connection connection = null;
		String query = "INSERT INTO STUDENT VALUES(?,?,?)";

		try {

			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			Student student1 = new Student(1, "ANKIT", 74);
			preparedStatement.setInt(1, student1.roll_no);
			preparedStatement.setString(2, student1.name);
			preparedStatement.setInt(3, student1.mark);
			preparedStatement.execute();

			Student student2 = new Student(2, "AJAY", 87);
			preparedStatement.setInt(1, student2.roll_no);
			preparedStatement.setString(2, student2.name);
			preparedStatement.setInt(3, student2.mark);
			preparedStatement.execute();

			Student student3 = new Student(3, "ARUN", 96);
			preparedStatement.setInt(1, student3.roll_no);
			preparedStatement.setString(2, student3.name);
			preparedStatement.setInt(3, student3.mark);
			preparedStatement.execute();

			System.out.println("Temperary object is successdullty Stored in Permenent Object.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

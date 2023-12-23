
import java.sql.*;
import java.util.Scanner;

public class EmpJDBC {

	public static void main(String[] args) {
		// Url,username,password for connecting with DataBase.
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "admin";
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established.");

			statement = connection.createStatement();
			System.out.println("Statement is Ready.");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Choice : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				insert(statement);
				break;
			case 2:
				update(statement);
				break;

			case 3:
				delete(statement);
				break;

			case 4:
				fetchData(statement);
				break;

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	static void insert(Statement statement) throws Exception {
		String query = "INSERT INTO EMPLOYEE VALUES(1,'AJAY',35000),(2,'ARUN',45000),(3,'SONU',40000)";
		statement.execute(query);
		System.out.println("Row is Inserted.");
	}

	static void update(Statement statement) throws Exception {
		String query = "UPDATE EMPLOYEE SET EMP_NAME='ANUJ' WHERE EMP_ID=2";
		statement.executeUpdate(query);
		System.out.println("Row is Updated.");
	}

	static void delete(Statement statement) throws Exception {
		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID=3";
		statement.execute(query);
		System.out.println("Row are Deleted.");
	}

	static void fetchData(Statement statement) throws Exception {
		String query = "SELECT * FROM EMPLOYEE";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
		}
		System.out.println("Row are Fetched.");
	}
}

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of Student : ");
		int Studentcount = scanner.nextInt();

		Student[] arr = new Student[Studentcount];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the rollNo of Student " + (i + 1) + ": ");
			int RollNo = scanner.nextInt();

			System.out.println("Enter the Name " + (i + 1) + ":");
			String Name = scanner.next();

			System.out.println("Enter the Age " + (i + 1) + ": ");
			int Age = scanner.nextInt();

			arr[i] = new Student(RollNo, Name, Age);

		}
		System.out.println("Student details are : ");
		for (int i = 0; i <= arr.length - 1; i++)

		{
			System.out.println(arr[i].RollNo + " " + arr[i].Name + " " + arr[i].Age);
		}
	}

}

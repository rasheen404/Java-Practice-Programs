
public class StudentApp {

	public static void main(String[] args) {

		Student s1 = new Student(11, "Ajay", 22);
		Student s2 = new Student(12, "Amit", 25);
		Student s3 = new Student(13, "Arjun", 23);

		Student[] arr = new Student[3];

		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;

		for (int i = 0; i <=arr.length-1; i++)

		{
			System.out.println(arr[i].RollNo+" "+arr[i].Name+" "+arr[i].Age);
		}
	}

}

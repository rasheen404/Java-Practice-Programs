
public class Fibonacci {
	public static void Series(int n)
	{
		int firstterm = 0;
		int secondterm = 1;
		for (int i=firstterm;i<n;i++)
		{
			System.out.print(firstterm + ", ");
			int nextterm = firstterm + secondterm ;
			firstterm = secondterm;
			secondterm = nextterm ;
			
		}

	}

}

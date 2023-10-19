package FibonacciSeries;

public class FibonacciSeries {
	public static void Fibonocci(int n)
	{
		int firstterm = 0;
		int secondterm = 1;
		for(int i =1;i<=n;i++)
		{
			System.out.println(firstterm + " ");
			int thirdterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = thirdterm;
		}
	}

}


public class FindGcd {
	public static int gcd(int m,int n) {
		int rem;
		while (n!=0)
		{
			rem = m%n;
			m=n;
			n=rem;
			
		}
		return m;
	}

}

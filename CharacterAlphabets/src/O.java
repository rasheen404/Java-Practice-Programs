
public class O {

	public static void Oo(char ch,int n) {
		for(int i = 0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0|| i==n-1||j==0 || j ==n-1)
				{ 
					System.out.print(ch);
				}
				else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}





}

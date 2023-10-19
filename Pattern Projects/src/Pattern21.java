
public class Pattern21 {
public static void main(String[] args) {
	int num =01;
	
	for(int i = 1;i<=4;i++)
	{
		for(int j = 1;j<=4;j++)
		{ if(num<10)
		{
			System.out.print("0"+num+" ");
		}
		else
		{
			System.out.print(num+" ");
		}
			num++;
		}
		System.out.println();
	}
}
}

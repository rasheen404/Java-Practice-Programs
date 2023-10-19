
public class Bonus {
	public  static void CheckBonus(int n)
	{
		if (n >= 10000 && n < 20000)
		{	
			int bonus = n + (15*n)/100;
			System.out.println("Your Inhand salary after Bonus is : " + bonus);
		}
		if (n >= 20000 && n < 50000)
		{	
			int bonus = n + (20*n)/100;
			System.out.println("Your Inhand salary after Bonus is : " + bonus);
		}
		if (n > 50000)
		{	
			int bonus = n + (30*n)/100;
			System.out.println("Your Inhand salary after Bonus is : " + bonus);
		}
		if (n < 10000)
		{	
			int bonus = n + 2000;
			System.out.println("Your Inhand salary after Bonus is : " + bonus);
		}
	}

}

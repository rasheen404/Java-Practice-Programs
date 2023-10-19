package SumofDigits;

public class SumofDigits {
	public static int  DigitSum(int num) {
		
		int result = 0;
		
		while(num > 0)
		{ 
			result = result + num%10;  
			
			num = num / 10;
		}
		
		return result ;
		
	}

}

package learn.CustomException.AtmApp;

public class InsufficiantBalanceException extends Exception{
	public  InsufficiantBalanceException()
	{
		super("Amount is morethan Balance.");
	}

}

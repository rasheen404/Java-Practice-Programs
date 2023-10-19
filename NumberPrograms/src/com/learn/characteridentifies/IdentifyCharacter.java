package com.learn.characteridentifies;

public class IdentifyCharacter {
	public static void Characteridentify(char ch)
	{
	if(ch>='A' && ch<='Z')
	{
		if(ch == 'A' ||ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
		{
			System.out.println("It is a Upper-Case Vowels");
		}
		else {
			System.out.println("Upper-Case Consonant.");
		}
	}
	else if(ch>='a' && ch<='z'){

		if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{
			System.out.println("It is a Lower-Case Vowels");
		}
		else {
			System.out.println("Lower-Case Consonant.");
		}
	
		
	}
	else if(ch>='0' && ch<='9')
	{
		System.out.println("It is a Digits.");
	}
	
	else {
		System.out.println("It is a Special Charecter");
	}

}
}


import java.util.*;
public class ForEachLoop {
	public static void main(String[] args) {
		
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		// for (datatype  indexStart : IN variableName)
		

String[] animal = {"cat","dog","rat","bird"};

for(String i : animal)
{
	System.out.println(i);
}

System.out.println();

//-----------------------EXAMPLE------------------------

		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
	}
}
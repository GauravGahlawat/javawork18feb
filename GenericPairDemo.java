import java.util.Scanner;

public class GenericPairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair <String> secretPair = new Pair <String> ("Happy", "Day");
		
		Pair <Integer> secretPair1 = new Pair <Integer> (10, 20); // created integer 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words :");
		
		String word1 = keyboard.next();
		String word2 = keyboard.next();
		
		Pair <String> inputPair = new Pair <String> (word1, word2);		

		
		if(inputPair.equals(secretPair))
		{
			System.out.println("You Guessed The Secret word");
			System.out.println("In The Correct Order!");
		}
		else
		{
			System.out.println("You Guessed Incorrectly");
			System.out.println("You Guessed!");
			System.out.println(inputPair);
			System.out.println("The Secret words are :");
			System.out.println(secretPair);
			
		}
		secretPair1.display(); // 

	}

}

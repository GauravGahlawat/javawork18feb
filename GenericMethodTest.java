
public class GenericMethodTest {
	
	// generic method printArray
	
	public static <E> void printArray ( E[] inputArray)
	{
		// display array elements
		
		for(E element : inputArray )
		{
			System.out.printf(" %s " , element); // using native methods
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// create array of Integers , double & Character
		
		Integer[] intarray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println(" Array IntegerArray contains :");
		printArray(intarray); // pass an Integer Array
		
		System.out.println("\n Array DoubleArray contains :");
		printArray(doubleArray); // pass an Integer Array
		
		System.out.println("\n Array CharacterArray contains :");
		printArray(charArray); // pass an Integer Array
		
		
		

	}

}

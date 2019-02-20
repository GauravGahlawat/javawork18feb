import java.util.List;
import java.util.ArrayList;

class PlayerList
{
	ArrayList playerArray;
	List subListObj;
	
	PlayerList()
	{
		
		playerArray = new ArrayList();
		
		subListObj = new ArrayList();
	}
	
	void add()
	{
		for(int ctr = 0 ; ctr < 5 ; ctr++ )
		{
			playerArray.add(new Integer(ctr));
		}
		playerArray.add("Martina");
		playerArray.add("Serena");
		playerArray.add("Venus");
		playerArray.add("Serena");
		System.out.println();
	}
	
	void search()
	{
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Search For An Object And Return the first and last position");
		System.out.println("**********************************************************************");
		System.out.println();
		System.out.println("first occurence Of The String " + "\" Serena\" is at position " + 
								playerArray.indexOf("Serena"));
		System.out.println("Last occurence Of The String " + "\" Serena\" is at position " + 
								playerArray.lastIndexOf("Serena"));
		System.out.println();
	}
		
	void display()
	{
		System.out.println("**********************************************************************");
		System.out.println("Retrieve Objects From The ArrayList ");
		System.out.println("**********************************************************************");
		System.out.println();
		for(int ctr = 0; ctr < playerArray.size(); ctr++ )
		{
			System.out.println(" " + playerArray.get(ctr));
		}
	}
	
	void extract()
	{
		System.out.println("**********************************************************************");
		System.out.println("Extract a Sublist and then print The New List ");
		System.out.println("**********************************************************************");
		System.out.println();
		subListObj = playerArray.subList(5, playerArray.size());
		System.out.println("New Sub-List From Index 5 To " + playerArray.size() + " is : " + subListObj);
		System.out.println();
		
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayerList obj = new PlayerList();
		obj.add();
		obj.display();
		obj.search();
		obj.extract();

	}

}

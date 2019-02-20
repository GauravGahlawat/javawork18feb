import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// linked list declaration
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		System.out.println("Linked List Content :" + linkedlist);
		
		linkedlist.offer("Item100");
		System.out.println("Linked List Content :" + linkedlist);
		
		// add first and last element
		
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		
		System.out.println("Linked List Content After Addition :" + linkedlist);
		
		Object firstvar = linkedlist.get(0);
		System.out.println("First Element :" + firstvar);
		linkedlist.set(0,  "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First Element after Update By Set Method : " + firstvar2);

		// remove first and last element
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("Linked List After deletion of first and last element :" +linkedlist);
		
		// add to position and remove from position
		
		linkedlist.add(0, "Newly Added Item");
		linkedlist.remove(2);
		System.out.println("Final Content :" + linkedlist);
		

	}

}

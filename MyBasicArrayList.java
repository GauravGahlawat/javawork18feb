import java.util.ArrayList;
import java.util.Collections;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class MyBasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> p1=new ArrayList <String>() ;
		//ADD ELEMENTS
		p1.add("JAVA");
		p1.add("C++");
		p1.add("PERL");
		p1.add("PHP");
		System.out.println(p1);
		
		// get elements by index

		System.out.println();
		System.out.println("Element At Index 1 :" + p1.get(1));
		System.out.println();
		System.out.println("Does List Contains JAVA ? " + p1.contains("JAVA"));
		System.out.println();
		
		// add element at a specific index
		
		p1.add(2,"PLAY");
		System.out.println(p1);
		System.out.println();
		System.out.println("Is Array List empty ? " + p1.isEmpty());
		System.out.println();
		System.out.println("Index Of PERL Is : " + p1.indexOf("PERL"));
		System.out.println();
		System.out.println("Size Of The ArrayList Is : " + p1.size());
		System.out.println();
		Collections.sort(p1);
		System.out.println(p1);		
	}

}

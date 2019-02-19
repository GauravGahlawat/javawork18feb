import java.util.*;

public class TestVector1 {
	
	public static void main(String args[])
	{
		Vector <String> v=new Vector <String>();
		v.add("umesh"); // method of Collection
		v.addElement("john"); // method of vector
		v.addElement("kumar");
		
		
		// traversing elements using enumeration
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}

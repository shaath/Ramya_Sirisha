package javaprogrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		
		//Writing the data into hashset
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Apple");
		s.add("Boll");
		s.add("Cat");
		s.add("Apple");
		
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String data=it.next();
			System.out.println(data);
		}
		

	} 

}

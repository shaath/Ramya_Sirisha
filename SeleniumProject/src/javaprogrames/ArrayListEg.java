package javaprogrames;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<>();
		
		//Writing the data into arraylist
		
		s.add("Selenium");
		s.add("UFT");
		s.add("Ramya");
		s.add("Sirisha");
		s.add(2, "UFT");
		s.add(null);
		
		//Reading the data from arraylist
		
//		System.out.println(s.get(1));
		
		//Finding the length of the arraylist
		
		System.out.println(s.size());
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}
		

	}

}

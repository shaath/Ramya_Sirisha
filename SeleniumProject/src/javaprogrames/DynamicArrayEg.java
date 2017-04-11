package javaprogrames;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		//Finding the length 
		System.out.println(x.length);
		
		//Write the data into an array
		
		x[2]="Ramya";
		x[0]=60000;
		x[2]="Selenium";
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
	}

}

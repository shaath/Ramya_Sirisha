package javaprogrames;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		int[] sal={30000,40000,50000,60000,70000,80000};
		
		//Finding the length of the array
		
		System.out.println(sal.length);
		
		//Reading the value from the array
		int s=sal[5];
//		System.out.println(sal[6]);
		

//		for (int i = 0; i < sal.length; i++) 
//		{
//			System.out.println(sal[i]);
//		}
		
		
		for (int Ramya : sal)
		{
			System.out.println(Ramya);
		}
	}

}

package javaprogrames;

public class ForEg {

	public static void main(String[] args) 
	{
		for(int i=1; i <= 10; i++)
		{
			System.out.println(i);
			if (i==7) 
			{
				break;
			}
		}
		System.out.println("----");
		
		for(int j=10; j>=1 ; j--)
		{
			System.out.println(j);
		}

	}

}

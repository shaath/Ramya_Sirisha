package javaprogrames;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];

		//Finding the length of the rows
		int len=x.length;
		System.out.println(len);
		
		//Finding the length of the columns
		
		System.out.println(x[0].length);
		
		//Write the data into an array
		
		x[0][1]="Ramya";
		x[1][2]="Selenium";
		
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
				
			}
		}
		
		
	}

}

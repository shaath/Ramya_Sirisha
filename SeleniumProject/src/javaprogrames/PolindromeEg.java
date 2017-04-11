package javaprogrames;

public class PolindromeEg {

	public static void main(String[] args) 
	{
		String Rev="";
		String Org="Malayalam";// aymaR
		Org="Ramya";
		int len=Org.length();
				
		for (int i = len-1; i >= 0; i--) 
		{
			Rev=Rev+Org.charAt(i);
		}
		System.out.println(Rev);
		if (Org.equalsIgnoreCase(Rev))
		{
			System.out.println("The Given String is Polindrome");
		}
		else
		{
			System.out.println("The given String is not a polindrome");
		}
	}

}

package javaprogrames;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="Selenium"; //muineleS
		
//		System.out.println("The length of the String is "+course.length());
//		
//		
//		System.out.println("The 5 th indexed charcter is "+course.charAt(5));
		int len=course.length();
		
		for (int i = 0; i < course.length(); i++) 
		{
			System.out.println(course.charAt(i));
			
		}
		System.out.println("*****");
		for (int i = len-1; i >= 0; i--)
		{
			System.out.print(course.charAt(i));
		}
	}

}

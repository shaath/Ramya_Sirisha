package javaprogrames;

public class SwitchcaseEg {

	public static void main(String[] args) 
	{
		String course="selenium";
		switch (course)
		{
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "Uft":
			System.out.println("You are selected Uft");
			break;
		case "selenium":
			System.out.println("You are selected Selenium");
			break;
		case "LoadRunner":
			System.out.println("You are selected Loaed Runner");
			break;
			
		default:
			System.out.println("Select a proper course");
			break;
		}
	}

}

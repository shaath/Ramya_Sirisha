package javaprogrames;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] s={20000,"Sharath",'M',false,4444.44};
		
		System.out.println(s.length);
		
		for (Object data : s) 
		{
			System.out.println(data);
		}

	}

}

package methods;

public class LoginTC {

	public static void main(String[] args) 
	{
		OrgHRMMaster om=new OrgHRMMaster();
		

		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("The appplication launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Applciation Login "+res );
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
	}

}

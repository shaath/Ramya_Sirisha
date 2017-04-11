package methods;

public class TestSuiteEg {

	public static void main(String[] args)
	{
		//Login
		
		OrgHRMMaster om=new OrgHRMMaster();
		

		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("The appplication launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Applciation Login "+res );
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
		
		//Empreg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("The appplication launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Applciation Login "+res );
		
		res=om.org_Empreg("Sirisha", "Ramya");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");

		//Userreg
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("The appplication launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Applciation Login "+res );
		
		res=om.org_Userreg("Sirisha Ramya", "SirishaRamya123456", "SirishaRamya123456", "SirishaRamya123456");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
		
		//UserLogin
		
		res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("The appplication launch "+res);
		
		res=om.org_Login("SirishaRamya123456", "SirishaRamya123456");
		System.out.println("Applciation Login "+res );
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application Close successfull");
	}

}

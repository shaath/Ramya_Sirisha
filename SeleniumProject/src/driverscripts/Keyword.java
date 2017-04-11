package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword 
{
	public static void main(String[] args) throws IOException 
	{
		String xlpath="F:\\Ramya\\SeleniumProject\\src\\testData\\Keyword.xlsx";
		String xlout="F:\\Ramya\\SeleniumProject\\src\\results\\keyres.xlsx";
		String res=null;
		OrgHRMMaster om=new OrgHRMMaster();
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							res=om.Org_Launch(ws2.getRow(1).getCell(0).getStringCellValue());
							
							break;
						case "login":
							res=om.org_Login(ws2.getRow(1).getCell(1).getStringCellValue(), ws2.getRow(1).getCell(2).getStringCellValue());
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							res=om.org_Empreg(ws2.getRow(1).getCell(3).getStringCellValue(), ws2.getRow(1).getCell(4).getStringCellValue());
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							String u=ws2.getRow(1).getCell(6).getStringCellValue();
							String p=ws2.getRow(1).getCell(7).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//To update the results in test steps sheet
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						//Update the result in test case sheet
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}

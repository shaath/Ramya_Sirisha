package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMAster
{
	@Test(dataProvider="data")
	public void org_Empreg(String f, String l)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][]  d=new Object[3][2];
		
		d[0][0]="Venki";
		d[0][1]="CH";
		
		d[1][0]="Sandeep";
		d[1][1]="G";
		
		d[2][0]="Harish";
		d[2][1]="P";
		
		return d;
		
	}
}

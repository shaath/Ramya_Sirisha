package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasicMethods 
{
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethods bm=new BasicMethods();
		
		bm.Function3();
		
		boolean flag=bm.function4();
		System.out.println(flag);
		
		
		int result=bm.sum(60,40);
		System.out.println(result);
	}

	//static method without returning any value
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static method with returning value
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Non static method without returning value
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning values
	
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	//Sum
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	
	public void Takes_Screenshot(WebDriver driver, String path,String name) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path+"\\"+name));

	}
	
	public void Click(WebDriver driver, String Loc, String value)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(value)).click();
		}
		else if (Loc.equalsIgnoreCase("classname"))
		{
			driver.findElement(By.className(value)).click();
		}
		else if (Loc.equalsIgnoreCase("tagname"))
		{
			driver.findElement(By.tagName(value)).click();
		}
		else if (Loc.equalsIgnoreCase("linktext"))
		{
			driver.findElement(By.linkText(value)).click();
		}
		else if (Loc.equalsIgnoreCase("partiallinktext"))
		{
			driver.findElement(By.partialLinkText(value)).click();
		}
		else if (Loc.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(value)).click();
		}
		else if (Loc.equalsIgnoreCase("cssselector"))
		{
			driver.findElement(By.cssSelector(value)).click();
		}
			
				
			}
}

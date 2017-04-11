package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args)
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links avaialble "+links.size());

		for (int i = 0; i < links.size(); i++)
		{
			String ltext=links.get(i).getText();
			
			if (!ltext.equalsIgnoreCase(""))
			{
				System.out.println(ltext);
				count++;
			}
		}
		
		System.out.println("The visible links count "+count);

	}

}

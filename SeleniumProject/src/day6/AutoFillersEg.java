package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("D");
		
		Thread.sleep(5000);

		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
			String city=list.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase("dindigul"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}

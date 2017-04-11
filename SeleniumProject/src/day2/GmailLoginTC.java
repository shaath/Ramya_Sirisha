package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginTC {

	public static void main(String[] args) 
	{
		//Launching the browser
		WebDriver driver=new FirefoxDriver();
		
		//Launch Gmail App
		driver.get("http://gmail.com");
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identification of email textbox
		
		WebElement email=driver.findElement(By.id("Email"));

		//Sending the text into email text box
		
		email.sendKeys("seleniumtrainer449");
		
		
//		email.clear();
		
		//Clicking next button
		
		driver.findElement(By.name("signIn")).click();
		
//		Sleeper.sleepTightInSeconds(15);
		
		//Enter The password
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		//Clck on the signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}

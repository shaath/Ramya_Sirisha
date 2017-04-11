package methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ReuseEg {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		BasicMethods bm=new BasicMethods();
		
		bm.Click(driver, "xpath", ".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a");
		Sleeper.sleepTightInSeconds(3);
//		int res=bm.sum(50, 60);
//		System.out.println(res);
		
		bm.Takes_Screenshot(driver, "F:\\Ramya\\SeleniumProject\\src\\screenshots", "Forgot.png");
	}

}

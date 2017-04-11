package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout_TC
{
	public static WebDriver driver;
	public static String expval,actval;
	@Given("^User launches the browser and launching application$")
	public void user_launches_the_browser_and_launching_application() throws Throwable
	{
		expval="LOGIN";
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^displays welcome admin message$")
	public void displays_welcome_admin_message() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(5);
		expval="Welcome Admin";
		actval=driver.findElement(By.partialLinkText("Welcome")).getText();
		Assert.assertEquals(expval, actval);
		Sleeper.sleepTightInSeconds(5);
	}

	@When("^User clicks on Welcome admin link$")
	public void user_clicks_on_Welcome_admin_link() throws Throwable 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also Clicks on logout$")
	public void also_Clicks_on_logout() throws Throwable 
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Login page displayed$")
	public void login_page_displayed() throws Throwable
	{
	   expval="LOGIN";
	   actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	   Assert.assertEquals(expval, actval);
	}

}

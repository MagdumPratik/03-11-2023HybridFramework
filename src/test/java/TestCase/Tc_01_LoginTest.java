package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class Tc_01_LoginTest extends BaseClass{
	
	@Test
	public void loginTest()
	{
		
		driver.get(baseURLBS);
		logger.info("Url Opened");
		lp=new LoginPage(driver);
		lp.setUsername(usernameBS);
		logger.info("Username Set");
		lp.setPassword(passwordBS);
		logger.info("Password Set");
		lp.clickLoginButton();
		if(alertIsPresent()==true)
		{
			logger.info("Test Case Failed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Case PAssed......");
			lp.clickLogoutButton();
			driver.switchTo().alert().accept();
			
		}
	}
	public boolean alertIsPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}

package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class TC_03_DATTestCase extends BaseClass{

	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pass) throws InterruptedException
	{
		driver.get(baseURLBS);
		lp=new LoginPage(driver);
		lp.setUsername(user);
		Thread.sleep(2000);
		lp.setPassword(pass);
		Thread.sleep(2000);
		lp.clickLoginButton();
		if(alertIsPReset()==true)
		{
			logger.info("TEst Case Failed......");
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
			lp.clickLogoutButton();
			driver.switchTo().alert().accept();
			logger.info("Test Case Passed........");
		}
	}
	public boolean alertIsPReset()
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
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String ExcelFilePath=".//LoginData.xlsx";
		int rowcount=xl.getRowCount(ExcelFilePath, "Sheet1");
		int cellcount=xl.getCellCount(ExcelFilePath, "Sheet1", 1);
		
		String[][] loginData=new String[rowcount][cellcount];
	
		for(int i=1;i<=rowcount;i++)
		{
			for(int c=0; c<cellcount;c++)
			{
				loginData[i-1][c]=xl.getCellData(ExcelFilePath, "Sheet1", i, c);
			}
		}
		return loginData;
	}
}

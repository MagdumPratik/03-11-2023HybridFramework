package TestCase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.github.javafaker.Faker;

import PageObject.AddCustomer;
import PageObject.LoginPage;
import Utilities.ReadConfig;
import Utilities.XLUtils;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public LoginPage lp;
	ReadConfig rd=new ReadConfig();
	XLUtils xl=new XLUtils();
	
	public String baseURLBS=rd.getApplicationURL();
	public String usernameBS=rd.getUsername();
	public String passwordBS=rd.getPassword();
	public  AddCustomer ad;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger=logger.getLogger("GuruBanking");
		PropertyConfigurator.configure("log4j.properties");
}
	public String generateEmail()
	{
		Faker faker=new Faker();
		return faker.internet().emailAddress();
	}
	
	@AfterClass
	public void tearUp()
	{
		driver.quit();
	}
	
}

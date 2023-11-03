package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	WebDriver ldriver;
	public AddCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement clkNewCust;
	
	public void clickNewCustomer()
	{
		clkNewCust.click();
	}
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customerName;
	
	public void setCustomerName(String name)
	{
		customerName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@value='f']")
	WebElement selectGen;
	
	public void selectGender()
	{
		selectGen.click();
	}
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOB;
	
	public void setDAte(String name)
	{
		DOB.sendKeys(name);
	}
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	public void setAddress(String name)
	{
		address.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	public void setCity(String name)
	{
		city.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	public void setState(String name)
	{
		state.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	public void setPin(String name)
	{
		pin.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobile;
	
	public void setMobile(String name)
	{
		mobile.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	public void setEmail(String name)
	{
		email.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	public void password(String name)
	{
		password.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement clkSave;
	
	public void clickSaveButton()
	{
		clkSave.click();
	}

}

package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath ="//button[text()=' Save ']")
	private WebElement save;
	
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement empid;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement emplist;
	
	public PIMPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void pimLink()
	{
		Wait.click(pim);
	}

	public String pimUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void clickAddEmployee() {
		Wait.click(addEmployee);
	}
	
	public void addInfo(String name ,String lastName) {
		Wait.sendKeys(fname, name);
		Wait.sendKeys(lname, lastName);
		Wait.click(save);
		
	}
	
	public String empId()
	{
		return Wait.getAttribute(empid,"value");
	}
	public void empList()
	{
		Wait.click(emplist);
	}
	}


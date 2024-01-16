package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
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
}

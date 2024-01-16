package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.When;

public class PIMPageSteps extends BaseClass{
    
	private static  PIMPage pim;
	
	@When("user click on pim link")
	public void user_click_on_pim_link() {
	    pim = new PIMPage();
	   pim.pimLink();
	}
	@When("user validate pim page url")
	public void user_validate_pim_page_url() {
	   String Pim = pim.pimUrl();
	  boolean b =  Pim.contains("pim");
	  Assert.assertEquals(b, true);
	}
	
	@When("Click on Add Employee")
	public void click_on_add_employee() {
	    pim.clickAddEmployee();
	}
	@When("user enter fname and lastname and click on save button")
	public void user_enter_fname_and_lastname_and_click_on_save_button() {
	    pim.addInfo("Vaibhav", "Koche");
	}
}

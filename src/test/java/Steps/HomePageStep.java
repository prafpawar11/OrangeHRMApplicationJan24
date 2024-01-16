package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	private static HomePage home;
	
	@When("user validate home page url")
	public void user_validate_home_page_url() {
	    home = new HomePage();
	   String url = home.homePageurl();
	  boolean a =  url.contains("orange");
	  Assert.assertEquals(a, true);
	}
	@When("user validate home page title")
	public void user_validate_home_page_title() {
	  String title = home.homePageTitle();
	  Assert.assertEquals(title, "OrangeHRM");
	}

}

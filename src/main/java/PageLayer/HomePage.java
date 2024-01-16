package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	public String homePageurl()
	{
	return 	driver.getCurrentUrl();
	}
	
	public String homePageTitle()
	{
		return driver.getTitle();
	}

}

package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodel {

	public pageobjectmodel(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser,this);
	}

	//enter email filed
	@FindBy(xpath="//input[@type=\'email\' and @class=\'whsOnd zHQkBf\']")
	private WebElement Email;
	public WebElement getEmail()
	{
		return Email;
	}
	
	
	
}

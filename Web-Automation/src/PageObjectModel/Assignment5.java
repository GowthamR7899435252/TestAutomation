package PageObjectModel;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		
		createCustomer();
		createproject();
		deleteproject();
		
		deleteCustomer();
			
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createCustomer()
	{
		try
		{
			// Clicking Main Task Button after login
			oPage.get1topnav().click();
			Thread.sleep(2000);
			
			//Clicking Add New button
			oPage.getcpTreeBlock().click();
			Thread.sleep(2000);
			
			//Clicking New Custamer Icon
			oPage.getitemcreateNewCustomer().click();
			Thread.sleep(2000);
			
			//Entering Custamer name Details
		      //Custamer Name
			oPage.getcustomerLightBox_nameField().sendKeys("Custamer1");
			  // description 
			oPage.getcustomerLightBox_descriptionField().sendKeys("custamer 1 description ");
			// clicking Cretae Custamer icon
			oPage.getcustomerLightBox_commitBtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createproject()
	{
		try
		{
			//clicking add new button
			oPage.get4cpTreeBlock().click();
			Thread.sleep(2000);
			
			// clicking create project icon
			oPage.getitemcreateNewProjectellipsis().click();
			Thread.sleep(2000);
			
			// entring names for Project
			oPage.getprojectPopup_projectNameField().sendKeys("Project1");
			Thread.sleep(2000);
			
			// project description
			oPage.getprojectDescriptionField().sendKeys("Project1 description");
			Thread.sleep(2000);
			
			// clicking create project icon
			oPage.getprojectPopup_commitBtn().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteproject()
	{
		try
		{
			// clicking edit button of projrct1
			oPage.get5cpTreeBlock().click();
			Thread.sleep(2000);
			
			// clicking action button
			oPage.get3taskListBlock().click();
			Thread.sleep(2000);
			
			// clicking delete button
			oPage.get4taskListBlock().click();
			Thread.sleep(2000);
			
			//clicking delete pemanently button
			oPage.getprojectPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteCustomer()
	{
		try
		{
			// clicking edit or settings button of custamer
			oPage.get1cpTreeBlock().click();
			Thread.sleep(2000);
			
			//Clicking Actions Button 
			oPage.gettaskListBlock().click();
			Thread.sleep(2000);
			
			//Clicking Delete Button
			oPage.get1taskListBlock().click();
			Thread.sleep(2000);
			
			// Clicking Delete permanently button
			oPage.getcustomerPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
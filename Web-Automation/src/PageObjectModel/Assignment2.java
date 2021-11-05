package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		
		createUser();
		modifyUser();
		deleteUser();
		
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
	
	static void createUser()
	{
		try
		{   
			//clicking main users icon
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//clicking ADD users icon
			oPage.getcreateUserDiv().click();
			Thread.sleep(2000);
			
			//entering names
			oPage.getuserDataLightBox_firstNameField().sendKeys("user1");
			oPage.getuserDataLightBox_middleNameField().sendKeys("M");
			oPage.getuserDataLightBox_lastNameField().sendKeys("L");
			oPage.getuserDataLightBox_emailField().sendKeys("Demo1@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("user11");
			oPage.getuserDataLightBox_passwordField().sendKeys("123");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("123");
			// clicking Create user icon
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyUser()
	{
		try
		{
			// selecting user 1
			oPage.get1userListTableContainer().click();
			Thread.sleep(2000);
			
			// clicking to password field for modification
			oPage.get1userDataLightBox_passwordField().sendKeys("u1");
			Thread.sleep(2000);
			
			// retyping password
			oPage.get1userDataLightBox_passwordCopyField().sendKeys("u1");
			Thread.sleep(2000);
			
			// clicking save changes icon
			oPage.get1userDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteUser()
	{
		try
		{
			//clicking user1 icon
			oPage.getuserListTableContainer().click();
			Thread.sleep(2000);
			
			//clicking delete Button
			oPage.getuserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			
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

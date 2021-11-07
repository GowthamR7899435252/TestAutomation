package ObjectMap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		
		createuser();
		deleteuser();
		
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
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
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createuser()
	{
		try
		{
			//Clicking main users icon
			oBrowser.findElement(objectmap.getLocator("clickingmainusersicon")).click();
			Thread.sleep(2000);
			
			//Clicking ADD-User Icon
			oBrowser.findElement(objectmap.getLocator("clikingaddusericon")).click();
			Thread.sleep(2000);
			
			//entering names for user1
			
			//first name
			oBrowser.findElement(objectmap.getLocator("firstnameforuser1")).sendKeys("user1");
			//middle name
			oBrowser.findElement(objectmap.getLocator("middlenameforuser1")).sendKeys("M");
			//last name
			oBrowser.findElement(objectmap.getLocator("lastnameforuser1")).sendKeys("L");
			//Email
			oBrowser.findElement(objectmap.getLocator("emailofuser1")).sendKeys("User1@gmail.com");
			//User id
			oBrowser.findElement(objectmap.getLocator("userid")).sendKeys("User11");
			//password
			oBrowser.findElement(objectmap.getLocator("password1")).sendKeys("123");
			//Retype Password
			oBrowser.findElement(objectmap.getLocator("retypepassword1")).sendKeys("123");
			Thread.sleep(1000);
			//Clicking Create user icon
			oBrowser.findElement(objectmap.getLocator("clickingcreateusericon1")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteuser()
	{
		try
		{
			//Selecting user1
			oBrowser.findElement(objectmap.getLocator("selectinguser1")).click();
			Thread.sleep(2000);
			//Clicking Delete Button
			oBrowser.findElement(objectmap.getLocator("clickingdeleteforuser1")).click();
			Thread.sleep(2000);
			//handling alert window
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
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
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
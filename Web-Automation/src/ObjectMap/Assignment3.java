package ObjectMap;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		
		createcustamer();
		deletecustamer();
		
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
	
	static void createcustamer()
	{
		try
		{
		  //Clicking Main Task Button
			oBrowser.findElement(objectmap.getLocator("clickingmaintaskbutton")).click();
			Thread.sleep(2000);
			//Clicking ADD NEW Button
			oBrowser.findElement(objectmap.getLocator("clickingaddnewbutton")).click();
			Thread.sleep(2000);
			//#Clicking New customer
			oBrowser.findElement(objectmap.getLocator("clickignnewcustamer")).click();
			Thread.sleep(2000);
			//Entering Customer name
			oBrowser.findElement(objectmap.getLocator("enteringcustamername")).sendKeys("Custamer1");
			Thread.sleep(2000);
			//entering Description
			oBrowser.findElement(objectmap.getLocator("enteringdescription")).sendKeys("Custamer 1 Description");
			Thread.sleep(2000);
			//#clicking CREATE USER
			oBrowser.findElement(objectmap.getLocator("clickingcreateuser")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deletecustamer()
	{
		try
		{
			//Clicking settings Button of Custamer 1
			oBrowser.findElement(objectmap.getLocator("clickingsettingsbuttonofcustamer1")).click();
			Thread.sleep(2000);
			//Clicking Action Button
			oBrowser.findElement(objectmap.getLocator("clickingactionbutton3")).click();
			Thread.sleep(2000);
			//Clicking Delete button
			oBrowser.findElement(objectmap.getLocator("clickingdeletebutton")).click();
			Thread.sleep(2000);
			//Clicking Delete Permanently Button
			oBrowser.findElement(objectmap.getLocator("clickingdeletepermanently3")).click();
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
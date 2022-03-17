package TestPackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static WebDriver wd=null;
	public static Logger log=Logger.getLogger("Automation");

	public static void main(String[] args) 
	{
//		launchbrowser();
//		navigate();
//		login();
//		logout();
//		close();
		
//		handlingframes();
		
		handlingpopupbrowsers();
	}
	
	static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+ "\\Library\\Driver\\chromedriver.exe");
			wd=new ChromeDriver();
		    wd.manage().window().maximize();
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try {
			
			wd.get("http://localhost:82/login.do");
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			//id and name approach
	//		wd.findElement(By.id("username")).sendKeys("admin");
	//		wd.findElement(By.name("pwd")).sendKeys("manager");
			
			// xpath approach
			wd.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("admin");
			wd.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			
			wd.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			wd.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
		   e.printStackTrace();		
		}
	}
	
	static void close()
	{
		try
		{
			wd.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// Handling Frames
	
	static void handlingframes()
	{
		log.info("handling frames starts from here");
		try
		{
			
			
			//launching browser
			
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+ "\\Library\\Driver\\chromedriver.exe");
			wd=new ChromeDriver();
		    wd.manage().window().maximize();
			
			
			//navigating to webpage
			
			wd.get("https://www.selenium.dev/selenium/docs/"
					     + "api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
			
			// handling Frames
			
			wd.switchTo().frame(0);
			wd.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(2000);
			
			wd.switchTo().defaultContent();
			wd.switchTo().frame("packageFrame");
			wd.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			
			wd.switchTo().defaultContent();
			WebElement oFrame=wd.findElement(By.cssSelector(".rightIframe"));
			wd.switchTo().frame(oFrame);
			String content=wd.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
			log.info(content);
			Thread.sleep(2000);
			
			wd.quit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		log.info("handling frames ends here");
	}
	

	static void handlingpopupbrowsers()
	{
		try
		{
		    //lauching browser
			
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Driver\\chromedriver.exe");
			wd.manage().window().maximize();
			
			
			//navigating to webpage
			
			wd.get("http://localhost:82/login.do");
			Thread.sleep(2000);
			
			//handling Pop-Up Browsers
			
			WebElement we=null;
			
			we=wd.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before clicking popup wimdows");
			
			we.click();
			System.out.println("after clicking popup windows");
			
			
		
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}

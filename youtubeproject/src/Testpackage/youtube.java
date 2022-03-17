package Testpackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube 
{
public static WebDriver obrowser=null;
public static pageobjectmodel ytb=null;
public static Logger log=Logger.getLogger("youtubeproject...");
	public static void main(String[] args) 
	
	{
		launchbrowser();
		 naviagte();
		 
		// login();
		 
		 search();
		 selectingsong();
		 
	//	 search2();
		 close();
		
	}

	static void launchbrowser()
	
	{
		log.info("launch browser stareted successfully");
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\GitHub\\"
					+ "CurrentWorkSpace\\TestAutomation\\youtubeproject\\"
					+ "diversandjdk\\chromedriver\\chromedriver.exe");
			
			obrowser=new ChromeDriver();
			ytb=new pageobjectmodel(obrowser);
			obrowser.manage().window().maximize();
			
		}
	catch(Exception e)
	   {
		e.printStackTrace();
	   }
		log.info("launch browser ends successfully");
	}
	
	static void login()
	{
		try
		{
			obrowser.findElement(By.xpath("//yt-formatted-string[@id=\'text\' and @ class=\'style-scope ytd-button-renderer style-suggestive size-small\']")).click();
			
			ytb.getEmail().sendKeys("gautham.n12@gmail.com");
			
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
	
	static void naviagte()
	{
		try
		{
			obrowser.get("https://www.youtube.com/");
			Thread.sleep(5000);
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
	
	
	static void search()
	{
		try
		{
			obrowser.findElement(By.xpath("//input[@id='search' "
					+ "and @autocapitalize='none' ]")).sendKeys("ooanta na mama");
			Thread.sleep(2000);
			
			obrowser.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
			Thread.sleep(2000);
			
			
			
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
	
	
	static void selectingsong()
	{
		try
		{
			
			obrowser.findElement(By.xpath("//yt-formatted-string[@class=\'"
					+ "style-scope ytd-video-renderer\']")).click();
			
			Thread.sleep(209800);
			
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
	
	static void search2()
	{
		try
		{
			//searching component /search bar
			obrowser.findElement(By.xpath("//input[@id='search' "
					+ "and @autocapitalize='none' ]")).sendKeys("love nawati");
			Thread.sleep(2000);
			
			//clicking search option 
			obrowser.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
			Thread.sleep(2000);
			
			//selecting song 
			obrowser.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
			
			Thread.sleep(209800);
			
			
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
	
	static void close()
	{
		try
		{
			
			obrowser.quit();
			
		}
		catch(Exception e)
		   {
			e.printStackTrace();
		   }
	}
}

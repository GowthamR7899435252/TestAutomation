package Testpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass 
{
public static WebDriver obrowser=null;
	public static void main(String[] args) 
	
	{
		launchbrowser();
		 naviagte();
		 search();
		 selectingsong();
		 close();
		
	}

	static void launchbrowser()
	
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\GitHub\\CurrentWorkSpace"
					+ "\\TestAutomation\\TestProject\\diversandjdk\\"
					+ "chromedriver\\chromedriver.exe");
			obrowser=new ChromeDriver();
			
			obrowser.manage().window().maximize();
			
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

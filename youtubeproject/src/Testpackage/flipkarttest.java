package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttest{
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	launchbrowser();	
	navigate();
	search();
	//closeapplication();
	}

	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\GitHub\\CurrentWorkSpace\\TestAutomation\\youtubeproject\\diversandjdk\\chromedriver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();		
	    }
    }
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
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
			oBrowser.findElement(By.xpath("//input[@type='text']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobiles");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeapplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
	 }
  }

  


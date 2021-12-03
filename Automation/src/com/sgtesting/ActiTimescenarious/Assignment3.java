package com.sgtesting.ActiTimescenarious;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment3 {
	
	SoftAssert soft=new SoftAssert();
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("Assignment 3");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for launchBrowser !!!");
			soft.assertAll();
			
			log.info("The Actitime launched succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
			//Assertion for Navigate
			String ActualTitle=oBrowser.getTitle();
			String ExpectedTitle="actiTIME - Login";
			soft.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("The Assert has passed for Navigate  !!!");
			
			log.info("The Actitime Navigated succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=3,dataProvider ="Loginasadmin")
	public void login(String Fn,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(Fn);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for login !!!");
			soft.assertAll();
			
			log.info("The Actitime login happened  succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for minimizeFlyOutWindow !!!");
			soft.assertAll();
			
			log.info("minimize window minimised  succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	@Test(priority=5,dataProvider ="Createcustamer")
	public void createCustamer(String Cusnm,String Des)
	{
		try
		{   //click task button
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			//click add new
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			//click new custamer
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(Cusnm);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(Des);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for createCustamer !!!");
			soft.assertAll();
			
			log.info("custamer created  succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	@Test(priority=6)
	public void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for deleteCustomer !!!");
			soft.assertAll();
			
			log.info("custamer deleted  succesfully...");
			}catch(Exception e)
		       {
			      e.printStackTrace();		
		       }
	}
	
	@Test(priority=7)
	public  void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for logout !!!");
			soft.assertAll();
			
			log.info("custamer deleted  succesfully...");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		log.info("loged out  succesfully...");
	}
	
	@Test(priority=8)
	public void closeApplication()
	{
		
		try
		{
			oBrowser.quit();
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for closeApplication !!!");
			soft.assertAll();
			
			log.info("Browser closed  succesfully...");
			log.info("###################################################");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	 @DataProvider(name="Loginasadmin")
		public Object[][]  getLoginasadmin()
		{
			return new Object[][] 
					{
				      {"admin","manager"}
				    };
		}
	 @DataProvider(name="Createcustamer")
		public Object[][]  getCusatmercreate()
		{
			return new Object[][] 
					{
				      {"Demo1","Custamer Descrption"}
				    };
		}
}

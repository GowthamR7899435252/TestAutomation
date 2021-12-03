package com.sgtesting.ActiTimescenarious;

import java.time.Duration;
import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment2 {
	
	SoftAssert soft=new SoftAssert();
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	
	 @Test(priority=1)
	public void launchBrowser()
	{
		
		try
		{
			log.info("Assignment 2");
			log.info("The Actitime launched succesfully...");
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for launchBrowser !!!");
			soft.assertAll();
			
			log.info("The actitme launch fuction ends here...");
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
			log.info("The Actitime Navigated succesfully...");
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			
			//Assertion for Navigate
			String ActualTitle=oBrowser.getTitle();
			String ExpectedTitle="actiTIME - Login";
			soft.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("The Assert has passed for Navigate  !!!");
			
			log.info("The actitme Navigate fuction ends here...");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	 @Test(priority=3,dataProvider = "Loginasadmincreateuser")
	 public void login(String user,String pwd,String Fn,String Mn,String Ln,String Mail,String username,String Pwd1,String Rpwd1,String Modun)
	{
		
		try
		{
			log.info("The Actitime login scenario starts succesfully...");
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			//minimising flyout window
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			//users
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			// create user
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(Fn);
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys(Mn);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(Ln);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(Mail);
			
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(username);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(Pwd1);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(Rpwd1);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			
			//entering list 
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			
			//modifying
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(Modun);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for login,minimise window,Create user !!!");
			soft.assertAll();
			
			log.info("The Actitime login,create user scenario completed succesfully...");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	 @Test(priority=4)
	 public void deleteUser()
	{
		
		try
		{
			log.info("The Actitime delete user scenario succesfully...");
			
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for deleteUser !!!");
			soft.assertAll();
			
			log.info("The Actitime delete user scenario ended succesfully...");
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	 @Test(priority=5)
	 public  void logout()
	{
		try
		{
			log.info("The Actitime log out scenario succesfully...");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for logout !!!");
			soft.assertAll();
			
			log.info("The Actitime log out scenario endes here...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	 @Test(priority=6)
	 public void closeApplication()
	{
		
		try
		{
			log.info("The Actitime close applicationb  scenario starts here...");
			oBrowser.quit();
			
			soft.assertNotNull(oBrowser);
			System.out.println("The Assert Steps has passed for closeApplication !!!");
			soft.assertAll();
			
			log.info("The Actitime close application  scenario ends here..."); 
			log.info("############################################################");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	 @DataProvider(name="Loginasadmincreateuser")
		public Object[][]  getLoginasadmin()
		{
			return new Object[][] 
					{
				      {"admin","manager","Gowtham","R","Nayak","gautham.n12@gmail.com","Gowtham1","123","123","3"}
				    };
		}
	
}

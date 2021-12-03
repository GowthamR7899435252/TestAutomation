package com.sgtesting.ActiTimescenarious;

import org.apache.log4j.Logger;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assignment1 {
	
	SoftAssert soft=new SoftAssert();
	
	public static Logger log=Logger.getLogger("Automation...");
	public static WebDriver oBrowser=null;
	
	 @Test(priority=1)
	public  void launchBrowser()
	{		
		try
		{
			log.info("Assignment 1");
			
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
			
			
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
			String ExpectedTitle="actiTIME - Login";
			String ActualTitle=oBrowser.getTitle();
			soft.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("The Assert has passed for Navigate  !!!");
			soft.assertAll();
			
			log.info("The Actitime Navigated succesfully...");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	
	 @Test(priority=3,dataProvider = "Loginasadmincreateuser")
	public void login(String user,String pwd,String Fn,String Mn,String Ln,String Mail,String username,String Pwd1,String Rpwd1)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			
			//Assertion for User name admin
			String getExpectedtext="username";
			String getactualtext=oBrowser.findElement(By.xpath("//*[@id=\'username\']")).getAttribute("name");
			soft.assertEquals(getactualtext, getExpectedtext);
			System.out.println("The user name admin has passed Assertion for login ");
			soft.assertAll();
			
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			
			//Assertion for password Manger
			String getExpectedpassword="password";
			String getactualpassword=oBrowser.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).getAttribute("type");
			soft.assertEquals(getExpectedpassword,getactualpassword);
			System.out.println("The password manager has passed Assertion for login ");
			soft.assertAll();
			
			
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
            //Minimizing fly out window
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
			//Assertion for fly out window
			String getExpectedclass="gettingStartedShortcutsLabel";
			String getactualclass=oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).getAttribute("class");
			soft.assertEquals(getExpectedclass,getactualclass);
			System.out.println("The Assertion has passed for Fly out window ");
			soft.assertAll();
			
			//Clicking main users
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			//Assertion for clicking main user icon
			String clickmainusericon="img";
			String actualclickmainusericon=oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).getAttribute("class");
			soft.assertEquals(clickmainusericon,actualclickmainusericon);
			System.out.println("The Assertion has passed for clicking main user icon");
			soft.assertAll();
			
			
			// create user
			
			//clicking AddUser icon
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			
			//Assertion for clicking Add user icon
			String expectedclass1="buttonText";
		    String Actualclass1=oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).getAttribute("class");
			soft.assertEquals(expectedclass1,Actualclass1);
			System.out.println("The Assert Steps has passed for add User  !!!");
		    soft.assertAll();
			
			
			//Entering name fields
			
			//first name
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(Fn);
			
			//Assert for first name
			String expectedid="userDataLightBox_firstNameField";
		    String Actualid=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid,Actualid);
			System.out.println("The Assert Steps has passed for firstname !!!");
		    soft.assertAll();
			
		    //Middle name
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys(Mn);
			
			//Assert for middle name
			String expectedid1="userDataLightBox_middleNameField";
		    String Actualid1=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_middleNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid1,Actualid1);
			System.out.println("The Assert Steps has passed for middlename !!!");
		    soft.assertAll();
			
		    //Last name
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(Ln);
			
			//Assert for Last name
			String expectedid2="userDataLightBox_lastNameField";
		    String Actualid2=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).getAttribute("id");
			soft.assertEquals(expectedid2,Actualid2);
			System.out.println("The Assert Steps has passed for lastname !!!");
		    soft.assertAll();
			
		    //Email
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(Mail);
			
			//Assert for email id
			String expectedid3="userDataLightBox_emailField";
		    String Actualid3=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).getAttribute("id");
			soft.assertEquals(expectedid3,Actualid3);
			System.out.println("The Assert Steps has passed for email !!!");
		    soft.assertAll();
			
		    //user name
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(username);
			
			//Assert for user name
			String expectedid4="userDataLightBox_usernameField";
		    String Actualid4=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).getAttribute("id");
			soft.assertEquals(expectedid4,Actualid4);
			System.out.println("The Assert Steps has passed for username !!!");
		    soft.assertAll();
			
		    //password
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(Pwd1);
			
			//Assert for password
			String expectedid5="userDataLightBox_passwordField";
		    String Actualid5=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).getAttribute("id");
			soft.assertEquals(expectedid5,Actualid5);
			System.out.println("The Assert Steps has passed for password !!!");
		    soft.assertAll();
		    
		    //Re-type Password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(Rpwd1);
			
			//Assert for Retype Password
			String expectedid6="userDataLightBox_passwordCopyField";
		    String Actualid6=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).getAttribute("id");
			soft.assertEquals(expectedid6,Actualid6);
			System.out.println("The Assert Steps has passed for retypepassword !!!");
		    soft.assertAll();
			
			//clicking create user
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			
			//Assertion for clicking create user icon
			String clickcreateusericon="buttonTitle";
			String actualcreateusericon=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).getAttribute("class");
			soft.assertEquals(clickcreateusericon,actualcreateusericon);
			System.out.println("The Assertion has passed for clicking create user icon");
			soft.assertAll();
			
			
			log.info("Actitime login,create user scenario completed  succesfully...");
			
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
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			
			//clicking delete button
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			//Assertions for clicking delete button
			String clickdeletebutton="userDataLightBox_deleteBtn";
			String actualdeletebutton=oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).getAttribute("id");
			soft.assertEquals(clickdeletebutton,actualdeletebutton);
			System.out.println("The Assertion has passed for clicking Delete button");
			soft.assertAll();
			
			log.info("Actitime Delete scenario completed  succesfully...");
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("Actitime Logout happened  succesfully...");
		}catch(Exception e)
		{
		   e.printStackTrace();		
		}
		
	}
	
	 @Test(priority=6)
	public  void closeApplication()
	{
		try
		{
			oBrowser.quit();
			log.info("Browser closed succesfully...");
			log.info("###############################################");
			
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
				      {"admin","manager","Gowtham","R","Nayak","gautham.n12@gmail.com","Gowtham1","123","123"}
				    };
		}

}

package TestScripts;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser1();
		logout();
		
		logingasuser1createuser2logout();
		logingassuer2createuser3logout();
		loginginasuser3logout();
		
		loginasUser2modifypasswordforUser3logout(); 
		loginasUser3logout();
		
		loginasUser1modifypasswordforUser2logout();
		loginasUser2logout();
		
		loginasadminmodifypasswordforUser1logout();
		loginasUser1logout();
		
		loginasUser2DeleteUser3logout();
		loginasuser1deleteUSer2logout();
		
		loginasAdmindeleteUser1logout();
		
		closeApplication();
		
	   }
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void Createuser1()
	{
		try
		{
		 // clicking users icon 
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		//clicking add user icon
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
		oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("M");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("L");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1@gmail.com");
		
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User11");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
		
		// clicking create user icon
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logingasuser1createuser2logout()
	{
		try
		{
			// logging as  user1
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
						
			//exiting from vedio page by cliking start exploring acii time
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			//creating user 2
			
			// clicking users main icon 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//clicking adduser icon
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User2");
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("M");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("L2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo2@gmail.com");
			
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User22");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
			// clicking create user icon
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void logingassuer2createuser3logout()
	{
		try
		{
			//logging in as user2
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
			//exiting from vedio page by cliking start exploring acii time
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			//creating user3
			
			// clicking users main icon 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			//clicking adduser icon
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User3");
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("M");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("L3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gmail.com");
			
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User33");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
			// clicking create user icon
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginginasuser3logout()
	{
		try
		{
			//for user3
			oBrowser.findElement(By.id("username")).sendKeys("User33");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
			//exiting from vedio page by cliking start exploring acii time
			oBrowser.findElement(By.xpath("/html/body/div[3]/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser2modifypasswordforUser3logout()
	{
		try
		{
		  
			//logging in as user2
			
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
			// modifying password of  USER 3
			
			// entring or clicking  to users button 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			//selecting user3
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			//selecting new password
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("u3");
			Thread.sleep(2000);
			//Retyping Password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("u3");
			Thread.sleep(2000);
			//save changes button 
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser3logout()
	{
		try
		{
			//logging in as  user3
			oBrowser.findElement(By.id("username")).sendKeys("User33");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("u3");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
			
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser1modifypasswordforUser2logout()
	{
		try
		{
			// logging as  user1
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			// for USER 2
			
			// entring or clicking  to users button 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			
			//selecting user2
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			//selecting new password
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("u2");
			Thread.sleep(2000);
			//Retyping Password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("u2");
			Thread.sleep(2000);
			//save changes button 
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser2logout()
	{
		try
		{
			//loging in as user2
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("u2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasadminmodifypasswordforUser1logout()
	{
		try
		{
			//logging in as admin
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			// modifying password of USER1
			
			// entring or clicking  to users button 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			//selecting user1
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(2000);
			//selecting new password
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("u1");
			Thread.sleep(2000);
			//Retyping Password
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("u1");
			Thread.sleep(2000);
			//save changes button 
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser1logout()
	{
		try
		{

			// logging in as user1
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("u1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
		
			//Clicking logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasUser2DeleteUser3logout()
	{
		try
		{
			//loging in as user2
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("u2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			//deleting user3
			
			//entering or clicking to users list 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			//selecting user3
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			//Clicking Delete button
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(3000);
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasuser1deleteUSer2logout()
	{
		try
		{
			// logging in as user1
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("u1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
			//deleting user2
			
			//entering or clicking to users list 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			//selecting user2 
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			//Clicking Delete button
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String str1=oAlert1.getText();
			System.out.println(str1);
			oAlert1.accept();
			Thread.sleep(2000);
			
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		   {
			e.printStackTrace();		
		   }
	}
	
	static void loginasAdmindeleteUser1logout()
	{
		try
		{
		    // login as Admin
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			
             //loggin in as USER1
			
			//entering or clicking to users list 
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			//selecting user1 
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			//Clicking Delete button
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
			
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
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
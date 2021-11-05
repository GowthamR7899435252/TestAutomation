package PageObjectModel;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		
		loginasuser1createuser2logout();
		loginasUser2createUseUser3logout();
		loginasUser3logout();
		
		loginasUser2modifypasswordforUser3logout();
		loginasUser3logout1();
		
		loginasUser1modifypasswordforUser2logout();
		loginasUser2logout();
		
		loginasadminmodifypasswordforUser1logout();
		loginasUser1logout();
		
		loginasUser2DeleteUser3logout();
		loginasUser1deleteUSer2logout();
		loginasAdmindeleteUser1logout(); 
		
		closeApplication();
}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
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
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createUser1()
	{
		try
		{   
			//user1
			
			//clicking main users icon
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//clicking ADD users icon
			oPage.getcreateUserDiv().click();
			Thread.sleep(2000);
			
			//entering names
			oPage.getuserDataLightBox_firstNameField().sendKeys("user1");
			oPage.getuserDataLightBox_middleNameField().sendKeys("M");
			oPage.getuserDataLightBox_lastNameField().sendKeys("L");
			oPage.getuserDataLightBox_emailField().sendKeys("Demo1@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("user11");
			oPage.getuserDataLightBox_passwordField().sendKeys("123");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("123");
			// clicking Create user icon
			oPage.getuserDataLightBox_commitBtn().click();
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
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginasuser1createuser2logout()
	{
		try
		{
			//login/logout for user1
			oPage.getUserName().sendKeys("user11");
			oPage.getPassword().sendKeys("123");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			// vedio exit
			oPage.get13welcomeScreenBoxId().click();
			Thread.sleep(2000);
			
			//clicking main users icon
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//clicking ADD users icon
			oPage.getcreateUserDiv().click();
			Thread.sleep(2000);
			
			//creating user 2
			//entering names
			oPage.getuserDataLightBox_firstNameField().sendKeys("user2");
			oPage.getuserDataLightBox_middleNameField().sendKeys("M");
			oPage.getuserDataLightBox_lastNameField().sendKeys("L");
			oPage.getuserDataLightBox_emailField().sendKeys("Demo2@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("user22");
			oPage.getuserDataLightBox_passwordField().sendKeys("1234");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("1234");
			// clicking Create user icon
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
	        
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		  {
			e.printStackTrace();		
		  }
	}
	
	static void loginasUser2createUseUser3logout()
	{
		try
		{
			
			//login/logout for user2
			oPage.getUserName().sendKeys("user22");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			// vedio exit
			oPage.get14welcomeScreenBoxId().click();
			Thread.sleep(2000);
			
			//clicking main users icon
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//clicking ADD users icon
			oPage.getcreateUserDiv().click();
			Thread.sleep(2000);
			
			//creating user3
			
			//entering names
			oPage.getuserDataLightBox_firstNameField().sendKeys("user3");
			oPage.getuserDataLightBox_middleNameField().sendKeys("M");
			oPage.getuserDataLightBox_lastNameField().sendKeys("L");
			oPage.getuserDataLightBox_emailField().sendKeys("Demo3@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("user33");
			oPage.getuserDataLightBox_passwordField().sendKeys("12345");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("12345");
			// clicking Create user icon
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			
			//logout
			oPage.getLogout().click();
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
			
			//login/logout for user3
			oPage.getUserName().sendKeys("user33");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			// vedio exit
				oPage.get15welcomeScreenBoxId().click();
				Thread.sleep(2000);
			
			//logout for user3
			oPage.getLogout().click();
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
			//login/logout for user2
			oPage.getUserName().sendKeys("user22");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			// selecting user 3
			oPage.get20userListTableContainer().click();
			Thread.sleep(2000);
															
			// clicking to password field for modification
			oPage.get1userDataLightBox_passwordField().sendKeys("u3");
			Thread.sleep(2000);
															
			// retyping password
			oPage.get1userDataLightBox_passwordCopyField().sendKeys("u3");
			Thread.sleep(2000);
															
			// clicking save changes icon
			oPage.get1userDataLightBox_commitBtn().click();
			Thread.sleep(2000);
						
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		  {
			e.printStackTrace();		
		  }
	}
	
	static void loginasUser3logout1()
	{
		try
		{
			
			//login/logout for user3
			oPage.getUserName().sendKeys("user33");
			oPage.getPassword().sendKeys("u3");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//logout for user3
			oPage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		  {
			e.printStackTrace();		
		  }
	}
	
	static void loginasUser1modifypasswordforUser2logout()
	{
		try
		{
			//login/logout for user1
			oPage.getUserName().sendKeys("user11");
			oPage.getPassword().sendKeys("123");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			// selecting user2
			
			// selecting user 2
			oPage.get19userListTableContainer().click();
			Thread.sleep(2000);
												
			// clicking to password field for modification
			oPage.get1userDataLightBox_passwordField().sendKeys("u2");
			Thread.sleep(2000);
												
			// retyping password
			oPage.get1userDataLightBox_passwordCopyField().sendKeys("u2");
			Thread.sleep(2000);
												
			// clicking save changes icon
		    oPage.get1userDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		  {
			e.printStackTrace();		
		  }
	}
	static void loginasUser2logout()
	{
		try
		{
			//login/logout for user2
			oPage.getUserName().sendKeys("user22");
			oPage.getPassword().sendKeys("u2");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//logout for user2
			oPage.getLogout().click();
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
		   //login as admin
		   oPage.getUserName().sendKeys("admin");
		   oPage.getPassword().sendKeys("manager");
		   oPage.getLogin().click();
			Thread.sleep(4000);
		   
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);

			
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			// selecting user 1
			oPage.get18userListTableContainer().click();
			Thread.sleep(2000);
						
			// clicking to password field for modification
			oPage.get1userDataLightBox_passwordField().sendKeys("u1");
			Thread.sleep(2000);
						
			// retyping password
			oPage.get1userDataLightBox_passwordCopyField().sendKeys("u1");
			Thread.sleep(2000);
						
			// clicking save changes icon
		    oPage.get1userDataLightBox_commitBtn().click();
			Thread.sleep(2000);
			
			//logout for user1
			oPage.getLogout().click();
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
		   
		 //login/logout for user1
			oPage.getUserName().sendKeys("user11");
			oPage.getPassword().sendKeys("u1");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//logout for user1
			oPage.getLogout().click();
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
		 //login as user2
			oPage.getUserName().sendKeys("user22");
			oPage.getPassword().sendKeys("u2");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			// deleting user 3
			
			oPage.get26userListTableContainer().click();
			Thread.sleep(2000);
			
			//clicking delete Button
			oPage.getuserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(2000);
			
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);	
		   
	   }catch(Exception e)
		  {
			e.printStackTrace();		
		  }
   }
   
   static void loginasUser1deleteUSer2logout()
   {
	   try
	   {
		 //login/logout for user1
			oPage.getUserName().sendKeys("user11");
			oPage.getPassword().sendKeys("u1");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			//deleting user2
			
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//selecting user2
			oPage.get28userListTableContainer().click();
			Thread.sleep(2000);	
			
			//clicking delete Button
			oPage.getuserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String str1=oAlert1.getText();
			System.out.println(str1);
			oAlert1.accept();
			Thread.sleep(3000);
		   
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);	
		   
	   }catch(Exception e)
		  {
			e.printStackTrace();		
		  }
   }
   
   static void loginasAdmindeleteUser1logout() 
   {
	   try
	   {
		   //logining in as admin
		   
		   oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000); 
			//minimisung flying window
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
          
			//for selecting MAIN USERS ICON
			oPage.gettopnav().click();
			Thread.sleep(2000);
			
			//deleting user1
			
			// selecting user 1
			    oPage.get27userListTableContainer().click();
				Thread.sleep(2000);
				
				//clicking delete Button
				oPage.getuserDataLightBox_deleteBtn().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String str=oAlert.getText();
				System.out.println(str);
				oAlert.accept();
				Thread.sleep(3000);
			
				//logout
				oPage.getLogout().click();
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
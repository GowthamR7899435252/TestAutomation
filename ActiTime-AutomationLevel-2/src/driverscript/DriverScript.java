package driverscript;

import org.openqa.selenium.WebDriver;
import tests.Customers;
import tests.HomePage;
import tests.Initialization;
import tests.LoginLogout;
import tests.Projects;
import tests.Tasks;
import tests.Users;

public class DriverScript {
	
	public static void main(String[] args) 
	{	
		
//		 Assignment1();
//	     Assignment2();
//		 Assignment3();
//		 Assignment4();
//		 Assignment5();
//		 Assignment6();
//		 Assignment7();
//		 Assignment8();
		
	}
	
	
	
		static void Assignment1()
		{
			WebDriver oBrowser=null;
			
	    oBrowser=Initialization.launchBrowser();
	    Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment2()
		{
			WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment3()
		{
			WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment4()
		{
		WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Customers.modifyCustomer(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment5()
		{
		WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Projects.createProject(oBrowser);
	    Projects.deleteProject(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment6()
		{
		WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Projects.createProject(oBrowser);
	    Projects.modifyProject(oBrowser);
	    Projects.deleteProject(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment7()
		{
		WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Projects.createProject(oBrowser);
	    Tasks.createTasks(oBrowser);
	    Tasks.deleteTasks(oBrowser);
	    Projects.deleteProject(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}
		
		static void Assignment8()
		{
		WebDriver oBrowser=null;
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
	    HomePage.minimizeFlyOutWindow(oBrowser);
	    
	    Customers.createCustomer(oBrowser);
	    Projects.createProject(oBrowser);
	    
	    Tasks.importask(oBrowser);
	    Tasks.completingimport(oBrowser);
	    Tasks.deleteTasksforimortedcsvfile(oBrowser);
	    
	    Projects.deleteProject(oBrowser);
	    Customers.deleteCustomer(oBrowser);
	    
	    LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		}



		
}

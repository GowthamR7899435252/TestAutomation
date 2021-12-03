package driverscript;

import tests.Customers;
import tests.HomePage;
import tests.Initialization;
import tests.LoginLogout;
import tests.Projects;
import tests.Tasks;
import tests.Users;

public class DriverScript {
	public static void main(String[] args) {
		
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
		
		//Assignment 1
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment2()
		{
		//Assignment 2
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment3()
		{
		//Assignment 3
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment4()
		{
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Customers.modifyCustomer();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment5()
		{
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Projects.createProject();
	    Projects.deleteProject();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment6()
		{
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Projects.createProject();
	    Projects.modifyProject();
	    Projects.deleteProject();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment7()
		{
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Projects.createProject();
	    Tasks.createTasks();
	    Tasks.deleteTasks();
	    Projects.deleteProject();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}
		
		static void Assignment8()
		{
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
	    HomePage.minimizeFlyOutWindow();
	    
	    Customers.createCustomer();
	    Projects.createProject();
	    
	    Tasks.importask();
	    Tasks.completingimport();
	    Tasks.deleteTasksforimortedcsvfile();
	    
	    Projects.deleteProject();
	    Customers.deleteCustomer();
	    
	    LoginLogout.logout();
		Initialization.closeApplication();
		}



		
}

package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//for selecting MAIN USERS ICON
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement otopnav;
	public WebElement gettopnav()
		{
			return otopnav;
		}
	
	//for selecting ADD USER
	
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement ocreateUserDiv;
	public WebElement getcreateUserDiv()
		{
			return ocreateUserDiv;
		}
	
	     // entring user details method
	
	    // first name field
		private WebElement userDataLightBox_firstNameField;
		public WebElement getuserDataLightBox_firstNameField()
		  {
			return userDataLightBox_firstNameField;
		  }
		
		// for middle name 
		private WebElement userDataLightBox_middleNameField;
		public WebElement getuserDataLightBox_middleNameField()
		   {
			  return userDataLightBox_middleNameField;
		   }
		
		// for Last name
		    private WebElement userDataLightBox_lastNameField;
			WebElement getuserDataLightBox_lastNameField()
		       {
			        return userDataLightBox_lastNameField;
		       }
			// for email
		    private WebElement userDataLightBox_emailField;
			WebElement getuserDataLightBox_emailField()
		       {
			        return userDataLightBox_emailField;
		       }
			// for username
		    private WebElement userDataLightBox_usernameField;
			WebElement getuserDataLightBox_usernameField()
		       {
			        return userDataLightBox_usernameField;
		       }
			// for pasword
		    private WebElement userDataLightBox_passwordField;
			WebElement getuserDataLightBox_passwordField()
		       {
			        return userDataLightBox_passwordField;
		       }
			//for retype password
			private WebElement userDataLightBox_passwordCopyField;
			WebElement getuserDataLightBox_passwordCopyField()
		       {
			        return userDataLightBox_passwordCopyField;
		       }
	         //clicking create user icon
			@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
			private WebElement ouserDataLightBox_commitBtn;
			public WebElement getuserDataLightBox_commitBtn()
				{
					return ouserDataLightBox_commitBtn;
				}
			
	//FOR DELETING USER
			
			//selecting USER 1
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement ouserListTableContainer;
			public WebElement getuserListTableContainer()
				{
					return ouserListTableContainer;
				}
			//clicking delete button
			private WebElement userDataLightBox_deleteBtn;
			WebElement getuserDataLightBox_deleteBtn()
		       {
			        return userDataLightBox_deleteBtn;
		       }
			
	//For Modifying Password USER1
			
			//selecting USER 1
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement o1userListTableContainer;
			public WebElement get1userListTableContainer()
				{
					return o1userListTableContainer;
				}
			// Modyfying Password
			@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
			private WebElement ouserDataLightBox_passwordField;
			public WebElement get1userDataLightBox_passwordField()
				{
					return ouserDataLightBox_passwordField;
				}
			//retyping password
			@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
			private WebElement ouserDataLightBox_passwordCopyField;
			public WebElement get1userDataLightBox_passwordCopyField()
				{
					return ouserDataLightBox_passwordCopyField;
				}
			
			//clicking saving Changes icon
			
			@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
			private WebElement o1userDataLightBox_commitBtn;
			public WebElement get1userDataLightBox_commitBtn()
				{
					return ouserDataLightBox_commitBtn;
				}
			
	// FOR CREATING CUSTAMER
			
			//Clicking Main Task button after login
			@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
			private WebElement o1topnav;
			public WebElement get1topnav()
				{
					return o1topnav;
				}	
			//Clicking Add New button
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
			private WebElement ocpTreeBlock;
			public WebElement getcpTreeBlock()
				{
					return ocpTreeBlock;
				}	
			//Clicking New Custamer Icon
			@FindBy(xpath="/html/body/div[14]/div[1]")
			private WebElement oitemcreateNewCustomer;
			public WebElement getitemcreateNewCustomer()
				{
					return oitemcreateNewCustomer;
				}
			//Entering Custamer name Details
			      //Custamer Name
			private WebElement customerLightBox_nameField;
			WebElement getcustomerLightBox_nameField()
		       {
			        return customerLightBox_nameField;
		       }
			      //description
			private WebElement customerLightBox_descriptionField;
			WebElement getcustomerLightBox_descriptionField()
		       {
			        return customerLightBox_descriptionField;
		       }
			// clicking Create Custamer icon 
			@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
			private WebElement ocustomerLightBox_commitBtn;
			public WebElement getcustomerLightBox_commitBtn()
				{
					return ocustomerLightBox_commitBtn ;
				}
			
	// FOR DELETING CUSTAMER
			
			// clicking edit or settings button of custamer
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
			private WebElement o1cpTreeBlock;
			public WebElement get1cpTreeBlock()
				{
					return o1cpTreeBlock;
				}
			//Clicking Actions Button 
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
			private WebElement otaskListBlock;
			public WebElement gettaskListBlock()
				{
					return otaskListBlock;
				}
			
			//Clicking Delete Button
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
			private WebElement o1taskListBlock;
			public WebElement get1taskListBlock()
				{
					return o1taskListBlock;
				}
			// Clicking Delete permanently button
			private WebElement customerPanel_deleteConfirm_submitTitle;
			WebElement getcustomerPanel_deleteConfirm_submitTitle()
		       {
			        return customerPanel_deleteConfirm_submitTitle;
		       }
	//MODIFYING CUSTAMER
			
			//clicking custammer edit button
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
			private WebElement o2cpTreeBlock;
			public WebElement get2cpTreeBlock()
				{
					return o2cpTreeBlock;
				}
			//Clicking name field
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
			private WebElement o2taskListBlock;
			public WebElement get2taskListBlock()
				{
					return o2taskListBlock;
				}
			//Modyfying Custamer Name label
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
			private WebElement o3nameInput;
			public WebElement get3nameInput()
				{
					return o3nameInput;
				}
			//Again Clicking Custamer to save modified data
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
			private WebElement o3cpTreeBlock;
			public WebElement get3cpTreeBlock()
				{
					return o3cpTreeBlock;
				}
	// CREATING PROJECT
			
			//Clicking Add New button
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
			private WebElement o4cpTreeBlock;
			public WebElement get4cpTreeBlock()
				{
					return o4cpTreeBlock;
				}	
			// clicking create project icon
			@FindBy(xpath="/html/body/div[14]/div[2]")
			private WebElement oitemcreateNewProjectellipsis;
			public WebElement getitemcreateNewProjectellipsis()
				{
					return oitemcreateNewProjectellipsis;
				}	
			// entring names for Project
			private WebElement projectPopup_projectNameField;
			WebElement getprojectPopup_projectNameField()
		       {
			        return projectPopup_projectNameField;
		       }
			//project description
			private WebElement projectDescriptionField;
			WebElement getprojectDescriptionField()
		       {
			        return projectDescriptionField;
		       }
			// clicking create project icon
			@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
			private WebElement oprojectPopup_commitBtn;
			public WebElement getprojectPopup_commitBtn()
				{
					return oprojectPopup_commitBtn;
				}	
//DELETING PROJECT
			
			// clicking edit button of projrct1
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
			private WebElement o5cpTreeBlock;
			public WebElement get5cpTreeBlock()
				{
					return  o5cpTreeBlock;
				}	
			//clicking Action Button
			
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
			private WebElement o3taskListBlock;
			public WebElement get3taskListBlock()
				{
					return o3taskListBlock;
				}
			// clicking delete button
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
			private WebElement o4taskListBlock;
			public WebElement get4taskListBlock()
				{
					return o4taskListBlock;
				}
			//clicking delete pemanently button
			private WebElement projectPanel_deleteConfirm_submitTitle;
			WebElement getprojectPanel_deleteConfirm_submitTitle()
		       {
			        return projectPanel_deleteConfirm_submitTitle;
		       }
	//MODYFYING PROJECT
			//Clicking edit button of project
			@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
			private WebElement o6cpTreeBlock;
			public WebElement get6cpTreeBlock()
				{
					return o6cpTreeBlock;
				}
			//Clicking project name field
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
			private WebElement o5taskListBlock;
			public WebElement get5taskListBlock()
				{
					return o5taskListBlock;
				}
			//Modyfying project Name label
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
			private WebElement o8taskListBlock;
			public WebElement get8taskListBlock()
				{
					return o8taskListBlock;
				}
			// clicking close button ,it saves name automatically
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
			private WebElement o7taskListBlock;
			public WebElement get7taskListBlock()
				{
					return o7taskListBlock;
				}
	// CREATING NEW TASK
			
			//Clicking ADD NEW TASK button
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
			private WebElement o9taskListBlock;
			public WebElement get9taskListBlock()
				{
					return o9taskListBlock;
				}
			//clicking create new task button
			@FindBy(xpath="/html/body/div[13]/div[1]")
			private WebElement o4itemcreateNewTaskellipsis;
			public WebElement get4itemcreateNewTaskellipsis()
				{
				  return o4itemcreateNewTaskellipsis;
				}
			
			// entering task name
			@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
			private WebElement o4createTasksPopup_createTasksTableContainer;
			public WebElement get4createTasksPopup_createTasksTableContainer()
				{
				  return o4createTasksPopup_createTasksTableContainer;
				}
			//clicking create task button
			@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
			private WebElement o4createTasksPopup_commitBtn;
			public WebElement get4createTasksPopup_commitBtn()
				{
				  return o4createTasksPopup_commitBtn;
				}
			
	//DELETING TASK
			
			//clicking on task
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
			private WebElement o11taskListBlock;
			public WebElement get11taskListBlock()
				{
				  return o11taskListBlock;
				}
			//clicking action button
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
			private WebElement o12taskListBlock;
			public WebElement get12taskListBlock()
				{
				  return o12taskListBlock;
				}
			
			// clicking delete button
			@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
			private WebElement o13taskListBlock;
			public WebElement get13taskListBlock()
				{
				  return o13taskListBlock;
				}
			// clicking delete permanently button
			@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
			private WebElement o13taskPanel_deleteConfirm_submitTitle;
			public WebElement get13taskPanel_deleteConfirm_submitTitle()
				{
				  return o13taskPanel_deleteConfirm_submitTitle;
				}
			
//vedio exit for user1
			
			@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
			private WebElement o13welcomeScreenBoxId;
			public WebElement get13welcomeScreenBoxId()
				{
				  return o13welcomeScreenBoxId;
				}		
//vedio exit for user2
			
			@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
			private WebElement o14welcomeScreenBoxId;
			public WebElement get14welcomeScreenBoxId()
				{
				  return o14welcomeScreenBoxId;
				}	
//vedio exit for user3
			
			@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
			private WebElement o15welcomeScreenBoxId;
			public WebElement get15welcomeScreenBoxId()
				{
				  return o15welcomeScreenBoxId;
				}				
//TO SELECT USER1 FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o15userListTableContainer;
			public WebElement get15userListTableContainer()
				{
				  return o15userListTableContainer;
				}	
//TO SELECT USER2 FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o17userListTableContainer;
			public WebElement get17userListTableContainer()
				{
				  return o17userListTableContainer;
				}				
//TO SELECT USER3 FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o16userListTableContainer;
			public WebElement get16userListTableContainer()
				{
				  return o16userListTableContainer;
				}				
//MIMIMISING FLYOUT WINDOW ANOTHER METHOD xpath
			@FindBy(xpath="//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")
			private WebElement o16gettingStartedShortcutsPanelId;
			public WebElement get16gettingStartedShortcutsPanelId()
				{
				  return o16gettingStartedShortcutsPanelId;
				}
//MIMIMISING FLYOUT WINDOW ANOTHER METHOD id
			private WebElement gettingStartedShortcutsPanelId1;
			WebElement getgettingStartedShortcutsPanelId()
		       {
			        return gettingStartedShortcutsPanelId;
		       }
//MIMIMISING FLYOUT WINDOW ANOTHER METHOD id
			@FindBy(xpath="//*[@id=\'gettingStartedShortcutsMenuCloseId\']")
			private WebElement o16gettingStartedShortcutsMenuCloseId;
			public WebElement get16gettingStartedShortcutsMenuCloseId()
				{
				  return o16gettingStartedShortcutsMenuCloseId;
				}	
//FOR SELECTING USER1 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
			private WebElement o18userListTableContainer;
			public WebElement get18userListTableContainer()
				{
				  return o18userListTableContainer;
				}	
//FOR SELECTING USER2 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o19userListTableContainer;
			public WebElement get19userListTableContainer()
				{
				  return o19userListTableContainer;
				}
//FOR SELECTING USER2 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o20userListTableContainer;
			public WebElement get20userListTableContainer()
				{
				  return o20userListTableContainer;
				}	
//FOR SELECTING USER2 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o21userListTableContainer;
			public WebElement get21userListTableContainer()
				{
				  return o21userListTableContainer;
				}	
//FOR SELECTING USER3 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
			private WebElement o22userListTableContainer;
			public WebElement get22userListTableContainer()
				{
				  return o22userListTableContainer;
				}
//FOR SELECTING USER3 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
			private WebElement o23userListTableContainer;
			public WebElement get23userListTableContainer()
				{
				  return o23userListTableContainer;
				}	
//FOR SELECTING USER2 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
			private WebElement o24userListTableContainer;
			public WebElement get24userListTableContainer()
				{
				  return o24userListTableContainer;
				}
//FOR SELECTING USER3 ANOTHER METHOD FOR ADVANCED SCENARIO
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o25userListTableContainer;
			public WebElement get25userListTableContainer()
				{
				  return o25userListTableContainer;
				}	
//FOR SELECTING USER3 ANOTHER METHOD FOR ADVANCED SCENARIO 2
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o26userListTableContainer;
			public WebElement get26userListTableContainer()
				{
				  return o26userListTableContainer;
				}
//FOR SELECTING USER 1 ANOTHER METHOD FOR ADVANCED SCENARIO 2
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
			private WebElement o27userListTableContainer;
			public WebElement get27userListTableContainer()
				{
				  return o27userListTableContainer;
				}	
//FOR SELECTING USER 2 ANOTHER METHOD FOR ADVANCED SCENARIO 2
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
			private WebElement o28userListTableContainer;
			public WebElement get28userListTableContainer()
				{
				  return o28userListTableContainer;
				}							
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}

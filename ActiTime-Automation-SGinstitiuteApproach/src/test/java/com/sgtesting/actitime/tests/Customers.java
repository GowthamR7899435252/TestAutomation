package com.sgtesting.actitime.tests;

import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.driverscript.DriverScript;
import com.sgtesting.actitime.utility.ApplicationDependent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers  extends DriverScript {
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static void createCustomer(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String expected,actual;
		String scriptStatus="Fail";
		try
		{
			log.info("The execution of method createUser started here ...");
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String Custamername=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0],2);
			String Description=datatable.getCellData(excelTestScriptFile, "testdata",arrTestData[1],2);
			
			
			//click task button
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			//click add new
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			//click new customer
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(Custamername);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(Description);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			
			
			actual=oBrowser.getTitle();
			if (actual.equalsIgnoreCase(expected))
			{
				scriptStatus="Pass";
			}
			log.info("The execution of method create custamer ended here ...");
		}catch(Exception e)
		{
			log.error("there is an exception arised during the execution of the method create custamer,The Exception :"+e);
		}
	    return scriptStatus;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static void modifyCustomer(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String scriptStatus="Fail";
		try
		{
			
			 //settings button open xpath
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			// selecting customer icon
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(2000);
			// selecting name edit field
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys("23");
			Thread.sleep(2000);
			// Entering list ,saving modified customer name
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Test case ID:
	 * parameters:
	 * return type:
	 * Purpose:
	 * Description:
	 */
	public static void deleteCustomer(WebDriver oBrowser)
	{
		Pattern pattern=null;
		String[] arrTestData=null;
		String scriptStatus="Fail";
		try
		{
			
			log.info("The execution of method createUser started here ...");
			pattern=Pattern.compile(",");
			arrTestData=pattern.split(testdatacolumn);
			String DeletingCustamer=datatable.getCellData(excelTestScriptFile, "testdata", arrTestData[0],2);
			
			
			
			
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

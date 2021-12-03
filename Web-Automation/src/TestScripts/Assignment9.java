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

public class Assignment9 {
	
	public static void main(String[] args) {
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			  driver.get("https://www.amazon.in/");
			  // driver.findElement(By.xpath("//a[@class='nav-a']")).click();
			   driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[5]")).click();
			   
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}

package Xpath;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPathDemo();
		//case1
	//	relativeXPathUsingTagNameAlone();
		//case2
	//	relativeXPathUsingTagNameWithIndex();
		//case3
	//	relativeXPathUsingTagNameWithAttributeNameAndValue();
		//case4
	//	relativeXPathUsingAttributeNameAndValueCombination();
		//case5
	//	relativeXPathUsingAttributeValueAlone();
		//case6
	//	relativeXPathUsingMultipleAttributeNameAndValue();
		//case7
	//	relativeXPathUsingMultipleAttributeNameAndValueUsingAndOperator();
		//case8
	//	relativeXPathUsingMultipleAttributeNameAndValueUsingOROperator();
		//case9
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
		
		
		//case10(a)
	//	relativeXPathUsingTagNameWithAttributeName();
		//case10(b)
	//	relativeXPathUsingTagNameWithAttributeName_displayLinkNames();
		//Case10(c)
	//  relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink();
		//Case10(D)
	//	relativeXPathUsingTagNameWithAttributeName_PartialText();
		//Case10(E)
	//	relativeXPathUsingTagNameWithAttributeName_StaleElement();
		
		
		//Case11
	//	relativeXPathUsingTextContent();
		//Case12
	//	relativeXPathUsingTextContentAlone();
		//Case13
	//	relativeXPathUsingPartialMatchingOfTextContent();
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
			oBrowser.get("file:///D:/ExampleAutomation/Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 1: Identify Element based on <tagName> alone
	 * Syntax:
	 * //<tagName>
	 */
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser12");
	}
	
	/**
	 * Case 2: Identify Element based on <tagName> with index
	 * Syntax:
	 * //<tagName>[index]
	 */
	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser12");
	}
	
	/**
	 * Case 3: Identify Element based on <tagName> 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue']
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		//oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		oBrowser.findElement(By.xpath("//input[@id='btn1submit1button1']")).click();
	}
	
	/**
	 * Case 4: Identify Element based on irrespective of any tag 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //*[@attributename='attributevalue']
	 */
	static void relativeXPathUsingAttributeNameAndValueCombination()
	{
		//oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
		oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	
	/**
	 * Case 5: Identify Element based on irrespective of any tag 
	 *  and irrespective of attribute name only using attribute value 
	 * Syntax:
	 * //*[@*='attributevalue']
	 */
	static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	
	/**
	 * Case 6: Identify Element based on Multiple
	 *   tagname,attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue'][@attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
	}
	
	/**
	 * Case 7: Identify Element based on Multiple
	 *   attributename and attribute value combination using And operator
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue' and @attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @type='button']")).click();
		         // 1 1 = 1 true
				// 0 0 = 0 false
				// 1 0 = 0 false
				// 0 1 = 0 false
	}
	
	/**
	 * Case 8: Identify Element based on Multiple
	 *   attributename and attribute value combination using or operator
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue' or @attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @class='submit1btn1']")).click();
		// 1 1 = 1
		// 0 0 = 0
		// 1 0 = 1
		// 0 1 = 1
	}
	
	/**
	 * Case 9: Identify Element based on 
	 *  Partial matching of attribute value 
	 *  starts-with(@attributename,'partial attributevalue');
	 *  ends-with(@attributename,'partial attributevalue');
	 *  contains(@attributename,'partial attributevalue');
	 * Syntax:
	 * //<tagName>[starts-with(@attributename,'partial attributevalue')]
	 * //<tagName>[ends-with(@attributename,'partial attributevalue')]
	 * //<tagName>[contains(@attributename,'partial attributevalue')]
	 */
	static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[starts-with (@id,'btn1')]")).click();
		//oBrowser.findElement(By.xpath("//input[contains (@id,'submit')]")).click();
		//oBrowser.findElement(By.xpath("//input[ends-with (@id,'btn1')]")).click(); this cannot be performed on xpath
	}
	
	/**
	 * Case 10(a): Identify Element based on 
	 *  <tagName> with attributename combination
	 * Syntax:
	 * //<tagName>[@attributename]
	 */
	static void relativeXPathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	//*Case10 (b)
	static void relativeXPathUsingTagNameWithAttributeName_displayLinkNames()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	
	//*Case10(c)
	static void relativeXPathUsingTagNameWithAttributeName_clickOnParticularLink()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		//olinks.get(0).click();//check in Dom HTML structure in which count position the url/href is there and feed input to get()
		olinks.get(3).click();
	}
	
	//*Case10(D)
	static void relativeXPathUsingTagNameWithAttributeName_PartialText()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			    // if(content.endsWith("Tool"))//ending limk letters
			    	// if(content.endsWith("HQ"))
			            if(content.endsWith("che"))
			         {
				       link.click();
				       break;
			         }
		}
	}
	
	//*Case10(E)
	// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
	//element is not attached to the page document
	static void relativeXPathUsingTagNameWithAttributeName_StaleElement()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			//if(content.startsWith("Selenium"))//starting letters
				if(content.startsWith("POI"))
			{
				link.click();
				break;// can be applied or not applied 
			}
		}
	}
	
	/**
	 * Case 11: Identify Element based on text Content 
	 *  
	 * Syntax:
	 * //<tagName>[text()='text content']
	 */
	static void relativeXPathUsingTextContent()
	{
		//oBrowser.findElement(By.xpath("//a[text()='Eclipse']")).click();
		oBrowser.findElement(By.xpath("//*[text()='Maven Build Tool']")).click();
	}
	
	
	/**
	 * Case 12: Irrespective of tagName Identify Element based on text Content 
	 *  
	 * Syntax:
	 * //*[text()='text content']
	 */
	static void relativeXPathUsingTextContentAlone()
	{
		oBrowser.findElement(By.xpath("//*[text()='Eclipse']")).click();
		
	}
	
	/**
	 * Case 13: Identify Element based on 
	 *  Partial matching of text content 
	 *  starts-with(text(),'partial text content');
	 *  ends-with(text(),'partial text content');
	 *  contains(text(),'partial text content');
	 * Syntax:
	 * //<tagName>[starts-with(text(),'partial text content')]
	 * //<tagName>[ends-with(text(),'partial text content')]
	 * //<tagName>[contains(text(),'partial text content')]
	 */
	static void relativeXPathUsingPartialMatchingOfTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'Sele')]")).click();
	//	oBrowser.findElement(By.xpath("//a[contains(text(),'Build')]")).click();
	//	oBrowser.findElement(By.xpath("//a[ends-with(text(),'pse')]")).click();//does not work ,use for loop machnism and try to retrieve that link
	}

}

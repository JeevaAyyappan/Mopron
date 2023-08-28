package lib;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.aventstack.extentreports.Status;

import features.Basetest;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

//import jxl.Sheet;

/**
 * @author dineshkumar_pr
 *
 */
/**
 * @author dineshkumar_pr
 *
 */
public class ElementActions {

	public static int HIGHLIGHTERINT = 5;
	
	public void log(String logs)
	{
		try
		{
			Constants.w.write(logs+"\r\n");
			System.out.println(logs);
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			System.out.println("Error in logging "+e.getMessage());
		}

	}

	public void waitInSeconds(WebDriver driver, int n)
	{
		try {
			for(int i = 1 ; i <= n; i++)
			{
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.getMessage();
		}
	}

	public void highlightElement(WebDriver driver, WebElement element)
	{
        try {        	
            for (int i = 0; i < HIGHLIGHTERINT; i++) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript(
                        "arguments[0].setAttribute('style', arguments[1]);",
                        element, "color: #800000; border: 2px solid blue;");
            }
        } catch (Exception e) {
        	Constants.exceptionMsg = e.getMessage();
        }
    }
	
	public void scrollUp(WebDriver driver) {
        try {        	
        	((JavascriptExecutor) driver).executeScript("scroll(0, -400);");
        	Thread.sleep(1000);
        } catch (Exception e) {
        	Constants.exceptionMsg = e.getMessage();
        	e.printStackTrace();
        }
    }
	
	public void scrollDown(WebDriver driver) {
        try {        	
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
        	Thread.sleep(1000);
        } catch (Exception e) {
        	Constants.exceptionMsg = e.getMessage();
        	e.printStackTrace();
        }
    }
	
	public  void scrollToAnElement(WebElement element) {
        try {	        	
	        	((JavascriptExecutor) Basetest.driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        	Thread.sleep(1000);             
        } catch (Exception e) {

        }
    }
	
	
	public void waitForInvisibility(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofMillis(10000));		
		wait.until(ExpectedConditions.invisibilityOf(ele));
		//log("wait for invisibility "+wait.until(ExpectedConditions.invisibilityOf(ele)));
	}

	
	public void waitForVisibilityOfElement(WebDriver driver, By by)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		log("wait for Visibility "+wait.until(ExpectedConditions.visibilityOfElementLocated(by)));
	}
	
	
	
	public void waitUntilClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(90));	
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForAlert(WebDriver driver)
	{
		try
		{
			log("Waiting for alert");
			WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(90));	
			wait.until(ExpectedConditions.alertIsPresent());
			log("Alert Found");

		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in waiting for new alert to open");
			log(e.getMessage());
		}

	}

	public void jsClick(WebDriver driver, WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("document.getElementById(element).click()");
	}


	public void mouseOverAnElement(WebDriver driver, WebElement element)
	{
		log("Mouse over on an element" +element);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();		
	}
	
	public void mouseOverandClickAnElement(WebDriver driver, WebElement element)
	{
		log("Mouse over on an element" +element);
		Actions action = new Actions(driver);		
		action.moveToElement(element).click().build().perform();		
	}
	

	/*
	 * This method will click the html element and wait for the alert once alert comes it will accept it
	 */
	public void clickAndAcceptAlert(WebDriver driver, WebElement ele, boolean link)
	{
		try
		{
			if(link == false)
			{	
				ele.click();
				waitForAlert(driver);
			}
			Alert alert=driver.switchTo().alert();
			log("Accepting Alert");
			alert.accept();
			driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in Accept alert");
			log(e.getMessage());
		}
	}

	/*
	 * This method will click the html element and wait for the alert once alert comes it will decline it
	 */
	public void clickAndDeclineAlert(WebDriver driver,WebElement ele, boolean link)
	{
		try
		{
			if(link == false)
			{
				ele.click();
				waitForAlert(driver);
			}
			Alert alert=driver.switchTo().alert();
			log("Declining Alert");
			alert.dismiss();
			driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in declining an alert");
			log(e.getMessage());
		}
	}	

	/*
	 * This method will take the driver, Locator and Text to type as parameter and type it in UI
	 */

	public void type(WebDriver driver, By by, String Text) throws Exception
	{
		try
		{
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(Text);
			String txt = (driver.findElement(by).getText().isEmpty()) ? driver.findElement(by).getAttribute("value") : driver.findElement(by).getText();
			if(txt.trim().equals(Text))
				log(Text+" is typed in "+by.toString());
			else
				log(Text+" is typed in "+by.toString()+" but not displayed in UI");
		}
		catch(Exception e)
		{
			Constants.childTest.log(Status.FAIL, "Element not appear:"+e.getMessage());
			Constants.exceptionMsg = e.getMessage();
			//Constants.childTest.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(Constants.folderName+"/ExtentScreen/"+Constants.testCaseId+Constants.functionName+Constants.stepDesc+".png").build());
			//Constants.childTest.addScreenCaptureFromPath(Constants.folderName+"/ExtentScreen/"+Constants.testCaseId+Constants.functionName+Constants.stepDesc+".png");
			log("Exception in typing the text "+Text+" in Element "+by.toString());
			log(e.getMessage());
			e.printStackTrace();
		}
	}

	public void checkElementIfNotChecked(WebDriver driver, By by)throws Exception
	{
		try{			
			if(!driver.findElement(by).isSelected()){				
				driver.findElement(by).click();
			}
		}catch(Exception e){
			log("Element is already checked or not visible"+by.toString());
			log(e.getMessage());
		}
	}

	public void selectByIndex(WebDriver driver, By by, int no) throws Exception
	{
		try
		{
			String oldVal = driver.findElement(by).getText();
			Select list = new Select(driver.findElement(by));
			list.selectByIndex(no);
			String newVal = driver.findElement(by).getText();
			log("Selected "+newVal+" in the list from "+oldVal);
		}
		catch(Exception e)
		{
			Constants.childTest.log(Status.FAIL, "Element is not selected :"+e.getMessage());
			log("Exception in selecting the index "+no+" in the list "+by.toString());
			log(e.getMessage());
		}
	}


	/*
	 * This method will take Webdriver, locator of the list and Text to select as parameter and the text present
	 * in the list will be selected 
	 */	
	public void selectByText(WebDriver driver, WebElement element, String Text)
	{
		try
		{			
			Select list = new Select(element);
			list.selectByVisibleText(Text);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	/*
	 * This method will verify whether the text is present in the element or not
	 */

	public boolean verifyTextPresent(WebDriver driver, By by, String Text, boolean presence) throws Exception
	{
		boolean present = false;
		try
		{

			String txt = (driver.findElement(by).getText().isEmpty()) ? driver.findElement(by).getAttribute("value") : driver.findElement(by).getText();
			present = txt.equalsIgnoreCase(Text) ? true : false;
			if(present)
				log("Text "+Text+" is present in "+by);
			else
				log("Text "+Text+" is not present in "+by+" instead "+txt+" is present");



			if(presence == present)
			{
				return true;
			}

			else
			{
				Constants.childTest.log(Status.FAIL, "Text is not present, Instead the text present is :"+txt);
				return false;
			}
		}
		catch(Exception e)
		{						
			Constants.exceptionMsg = e.getMessage();			
			log("Exception in verifying the presence of a text "+Text+" in the element "+by.toString());
			log(e.getMessage());
			return false;
		}
	}


	public boolean verifyContainsTextPresent(WebDriver driver, By by, String Text) throws Exception
	{
		boolean present = false;
		try
		{
			List<WebElement> txt = driver.findElements(by);
			for (WebElement getName : txt) {
				present = getName.getText().contains(Text);
				if(present==true){
					log("Text "+Text+" is present in "+by);
				}else{
					log("Text "+Text+" is not present in "+by+" instead "+txt+" is present");
					Constants.childTest.log(Status.FAIL, "Text is not present, Instead the text present is :"+txt);
				}
			}
			}
		catch(Exception e)
		{						
			Constants.exceptionMsg = e.getMessage();			
			log("Exception in verifying the presence of a text "+Text+" in the element "+by.toString());
			log(e.getMessage());
		}
		return present;
	}

	
	/*
	 * This method will verify whether the element contains the text or not
	 */

	public boolean verifyTextContains(WebDriver driver, By by, String Text, boolean presence)
	{
		boolean present = false;
		try
		{
			if(driver.findElement(by).getText().contains(Text))
			{
				present = true;
			}
			if(presence == present)
				return true;

			else
				return false;
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in verifying whether the element "+by.toString()+" contains the text "+Text+" or not");
			log(e.getMessage());
			return false;
		}
	}


	/*
	 * This method will verify whether the element is present or not
	 */

	public boolean verifyElementPresent(WebDriver driver, By by, boolean presence) throws Exception
	{
		boolean present = false;
		try
		{
			if(driver.findElements(by).size() > 0)
			{
				present = true;
			}
			if(presence == present)
				return true;

			else
				Constants.childTest1.log(Status.FAIL, "Element is not present :"+presence);
				return false;
		}
		catch(Exception e)
		{
			
			Constants.exceptionMsg = e.getMessage();
			log("Exception in Verifying the present of the element "+by.toString());
			log(e.getMessage());
			return false;
		}
	}


	/*
	 * This method will verify whether the attribute of the element is equal to the given input parameter or not
	 */

	public boolean verifyAttributeEquals(WebDriver driver, By by, String attributes[], String values[], boolean presence)
	{
		boolean present = true;
		try
		{
			int size = attributes.length;
			for(int i = 0 ; i < size ; i++)
			{
				if(!driver.findElement(by).getAttribute(attributes[i]).equals(values[i]))
				{
					log("Verify attrib attrib= "+attributes[i]+" Actual "+driver.findElement(by).getAttribute(attributes[i]));
					present = false;
					break;
				}
			}

			if(presence == present)
				return true;

			else
				return false;
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in verfying the value of attributes "+attributes.toString()+" equals the values "+values.toString());
			log(e.getMessage());
			return false;
		}
	}

	public boolean verifyCSSAttribute(WebDriver driver, By by, String attributes[], String values[], boolean presence)
	{
		boolean present = true;
		try
		{
			int size = attributes.length;
			for(int i = 0 ; i < size ; i++)
			{
				if(!driver.findElement(by).getCssValue(attributes[i]).equals(values[i]))
				{
					present = false;
					break;
				}
			}

			if(presence == present)
				return true;

			else
				return false;
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in verfying the value of CSS attributes "+attributes.toString()+" equals the values "+values.toString());
			log(e.getMessage());
			return false;
		}

	}

	/*
	 * This method will verify whether the attribute of the element is contains the given input parameter or not
	 */
	public boolean verifyAttributeContains(WebDriver driver, By by, String attributes[], String values[], boolean presence)
	{
		boolean present = true;
		try
		{
			int size = attributes.length;
			for(int i = 0 ; i < size ; i++)
			{
				if(!driver.findElement(by).getAttribute(attributes[i]).contains(values[i]))
				{
					present = false;
					break;
				}
			}
			if(presence == present)
				return true;

			else
				return false;
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in verfying the value of attributes "+attributes.toString()+" contains the values "+values.toString());
			log(e.getMessage());
			return false;
		}
	}



	public boolean verifyCurrentURL(WebDriver driver, String URL, boolean presence) throws Exception
	{
		try{
			String url = driver.getCurrentUrl();
			System.out.println(url);
			boolean present = false;
			log("Current URL is "+url);
			if(URL.equals(url))
			{
				System.out.println("Arg Value:" +URL);
				present = true;
			}
			if(present == presence)
				return true;
			else
				//Constants.childTest.log(Status.FAIL, "URL is mismatched :"+ presence);
				return false;
		}catch(Exception e){
			
			Constants.exceptionMsg = e.getMessage();
			log("Exception in verfying the URL "+URL+" which contains the wrong url ");
			log(e.getMessage());
			return false;
		}
	}


	public boolean isEmpty(WebDriver driver, By by, boolean presence)
	{
		boolean present = false;
		boolean status = true;
		log("inside is empty and the text in by is "+driver.findElement(by).getText()+" ");
		if(driver.findElement(by).getText().isEmpty())
		{
			present = true;
		}
		if((presence == true && present == false) || (presence == false && present == true))
			return false;
		return status;
	}


	public void switchToWindow(WebDriver driver)
	{
		try
		{
			int beforeWindows = driver.getWindowHandles().size();
			int afterWindows = 0;

			while(beforeWindows > afterWindows)
			{
				afterWindows = driver.getWindowHandles().size();
			}

			String newWin = "";
			for(String w : driver.getWindowHandles())
			{
				newWin = w;
			}

			Constants.windows.add(newWin);
			Constants.windowCount++;
			driver.switchTo().window(Constants.windows.get(Constants.windowCount - 1));
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in switching from one window to another window");
			log(e.getMessage());
		}
	}

	
	
	public void switchBackToMainWindow(WebDriver driver)
	{
		try{
				String mainWin = driver.getWindowHandle();
				driver.switchTo().window(mainWin);
		}catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception when switching back to main window");
			log(e.getMessage());
		}
	}
	
	/*
	 * This method will switch the WebDriver to a specified frame
	 */

	public void switchToFrame(WebDriver driver, By by)
	{
		try
		{
			driver.switchTo().frame(driver.findElement(by));
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in switching from one Frame to another");
			log(e.getMessage());
		}

	}

	/*
	 * This method will switch the WebDriver to defaultContent from a frame
	 */

	public void switchToDefault(WebDriver driver)
	{
		try
		{
			driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			Constants.exceptionMsg = e.getMessage();
			log("Exception in switching to default content");
			log(e.getMessage());
		}
	}

	public void selectMultipleValueFromList(WebDriver driver, String text, WebElement element)
	{
		try{
			//int i=1;
			log("testing dash");
			/*WebDriverWait wait = new WebDriverWait(driver, 120);		
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));*/
			List<WebElement> options = driver.findElements(By.xpath("element"));
			//wait.until(ExpectedConditions.visibilityOfAllElements(options));
			for(WebElement option : options) {
				String optEle = option.getText().trim();
				log(optEle);
				//System.out.println(optEle);
			    if (optEle.contains(text)) {
			    	//while(i<3){
				    	//if(option.isDisplayed()){				    		
				    		//WebElement ele = option.findElement(By.tagName("tr")).findElement(By.tagName("td"));
				    		//System.out.println(ele.getText());
				    		option.click();
				    		break;
				    	//}else {
				    	//	Thread.sleep(1000);
				    		//i++;
				    	//}
			    	//}
			    }
			}			
		}catch(Exception e){
			Constants.exceptionMsg = e.getMessage();
			log(e.getMessage());
			e.printStackTrace();
		}
	}

	public void handlingWindowsAlert(WebDriver driver)
	{
		try{

			System.out.println("File Upload Has been started");			
			//if(browser.contains("ChromeAlert")){
			String AutoItPath = System.getProperty("user.dir")+"\\drivers\\WindowsAlert.exe";
			Runtime.getRuntime().exec(AutoItPath);
			//}
			
			/*WebElement element = driver.findElement(by);
			element.click();
			element.sendKeys(path);*/
		}catch(Exception e){
			Constants.exceptionMsg = e.getMessage();
			log(e.getMessage());
		}
	}
	
	public void CHfileUpload(WebDriver driver, String browser)
	{
		try{

			//driver.findElement(By.className("dz-message")).sendKeys("C:\\Users\\dineshkumar_pr\\Desktop\\SampleDoc.docx");
			System.out.println("File Upload Has been started");			
			if(browser.contains("Chrome")){
			String AutoItPath = System.getProperty("user.dir")+"\\drivers\\DocUpload.exe";
			Runtime.getRuntime().exec(AutoItPath);
			}else if(browser.contains("FireFox")){
				String AutoItPath = System.getProperty("user.dir")+"\\drivers\\DocUploadFF.exe";
				Runtime.getRuntime().exec(AutoItPath);
			}else if(browser.contains("Invalid")){
				String AutoItPath = System.getProperty("user.dir")+"\\drivers\\FileUploadInvalid.exe";
				Runtime.getRuntime().exec(AutoItPath);
			}			
			/*WebElement element = driver.findElement(by);
			element.click();
			element.sendKeys(path);*/
		}catch(Exception e){
			Constants.exceptionMsg = e.getMessage();
			log(e.getMessage());
		}
	}

	/*
	 * This method will close the current window and decrement the no. of windows counter and remove the closed 
	 * Window's handle from the windows list 
	 */

	public void datePicker(WebElement element,int day)throws Exception{
		try{
				element.click();
				WebDriverWait wait = new WebDriverWait(Basetest.driver,  Duration.ofSeconds(30));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-datepicker-div")));
				WebElement table = Basetest.driver.findElement(By.id("ui-datepicker-div"));	
				
				//List<WebElement> tableRows = table.findElements(By.tagName("tr"));				
					List<WebElement> cells = table.findElements(By.tagName("td"));
					for (WebElement cell : cells){
						String date = String.valueOf(day);
						if (cell.getText().equals(date)){							
							WebElement picker = Basetest.driver.findElement(By.linkText(date));
							picker.click();
						}
					}								
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	public void closeWindow(WebDriver driver) throws Exception
	{
		try
		{
			System.out.println("no of windows "+Constants.windowCount);
			driver.close();
			if(Constants.windowCount>1)
			{
				Constants.windowCount = Constants.windowCount - 1;
				Constants.windows.remove(Constants.windowCount);
				driver.switchTo().window(Constants.windows.get(Constants.windowCount - 1));
			}
			else
				Constants.windowCount = Constants.windowCount - 1;
		}
		catch(Exception e)
		{
			Constants.childTest.log(Status.FAIL, "Window does not close successfully :"+e.getMessage());
			Constants.exceptionMsg = e.getMessage();
			log("Exception in Closing the window "+e.getMessage());
			log(e.getMessage());
		}

	}

	public void destroyDriver() throws Exception
	{
		try 
		{
			Process child1 = Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
			Process child2 = Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
			Process child3 = Runtime.getRuntime().exec("taskkill /f /im IEDriverServer.exe");
		} 
		catch (IOException e) 
		{
			log("Exception in destroying driver");
			log(e.getMessage());
		}
	}
}

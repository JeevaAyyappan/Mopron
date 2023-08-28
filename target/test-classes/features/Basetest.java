package features;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import lib.PropertyFile;
import lib.Utility;

public class Basetest {
	public static WebDriver driver;
	public static String parentWindow;
	

	public static void initDriver() {
	//	DesiredCapabilities capabilities = new DesiredCapabilities();		
		if (PropertyFile.getbrowser().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Utility.getResourcePath() + "\\geckodriver.exe");
			//DesiredCapabilities capabilitiesf = DesiredCapabilities.firefox();
			//capabilitiesf.setCapability("marionette", true);
			driver = new FirefoxDriver();
		} else if(PropertyFile.getbrowser().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",Utility.getResourcePath() + "\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
	        //options.addArguments("--disable-gpu");
	        driver = new ChromeDriver(options);
		}  else if(PropertyFile.getbrowser().equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver",Utility.getResourcePath() + "\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void switchtoParentWindow() {
		Basetest.driver.switchTo().window(parentWindow);
	}

	public static void switchtoNewWindow() {
		parentWindow = Basetest.driver.getWindowHandle();
		for (String winHandle : Basetest.driver.getWindowHandles()) {
			Basetest.driver.switchTo().window(winHandle);
		}
	}

	public static void testMethodTearDown() {
		driver.quit();
	}
		
	
	
	public static void testMethodTearDown(Scenario result) {
	if (result.isFailed()) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
				File fileTarget = new File("target\\screenshots\\failure_"+ timeStamp + ".jpg");
				FileUtils.copyFile(screenshot, fileTarget);
				Reporter.addScreenCaptureFromPath(Utility.workdirectory()+"\\target\\screenshots\\failure_"	+ timeStamp + ".jpg");
				Reporter.addScreenCast(Utility.workdirectory()+"\\target\\screenshots\\failure_"+ timeStamp + ".jpg");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		Reporter.getExtentReport().flush();
		
		//driver.quit();
	}
	
	
}

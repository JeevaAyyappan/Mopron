package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class ResellerAdminPage extends ElementActions{

	DCCDashboard dcc;
	
	public ResellerAdminPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	@FindBy(xpath="//div[@class='loader__icon']//*[@class='checkmark']")
	WebElement reselloader;
	
	@FindBy(xpath="//img[@class='js-logo']//ancestor::div//following-sibling::div/span[contains(text(),'Reseller Admin')]")
	WebElement resellogo;
	
	
	public boolean isDisplayResellerAdminPage()throws Exception{
		boolean status = false;
		try{	
			Wait.waitUntilElementPresent(resellogo);
			highlightElement(Basetest.driver, resellogo);
			if(resellogo.isDisplayed()){
				return status = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void clickAccountName(String accNam, String mail)throws Exception{
		try {
			
				WebElement globe = Basetest.driver.findElement(By.xpath("//table//tbody/tr/td[contains(.,'"+accNam+"')]//following-sibling::td[contains(.,'"+mail+"')]//following-sibling::td//a[@class='icon-Web iaction ']"));
				highlightElement(Basetest.driver, globe);
				globe.click();
				ArrayList<String> newTb = new ArrayList<String>(Basetest.driver.getWindowHandles());
				Basetest.driver.switchTo().window(newTb.get(2));
				Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//waitForInvisibility(Basetest.driver, dcc.loader.get(0));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

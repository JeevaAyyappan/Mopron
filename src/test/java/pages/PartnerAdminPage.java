package pages;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class PartnerAdminPage extends ElementActions{

	public PartnerAdminPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	ResellerAdminPage resel;
	
	@FindBy(xpath="//img[@class='js-logo']//ancestor::div//following-sibling::div/span[contains(text(),'Partner Admin')]")
	WebElement logo;
	
	
	public boolean isDisplayedPartnerAdminPage()throws Exception{
		boolean status = false;
		try{	
			Wait.waitUntilElementPresent(logo);
			highlightElement(Basetest.driver, logo);
			if(logo.isDisplayed()){
				return status = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void clickAccountOwner(String accNam, String mail)throws Exception{
		try {
			
				WebElement globe = Basetest.driver.findElement(By.xpath("//table//tbody/tr/td[contains(.,'"+accNam+"')]//following-sibling::td[contains(.,'"+mail+"')]//following-sibling::td//a[@class='icon-Web iaction ']"));
				highlightElement(Basetest.driver, globe);
				globe.click();
				 ArrayList<String> newTb = new ArrayList<String>(Basetest.driver.getWindowHandles());
				 Basetest.driver.switchTo().window(newTb.get(1));
				 Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//waitForInvisibility(Basetest.driver, resel.reselloader);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class MoproLoginPage extends ElementActions{

	public MoproLoginPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	@FindBy(id="useremail")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login_button;
	
	@FindBy(id="txtUsername")
	WebElement custuserName;
	
	@FindBy(id="txtPassword")
	WebElement custpassword;
	
	@FindBy(id="btnLoginSubmit")
	WebElement custlogin_button;
	
	@FindBy(id="email")
	WebElement fbuserName;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(id="loginbutton")
	WebElement fblogin_button;
	
	public void enterUsername(String user_name) {
		Wait.waitUntilElementPresent(userName);
		userName.sendKeys(user_name);
	}
	
	public void enterPassword(String password_value) {
		Wait.waitUntilElementPresent(password);
		password.sendKeys(password_value);
	}
	
	public void clicklogin_button()throws Exception {
		Wait.waitUntilElementPresent(login_button);
		login_button.click();
		//Wait.waitForInvisibility(pageLoad);
	}
	
	public void enterCustUsername(String user_name) {
		Wait.waitUntilElementPresent(custuserName);
		custuserName.sendKeys(user_name);
	}
	
	public void enterCustPassword(String password_value) {
		Wait.waitUntilElementPresent(custpassword);
		custpassword.sendKeys(password_value);
	}
	
	public void clickCustlogin_button()throws Exception {
		Wait.waitUntilElementPresent(custlogin_button);
		custlogin_button.click();
		waitInSeconds(Basetest.driver, 4);
	}
	
	public void enterFBUsername(String user_name) {
		Wait.waitUntilElementPresent(fbuserName);
		fbuserName.sendKeys(user_name);
	}
	
	public void enterFBPassword(String password_value) {
		Wait.waitUntilElementPresent(fbpassword);
		fbpassword.sendKeys(password_value);
	}
	
	public void clickFBlogin_button()throws Exception {
		Wait.waitUntilElementPresent(fblogin_button);
		fblogin_button.click();
		//Wait.waitForInvisibility(pageLoad);
	}
	
	
	
	
}

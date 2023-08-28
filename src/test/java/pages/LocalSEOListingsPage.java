package pages;

import java.util.Set;

import javax.xml.bind.DatatypeConverter;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class LocalSEOListingsPage extends ElementActions{

	
	public LocalSEOListingsPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	public static String Authtoken = "";
	 public String url = "";
	 
	@FindBy(xpath="//div[@class='owl-stage']//div/a[contains(.,'Local SEO Listings')]")
	WebElement seoListingsHeader;
	
	
	public boolean isDisplayLocalSeoListingsPage()throws Exception{
		boolean status = false;
		try{	
			Wait.waitUntilElementPresent(seoListingsHeader);
			highlightElement(Basetest.driver, seoListingsHeader);
			getURL();
			accessCookies();
			if(seoListingsHeader.isDisplayed()){
				return status = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public String getURL()throws Exception{
		url = Basetest.driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	
	public void accessCookies()throws Exception{
		 Set<Cookie> cookies = Basetest.driver.manage().getCookies();

	        // Name of the cookie you want to read
	        String cookieToken = "_token";
	        String cookie_user = "_user";

	        String user = "";
	        String token = "";
	
	        String auth = null;
	        // Loop through the cookies to find the one with the desired name
	        // Check if the cookie was found and print its value
	        for (Cookie cookie : cookies) {        	
	        	if(cookie.getName().equalsIgnoreCase(cookieToken)) {
	        		System.out.println(cookie.getValue());
	        		token=cookie.getValue();
	        		}
	        	if(cookie.getName().equalsIgnoreCase(cookie_user)) {
	        		System.out.println(cookie.getValue());
	        		user=cookie.getValue();
	        		}
	            }
	        auth = user+":"+token;
	        Authtoken = "Basic "+ DatatypeConverter.printBase64Binary(auth.getBytes());
	        System.out.println(Authtoken);
	        
	}
}

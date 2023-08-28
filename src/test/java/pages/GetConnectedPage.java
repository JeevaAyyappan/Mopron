package pages;

import java.util.Optional;
import java.util.Set;

import javax.xml.bind.DatatypeConverter;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.network.Network;
import org.openqa.selenium.devtools.v113.fetch.Fetch;
import org.openqa.selenium.devtools.v113.network.model.Headers;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class GetConnectedPage extends ElementActions{

	public GetConnectedPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	 public static String Authtoken = "";
	 public String url = "";
	 
	@FindBy(xpath="//div[contains(@class,'review-connector-wrapper')]//h1")
	WebElement connectAccountsPageName;
	
	
	public boolean isDisplayGetConnectedPage()throws Exception{
		boolean status = false;
		try{	
			Wait.waitUntilElementPresent(connectAccountsPageName);
			highlightElement(Basetest.driver, connectAccountsPageName);
			getURL();
			accessCookies();
			if(connectAccountsPageName.isDisplayed()){
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
	
	
	public void accessURL()throws Exception{
		try {
			 // Start the DevTools
	        DevTools devTools = ((ChromeDriver) Basetest.driver).getDevTools();
	        devTools.createSession();
	        devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
	        devTools.addListener(Fetch.requestPaused(), req ->
	        {
	        	
	        	//(req.getRequest().getUrl().contains("GetPojectSocialUserDetails")) {
			        	String reqUrl = req.getRequest().getUrl();
			        	System.out.println("URL: " + reqUrl);
			        	Headers header = req.getRequest().getHeaders();
			        	System.out.println("Headers" + header);
	        	//}
		});
	        devTools.addListener(Fetch.authRequired(), req ->
	        {
	        
			        	String reqUrl = req.getRequest().getUrl();
			        	System.out.println("URL: " + reqUrl);
			        	Headers header = req.getRequest().getHeaders();
			        	System.out.println("Headers" + header);
	        	
		});
	        
	        
	        // Add a listener to collect network data
	        devTools.addListener(Network.responseReceived(), responseReceived -> {
	            org.openqa.selenium.devtools.v112.network.model.Response resp = responseReceived.getResponse();
	            System.out.println("URL: " + resp.getUrl());         
	            System.out.println("Response data: " + responseReceived.getResponse().getHeaders());
	            
	        });
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

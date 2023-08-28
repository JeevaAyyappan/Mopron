package pages;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import groovy.transform.Undefined.EXCEPTION;

import org.json.simple.JSONArray;
import org.junit.Assert;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import lib.ElementActions;

public class NetworkAPI extends ElementActions{

	public NetworkAPI(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	String arr;
	
	@FindBy(xpath="//a[@class='btn js-dashboard-project']")
	WebElement selectButton;
	
	@FindBy(xpath="//div[@class='modal__content']//div[@class='loader__icon']")
	WebElement loaderIcon;
	
	private String connect = "//div[@class='gray-box__front']//span[contains(text(),'network')]//ancestor::div[1]//following-sibling::a";
	
	@FindBy(id="txtLink")
	WebElement networkUrl;
	
	@FindBy(xpath="//a[@class='btn btn_save']")
	WebElement popupConnect;
	
	@FindBy(xpath="//div[@class='modal__footer']//a[@class='btn btn-large '][contains(text(),'Yes')]")
	WebElement popupYes;
	
	public void clickSelectButton()throws Exception{
		try {
				highlightElement(Basetest.driver, selectButton);
				selectButton.click();
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickYelpConnect(String net, String netUrl)throws Exception{
		try {
				connect = connect.replace("network", net);
				WebElement connectButton = Basetest.driver.findElement(By.xpath(connect));
				WebElement tile = Basetest.driver.findElement(By.xpath("//span[contains(text(),'"+net+"')]//ancestor::div[@class='gray-box__front']"));
				//WebElement backtile = Basetest.driver.findElement(By.xpath("//div[@class='gray-box__back']//a[@href='"+netUrl+"']"));
				scrollToAnElement(tile);
				if(Basetest.driver.findElement(By.xpath("//div[@class='gray-box__back']//a[@href='"+netUrl+"']")).isDisplayed()) {
					mouseOverAnElement(Basetest.driver, tile);
					waitInSeconds(Basetest.driver,2);
					WebElement removeAccnt = Basetest.driver.findElement(By.xpath("//span[@title='"+net+"']//following-sibling::span"));
					highlightElement(Basetest.driver, removeAccnt);
					removeAccnt.click();
					popupYes.click();
					waitInSeconds(Basetest.driver, 4);
					scrollToAnElement(tile);
					 int retryCount = 0;
				     int maxRetries = 3;
				        while (retryCount < maxRetries) {
				        	try {								
									//waitUntilClickable(Basetest.driver, connectButton);
				        		WebElement connect = Basetest.driver.findElement(By.xpath("//div[@class='gray-box__front']//span[contains(text(),'"+net+"')]//ancestor::div[1]//following-sibling::a"));
									highlightElement(Basetest.driver, connect);
									connect.click();
									waitInSeconds(Basetest.driver, 2);
									networkUrl.sendKeys(netUrl);
									waitInSeconds(Basetest.driver,1);
									popupConnect.click();
									waitInSeconds(Basetest.driver, 2);
									break;
				        	}catch(org.openqa.selenium.StaleElementReferenceException e) {
				        		retryCount++;
				        	}
				        }
				        
				}else if(connectButton.isDisplayed()) {			
					highlightElement(Basetest.driver, connectButton);
					connectButton.click();
					waitInSeconds(Basetest.driver, 2);
					networkUrl.sendKeys(netUrl);
					waitInSeconds(Basetest.driver,1);
					popupConnect.click();
					waitInSeconds(Basetest.driver, 2);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	
	public boolean isDisplayIconChecked(String title)throws Exception{
		boolean status = false;
		try{	
				WebElement icon = Basetest.driver.findElement(By.xpath("//span[@title='"+title+"']//ancestor::div[@class='gray-box__back']//i[@class='icon-Checked']"));
				if(icon.isDisplayed()) {
					return true;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void getNetwork()throws Exception{
	try {	
		//Response resp = 
			arr= RestAssured.given()
		.when().header("Authorization","Basic Zjg2NjQ3NTMtNjI3Yy00OTNmLTg4MDUtMWQ4ODhiYmE4MjE3OjA3NmRlNTM3LWZhMWYtNDg2Ny1hZTMzLWY4ZWQxYmRiYmU0ZQ==")
			.get("https://api.stage.mopro.com/api/social/GetPojectSocialUserDetails/b4489d66-fe26-4eda-9dd9-af13f5355959?_=1689879552934")
		.then().statusCode(200)
		//.assertThat()
		//.body()
		//.header("Content-Type", "application/json")
		//.log().all()
		.extract().response().asString();
		
		JsonPath jp = new JsonPath(arr);
		String net = jp.get("data");
		JsonPath jp2 = new JsonPath(net);
		List<String> nesval =  jp2.getList("rows.ProfileURL");
		JSONArray ja =  new JSONArray();
		for(String netval:nesval) {
			JSONArray.toJSONString(nesval);
			System.out.println(netval);
		}
		
		Assert.assertNotNull(nesval);
		Assert.assertTrue(nesval.size()<0);
		Assert.assertEquals("33622",jp2.getInt("rows.NetworkID)"));
		//String body = resp.body().asString();
		//JsonPath jp = new JsonPath(resp.asString());
		//arr=arr.replace("{","").replace("}","");
		//JSONArray ja =  new JSONArray(arr.contains("NetworkID"));
		
		//JSONObject jo = new JSONObject(jp.get(arr));
		//jo.get("NetworkID").equals(33622);
		/*for(int i=0;i<ja.length();i++) {
		org.json.JSONObject jo = ja.getJSONObject(i);*/
		
		//assertThat(jo.get("NetworkID"),equalTo("33622"));
		System.out.println(nesval);
		//jo.get("NetworkID");
		//}
		/*
		 * JsonPath jp = resp.jsonPath(); 
		 * String arr = jp.get("data");
		 * 
		 * 
		 * System.out.println(arr);
		 */
	}catch(EXCEPTION e) {
		e.printStackTrace();
	}
	}

	
	
}

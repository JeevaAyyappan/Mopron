package lib;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import features.Basetest;

public class Wait {
	
	public static void waitUntilElementPresent(WebElement element){
		WebDriverWait wait = new WebDriverWait(Basetest.driver, Duration.ofSeconds(90));
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public static void waitUntilElementDisable(WebElement element){
		 int maxWaitTime = 500;
		 for (int i = 0; i < maxWaitTime; i++) {
			 if(!element.getAttribute("class").contains("disabled-btn")){
				 try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else{
				 break;
			 }}}

	public static void waitUntilTrue(WebElement element,String value){
		 int maxWaitTime = 500;
		 for (int i = 0; i < maxWaitTime; i++) {
			 if(element.getText().contains(value)){
				 break; 
			 }
			 else{
				 try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 
			 }}}

	public static void waitUntilElementEnable(WebElement element){
		 int maxWaitTime = 500;
		 for (int i = 0; i < maxWaitTime; i++) {
			 if(element.getAttribute("class").contains("disabled-btn")){
				 try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else{
				 break;
			 }}}

	public static void waitUntilElementNotPresent(WebElement element){
	 int maxWaitTime = 700;
	 for (int i = 0; i < maxWaitTime; i++) {
		 if(element.isDisplayed()){
			 try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else{
			 break;
		 }}}

	public static void waitUntilListisEmpty(List<WebElement> element){
		 int maxWaitTime = 500;
		 for (int i = 0; i < maxWaitTime; i++) {
			 if(!element.stream().filter(e ->e.isDisplayed()).collect(Collectors.toList()).isEmpty()){
				 try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else{
				 break;
			 }}}
	
	public static void waitUntilListisNotEmpty(List<WebElement> element){
		 int maxWaitTime = 500;
		 for (int i = 0; i < maxWaitTime; i++) {
			 if(element.stream().filter(e ->e.isDisplayed()).collect(Collectors.toList()).isEmpty()){
				 try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 else{
				 break;
			 }}}
	
	public static void scrollToAnElement(WebElement element) {
        try {	        	
	        	((JavascriptExecutor) Basetest.driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        	Thread.sleep(1000);             
        } catch (Exception e) {

        }
    }
}

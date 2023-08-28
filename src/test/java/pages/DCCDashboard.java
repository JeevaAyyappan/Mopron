package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.Wait;

public class DCCDashboard extends ElementActions{

	
	public DCCDashboard(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	@FindBy(xpath="//div[@class='loader__icon']//*[@class='checkmark']")
	List<WebElement> loader;
	
	@FindBy(xpath="//a[@data-title='Reputation Manager']/span[@class='card__title']")
	WebElement rmTile;
	
	@FindBy(xpath="//a[@data-title='Get Connected']/span[@class='card__title']")
	WebElement gcTile;
	
	@FindBy(xpath="//a[@data-title='Get 5 Star Reviews']/span[@class='card__title']")
	WebElement starRev;
	
	@FindBy(xpath="//a[@data-title='Local SEO Listings']/span[@class='card__title']")
	WebElement localSeo;
	
	@FindBy(xpath="//a[@data-title='Competition Tracker']/span[@class='card__title']")
	WebElement compTrack;
	
	@FindBy(xpath="//h2[contains(text(),'Your Digital Dashboard')]")
	WebElement dccDashboardTitle;
	
	public boolean isDisplayDCCDashboardPage()throws Exception{
		boolean status = false;
		try{	
			Wait.waitUntilElementPresent(dccDashboardTitle);
			highlightElement(Basetest.driver, dccDashboardTitle);
			if(dccDashboardTitle.isDisplayed()){
				return status = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public void clickRMtile()throws Exception{
		try {
			highlightElement(Basetest.driver, rmTile);
			rmTile.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickGCtile()throws Exception{
		try {
			scrollToAnElement(gcTile);
			highlightElement(Basetest.driver, gcTile);
			gcTile.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click5StarReviewtile()throws Exception{
		try {
			highlightElement(Basetest.driver, starRev);
			starRev.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickLocalSeoListingstile()throws Exception{
		try {
			highlightElement(Basetest.driver, localSeo);
			localSeo.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickCompetitionTrackertile()throws Exception{
		try {
			highlightElement(Basetest.driver, compTrack);
			compTrack.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

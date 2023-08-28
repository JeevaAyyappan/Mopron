package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import features.Basetest;
import lib.ElementActions;
import lib.PropertyFile;
import lib.Wait;

public class ReputationManagerPage extends ElementActions{

	public ReputationManagerPage(){
		PageFactory.initElements(Basetest.driver, this);
	}
	
	@FindBy(xpath="//a[contains(.,'Reputation Manager')]")
	WebElement reputatManager;
	
	@FindBy(xpath="//div[@class='loader__default-message']//h3[contains(.,'Synchronizing Feeds')]")
	WebElement synchLoad;
	
	@FindBy(xpath="//a[@title='Select All']/span[contains(.,'Select All')]")
	WebElement selectAll;
	
	@FindBy(xpath="//input[@title='searchbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='dropdown-menu open']//ul/li/a/span[3]")
	List<WebElement> networkList;
	
	@FindBy(xpath="//div[contains(@class,' show-tick show-menu-arrow')]/button")
	WebElement networkDropdown;
	
	@FindBy(xpath="//div[contains(@class,' no-padding all-post-wrapper')]//button[@class='undefined dropdown-toggle']")
	WebElement postDropdown;
	
	@FindBy(xpath="//div[contains(@class,' emotions')]")
	WebElement emotionsDropdown;
	
	@FindBy(xpath="//div[@class='rm-advanced-filters-mobile']//input[@id='chkhappy']")
	WebElement happy;
	
	@FindBy(xpath="//div[@class='rm-advanced-filters-mobile']//input[@id='chkneutral']")
	WebElement neutral;
	
	@FindBy(xpath="//div[@class='rm-advanced-filters-mobile']//input[@id='chksad']")
	WebElement unhappy;
	
	@FindBy(xpath="//div[@class='emotions'] /i[contains(@class,'active')]")
	List<WebElement> emotionList;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select filter-by-date']//button[@class='undefined dropdown-toggle']")
	WebElement dateRangeDropdown;
	
	@FindBy(xpath="//div[@id='MainContentdiv']//div[@class='row']//h5//a")
	List<WebElement> networkFeedListAfterselection;
	
	@FindBy(xpath="//div[@id='MainContentdiv']//a/i")
	List<WebElement> filteredFeeds;
	
	@FindBy(id="divRefreshFeeds")
	WebElement synchFeeds;
	
	@FindBy(xpath="//h3[contains(.,'Respond')]")
	WebElement respondPopup;
	
	@FindBy(id="cancelbtn")
	WebElement cancelBtn;
	
	@FindBy(id="replybtn")
	WebElement postBtn;
	
	@FindBy(xpath="//textarea[@id='txtEngage']")
	WebElement respondTextare;
	
	@FindBy(xpath="//div[@class='engaged-txt']")
	WebElement commentPostedBox;
	
	@FindBy(xpath="//a[@data-i18n='common.view-comment'][contains(.,'Hide Comment')]")
	WebElement hideComment;
	
	@FindBy(xpath ="//div[@class='modal__header']//h3")
	WebElement sharePopup;
	
	@FindBy(xpath ="//div[@class='share-social-popup']//i[@class='icon-Close']")
	WebElement sharePopupClose;
	
	@FindBy(xpath ="//a[@title='Facebook']")
	WebElement shareFacebook;
	
	@FindBy(xpath ="//a[@title='Tweet']")
	WebElement shareTwitter;
	
	@FindBy(xpath ="//a[@title='Tumblr']")
	WebElement shareTumblr;
	
	@FindBy(xpath ="//a[@title='LinkedIn']")
	WebElement shareLinkedIn;
	
	@FindBy(xpath ="//span/span[contains(.,'Share on Facebook')]")
	WebElement facebookPage;
	
	@FindBy(xpath ="//div[@class='innerWrap']/textarea")
	WebElement fbText;
	
	@FindBy(xpath ="//button/span[contains(.,'Post to Facebook')]")
	WebElement fbPostBtn;
	
	@FindBy(xpath ="//div[@data-viewportview='true']")
	WebElement twitterPage;
	
	@FindBy(xpath ="//div[@role='button'][@data-testid='tweetButton']//span//span[starts-with(.,'Tweet')]")
	WebElement tweetPostBtn;
	
	@FindBy(xpath ="//div[@class='controls-container']//div[@class='post-form--avatar']//following-sibling::div[@data-subview='tumblelogSelect']")
	WebElement tumblrPage;
	
	@FindBy(xpath ="//div[@class='editor editor-richtext']")
	WebElement tmblrText;
	
	@FindBy(xpath ="//button[@class='button-area create_post_button']")
	WebElement tmblrPostBtn;
	
	@FindBy(xpath ="//*[@type='linkedin-logo']")
	WebElement linkedInPage;
	
	@FindBy(id ="ember11")
	WebElement lnkdInPostBtn;
	
	@FindBy(id ="ember293")
	WebElement lnkdInPostBtn2;
	
	@FindBy(xpath="//a[@id='divConfigureNW']")
	WebElement connectAccount;

	@FindBy(xpath="//div[contains(@class,'review-connector-wrapper')]//h1")
	WebElement connectAccountsPageName;

	@FindBy(xpath = "//span[@data-i18n='common.remove-account']")
	WebElement removeAccBtn;

	@FindBy(xpath="//div[@class='modal__header']//h3")
	WebElement popupName;

	@FindBy(xpath="//div[@class='modal__footer']//a[@class='secondary ']")
	WebElement noBtn;

	@FindBy(xpath="//div[@class='modal__footer']//a[@class='btn btn-large ']")
	WebElement yesBtn;

	@FindBy(xpath="//a[@class='btn hollow  btnConnect']")
	WebElement connectBtn;
	
	public boolean isDisplayReputationManagerPage()throws Exception{
		boolean status = false;
		try{	
			waitForInvisibility(Basetest.driver, synchLoad);
			Wait.waitUntilElementPresent(reputatManager);
			highlightElement(Basetest.driver, reputatManager);
			if(reputatManager.isDisplayed()){
				return status = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public void clickNetworkDropDown()throws Exception{
		try {
				highlightElement(Basetest.driver, networkDropdown);
				networkDropdown.click();
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void clickSelectAllIntheNetworkDrop(String flag)throws Exception{
		try {
				Wait.waitUntilElementPresent(selectAll);
				if(flag.equalsIgnoreCase("Yes") && flag!=null) {
					highlightElement(Basetest.driver, selectAll);
					if(!selectAll.isSelected()) {
						selectAll.click();
					}
					reputatManager.click();
						waitInSeconds(Basetest.driver, 3);
					}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void searchMultipleNetworks(String networks)throws Exception{
		try {
				if(networks!=null) {
					Actions ac = new Actions(Basetest.driver);
				List<String> values = Arrays.asList(networks.split(","));	
					for(String val:values){	
						WebElement check = Basetest.driver.findElement(By.xpath("//a[@title=' "+val+"']/span[@class='glyphicon glyphicon-ok check-mark checkbox']"));
						String attri = check.getAttribute("aria-selected");
						if(attri.contains("true")) {
							ac.moveToElement(searchBox).keyDown(Keys.CONTROL).sendKeys("a")
							   .keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
							}else if(attri.contains("false")) {
								check.click();
								searchBox.clear();
							}
						searchBox.sendKeys(val);
						waitInSeconds(Basetest.driver, 2);
					}
				}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void networkRandonSelection(String networks)throws Exception{
		try {
			if(networks!=null) {
				List<String> values = Arrays.asList(networks.split(","));
					for(String val:values){	
							try {
							WebElement net = Basetest.driver.findElement(By.xpath("//div[@class='dropdown-menu open']//a[@data-tokens='"+val+"' and @aria-selected='false']"));
								net.click();
								waitInSeconds(Basetest.driver, 1);	
							}catch(Exception e) {
								e.printStackTrace();
							}
					}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public boolean isDisplayListOFFeeds()throws Exception{
		boolean status = false;
		try{	
			if(!networkFeedListAfterselection.isEmpty()) {
				for(WebElement ele:networkFeedListAfterselection) {
					highlightElement(Basetest.driver, ele);
					org.junit.Assert.assertTrue(ele.isDisplayed());
					return true;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public void selectPostDropDown(String post)throws Exception{
		try {
			Wait.waitUntilElementPresent(postDropdown);
				highlightElement(Basetest.driver, postDropdown);
				postDropdown.click();
				waitInSeconds(Basetest.driver, 2);
				WebElement postOpt = Basetest.driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li/a[contains(@title,'"+post+"')]"));
				postOpt.click();
				waitForInvisibility(Basetest.driver, synchLoad);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public boolean isDisplayFeeds()throws Exception{
		boolean status = false;
		try{	
			if(!filteredFeeds.isEmpty()) {
				for(WebElement ele:filteredFeeds) {
					highlightElement(Basetest.driver, ele);
					org.junit.Assert.assertTrue(ele.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void selectEmotions(String emotion)throws Exception{
		try {
			   int k=0;
			   while(k<2) {
				   //waitInSeconds(Basetest.driver, 4);
				   Wait.waitUntilElementPresent(emotionsDropdown);
				   if(emotion!=null) {
					   highlightElement(Basetest.driver, emotionsDropdown);
					   emotionsDropdown.click();
					   if(emotion.equalsIgnoreCase("Unhappy")) {
						   if(happy.isSelected()) {
							   	highlightElement(Basetest.driver, happy);
							   	happy.click();
							    waitInSeconds(Basetest.driver, 1);
						   }else {
							   	highlightElement(Basetest.driver, neutral);
							   	neutral.click();
							   	waitInSeconds(Basetest.driver, 1);
						   }
					   }
					   else if(emotion.equalsIgnoreCase("Happy")) {
						   if(neutral.isSelected()) {
							   highlightElement(Basetest.driver, neutral);
							   neutral.click();
							   waitInSeconds(Basetest.driver, 1);
						   }else {
							   highlightElement(Basetest.driver, unhappy);
							   unhappy.click();
							   waitInSeconds(Basetest.driver, 1);
						   }
					   }
					   else if(emotion.equalsIgnoreCase("Neutral")) {
						   if(happy.isSelected()) {
							   highlightElement(Basetest.driver, happy);
							   happy.click();
							   waitInSeconds(Basetest.driver, 1);
						   }
							else {
								highlightElement(Basetest.driver, unhappy);
								unhappy.click();
								waitInSeconds(Basetest.driver, 1);
							}
					   }
				   }
				   k++;
			   }
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	
	public void selectMultipleEmotions(String multiEmotion,String multiEmotion2)throws Exception{
		try {
			   int k=0;
			   while(k<2) {
				   //waitInSeconds(Basetest.driver, 4);
				   Wait.waitUntilElementPresent(emotionsDropdown);
				   if(multiEmotion!=null && multiEmotion2!=null) {
					   highlightElement(Basetest.driver, emotionsDropdown);
					   emotionsDropdown.click();
						   if(multiEmotion.equalsIgnoreCase("Unhappy") && multiEmotion2.equalsIgnoreCase("Happy")) {
							   if(neutral.isSelected()) {
								   highlightElement(Basetest.driver, neutral);
								   neutral.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
							   else if(!unhappy.isSelected()) {
								   highlightElement(Basetest.driver, unhappy);
								   unhappy.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
							   else if(!happy.isSelected()) {
								   highlightElement(Basetest.driver, happy);
								   happy.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
						   }
						   else if((multiEmotion.equalsIgnoreCase("Happy") && multiEmotion2.equalsIgnoreCase("Neutral"))) {
							   if(unhappy.isSelected()) {
								   highlightElement(Basetest.driver, unhappy);
								   unhappy.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
							   else if(!happy.isSelected()) {
								   	highlightElement(Basetest.driver, happy);
									happy.click();
									waitInSeconds(Basetest.driver, 1);
								}
							   else if(!neutral.isSelected()) {
									highlightElement(Basetest.driver, neutral);
								   neutral.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
						   }
						   else if(multiEmotion.equalsIgnoreCase("Unhappy") && multiEmotion2.equalsIgnoreCase("Neutral")) {
							   if(happy.isSelected()) {
								   highlightElement(Basetest.driver, happy);
								   happy.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
							   else if(!unhappy.isSelected()) {
								   highlightElement(Basetest.driver, unhappy);
								   unhappy.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
							   else if(!neutral.isSelected()) {
								   highlightElement(Basetest.driver, neutral);
								   neutral.click();
								   waitInSeconds(Basetest.driver, 1);
							   }
						   }
				   }
				   k++;
			   }
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	public void selectAllEmotions(String selAll)throws Exception{
		try {
				if(selAll!=null) {
					if(selAll.equalsIgnoreCase("yes")) {
						highlightElement(Basetest.driver, emotionsDropdown);
						 emotionsDropdown.click();
						if(!happy.isSelected()) {
							highlightElement(Basetest.driver, happy);
							happy.click();
							waitInSeconds(Basetest.driver, 1);
						}
						else if(!neutral.isSelected()) {
							highlightElement(Basetest.driver, neutral);
							neutral.click();
							waitInSeconds(Basetest.driver, 1);
						}
						else if(!unhappy.isSelected()) {
							highlightElement(Basetest.driver, unhappy);
							unhappy.click();
							waitInSeconds(Basetest.driver, 1);
						}
					  }
				}
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	public boolean isDisplayEmotions()throws Exception{
		boolean status = false;
		try{	
			if(!emotionList.isEmpty()) {
				for(WebElement ele:emotionList) {
					scrollToAnElement(ele);
					highlightElement(Basetest.driver, ele);
					org.junit.Assert.assertTrue(ele.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public void selectDateDropDown(String date)throws Exception{
		try {
			Wait.waitUntilElementPresent(dateRangeDropdown);
				highlightElement(Basetest.driver, dateRangeDropdown);
				dateRangeDropdown.click();
				waitInSeconds(Basetest.driver, 2);
				WebElement postOpt = Basetest.driver.findElement(By.xpath("//ul[@class='dropdown-menu inner']/li/a[contains(@title,'"+date+"')]"));
				postOpt.click();
				waitForInvisibility(Basetest.driver, synchLoad);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickSynchFeeds()throws Exception{
		try {
			highlightElement(Basetest.driver, networkDropdown);
			synchFeeds.click();
			waitForInvisibility(Basetest.driver, synchLoad);
			waitInSeconds(Basetest.driver, 8);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickRespondButtonForNetwork(String net)throws Exception{
		try {			
			if(net!=null) {
				List<WebElement> netLink = Basetest.driver.findElements(By.xpath("//a[contains(.,'"+net+"')]//ancestor::div[@id='MainContentdiv']//h5//following-sibling::div//a[@id='idEngage']"));
					Wait.scrollToAnElement(netLink.get(0));
					highlightElement(Basetest.driver, netLink.get(0));
					netLink.get(0).click();
					Wait.waitUntilElementPresent(respondPopup);
					//waitInSeconds(Basetest.driver, 2);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public boolean isDisplayRespondPopup()throws Exception{
		boolean status = false;
		try{	
					highlightElement(Basetest.driver, respondPopup);
					org.junit.Assert.assertTrue(respondPopup.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void clickCancelButton()throws Exception{
		try {
				highlightElement(Basetest.driver, cancelBtn);
				cancelBtn.click();
				//Wait.waitUntilElementPresent(respondPopup);
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void enterResponse(String text)throws Exception{
		try {
				highlightElement(Basetest.driver, respondTextare);
				respondTextare.sendKeys(text);
				waitInSeconds(Basetest.driver, 2);
				highlightElement(Basetest.driver, postBtn);
				postBtn.click();
				waitInSeconds(Basetest.driver, 2);	
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public boolean isDisplayPostedBox()throws Exception{
		boolean status = false;
		try{	
			Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Wait.waitUntilElementPresent(commentPostedBox);
					highlightElement(Basetest.driver, commentPostedBox);
					org.junit.Assert.assertTrue(commentPostedBox.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public boolean isDisplayViewComments()throws Exception{
		boolean status = false;
			try{	
					List<WebElement> view = Basetest.driver.findElements(By.xpath("//a[@data-i18n='common.view-comment']"));
						for(int i=1;i<=view.size();i++) {
							if(view.get(i).isDisplayed()) {
								Wait.scrollToAnElement(view.get(i));
								highlightElement(Basetest.driver, view.get(i));
								return true;
							}
							break;
						}
			}catch(Exception e){
				e.printStackTrace();
			}
		return status;
	}
	
	
	public void clickViewcomment()throws Exception{
		try {
				List<WebElement> view = Basetest.driver.findElements(By.xpath("//a[@data-i18n='common.view-comment']"));
				for(int i=1;i<=view.size();i++) {
					if(view.get(i).isDisplayed()) {
						Wait.scrollToAnElement(view.get(i));
						highlightElement(Basetest.driver, view.get(i));
						view.get(i).click();
					}
					break;
				}
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickHideComment()throws Exception{
		try {
				Wait.scrollToAnElement(hideComment);
				highlightElement(Basetest.driver, hideComment);
				hideComment.click();
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickShareButtonForNetwork(String net)throws Exception{
		try {
				if(net!=null) {
					List<WebElement> netLink = Basetest.driver.findElements(By.xpath("//a[contains(.,'"+net+"')]//ancestor::div[@id='MainContentdiv']//h5//following-sibling::div//span/a[contains(.,'Share')]"));	
						Wait.scrollToAnElement(netLink.get(0));
						highlightElement(Basetest.driver, netLink.get(0));
						netLink.get(0).click();
						waitInSeconds(Basetest.driver, 2);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public boolean isDisplaySharePopup()throws Exception{
		boolean status = false;
		try{	
				Wait.waitUntilElementPresent(sharePopup);
					highlightElement(Basetest.driver, sharePopup);
					org.junit.Assert.assertTrue(sharePopup.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void selectNetworkToPost(String network)throws Exception{
		try {
			Wait.waitUntilElementPresent(sharePopup);
				switch(network) {
					case "Facebook":
						shareFacebook.click();
						waitInSeconds(Basetest.driver, 1);
						ArrayList<String> newTbFB = new ArrayList<String>(Basetest.driver.getWindowHandles());
						Basetest.driver.switchTo().window(newTbFB.get(3));
						Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						MoproLoginPage mlp = new MoproLoginPage();
						mlp.enterFBUsername(PropertyFile.fbusername());
						mlp.enterFBPassword(PropertyFile.fbpassword());
						mlp.clickFBlogin_button();
						waitInSeconds(Basetest.driver, 2);
					case "Twitter":
						shareTwitter.click();
						waitInSeconds(Basetest.driver, 1);
						ArrayList<String> newTbTwt = new ArrayList<String>(Basetest.driver.getWindowHandles());
						Basetest.driver.switchTo().window(newTbTwt.get(3));
						Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					case "Tumblr":
						shareTumblr.click();
						waitInSeconds(Basetest.driver, 1);
						ArrayList<String> newTbTum = new ArrayList<String>(Basetest.driver.getWindowHandles());
						Basetest.driver.switchTo().window(newTbTum.get(3));
						Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					case "LinkedIn":
						shareLinkedIn.click();
						waitInSeconds(Basetest.driver, 1);
						ArrayList<String> newTbLnk = new ArrayList<String>(Basetest.driver.getWindowHandles());
						Basetest.driver.switchTo().window(newTbLnk.get(3));
						Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					default:
						break;
				}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public boolean isDisplayNetworkpage()throws Exception{
		boolean status = false;
		try{	
				if(facebookPage.isDisplayed()) {
					org.junit.Assert.assertTrue(facebookPage.isDisplayed());
					waitInSeconds(Basetest.driver, 1);
					return true;	
				}else if(twitterPage.isDisplayed()) {
					waitInSeconds(Basetest.driver, 1);
					return true;	
				}else if(tumblrPage.isDisplayed()) {
					waitInSeconds(Basetest.driver, 1);
					return true;
				}else if(linkedInPage.isDisplayed()) {
					waitInSeconds(Basetest.driver, 1);
					return true;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void clickPostButton()throws Exception{
		try {
			Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				if(facebookPage.isDisplayed()) {
					fbText.sendKeys("To be posted on FB");
					fbPostBtn.click();
					waitInSeconds(Basetest.driver, 1);
				}else if(twitterPage.isDisplayed()) {
					tweetPostBtn.click();
					waitInSeconds(Basetest.driver, 1);		
				}else if(tumblrPage.isDisplayed()) {
					tmblrText.sendKeys("Good Post for life");
					tmblrPostBtn.click();
					waitInSeconds(Basetest.driver, 1);
				}else if(linkedInPage.isDisplayed()) {
					lnkdInPostBtn.click();
					WebElement postText = Basetest.driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
					postText.sendKeys("To be posted on Linked In");
					lnkdInPostBtn2.click();
					waitInSeconds(Basetest.driver, 1);
				} 
				Basetest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void switchBackToParentTab()throws Exception{
		try {
				ArrayList<String> newTb = new ArrayList<String>(Basetest.driver.getWindowHandles());
				Basetest.driver.switchTo().window(newTb.get(2));
				sharePopupClose.click();
				waitInSeconds(Basetest.driver, 2);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public void clickConnectOtherAccountLink() {	
		try {
			Wait.waitUntilElementPresent(connectAccount);
				scrollToAnElement(connectAccount);
				connectAccount.click();  
				waitInSeconds(Basetest.driver, 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean  userConnectYourAccountsPage() {
		boolean status = false;
		try {
				Wait.waitUntilElementPresent(connectAccountsPageName);
				highlightElement(Basetest.driver, connectAccountsPageName);
				org.junit.Assert.assertTrue(connectAccountsPageName.isDisplayed());
				waitInSeconds(Basetest.driver, 1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void userMouseHoverandClickRemove(String Network) {
		try {
				scrollDown(Basetest.driver);
				Actions ac = new Actions(Basetest.driver);
				ac.moveToElement(Basetest.driver.findElement(By.xpath("//div[contains(@class,'connected text-center')] //span[@title='"+Network+"']"))).build().perform();
				highlightElement(Basetest.driver, removeAccBtn);
				removeAccBtn.click(); 
				waitInSeconds(Basetest.driver, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean userSeeRemoveAccountPopup() {
		boolean status = false;
		try {
				Wait.waitUntilElementPresent(popupName);
				highlightElement(Basetest.driver, popupName);
				org.junit.Assert.assertTrue(popupName.isDisplayed());
				waitInSeconds(Basetest.driver, 1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public void clickNoButton() {
		try {
				highlightElement(Basetest.driver, noBtn);
				noBtn.click();
				waitInSeconds(Basetest.driver, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickYesButton() {
		try {
				highlightElement(Basetest.driver, yesBtn);
				yesBtn.click();
				waitInSeconds(Basetest.driver, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public boolean userSeeConnectButton() {
		boolean status = false;
		try {
				Wait.waitUntilElementPresent(connectBtn);
				highlightElement(Basetest.driver, connectBtn);
				org.junit.Assert.assertTrue(connectBtn.isDisplayed());
				waitInSeconds(Basetest.driver, 1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
}

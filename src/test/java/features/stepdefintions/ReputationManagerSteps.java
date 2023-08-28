package features.stepdefintions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.Basetest;
import lib.PropertyFile;
import pages.DCCDashboard;
import pages.GetConnectedPage;
import pages.MoproLoginPage;
import pages.PartnerAdminPage;
import pages.ReputationManagerPage;
import pages.ResellerAdminPage;

public class ReputationManagerSteps {

	@Given("^The user login to mopro reseller application$")
	public void the_user_login_to_mopro_reseller_application() throws Throwable {
		Basetest.initDriver();
		Basetest.driver.get(PropertyFile.geturl());
	}

	@When("^The user gives the valid usernmae and password$")
	public void the_user_gives_the_valid_usernmae_and_password() throws Throwable {
		MoproLoginPage mlp = new MoproLoginPage();
		mlp.enterUsername(PropertyFile.getusername());
		mlp.enterPassword(PropertyFile.getpassword());
		mlp.clicklogin_button();
	}

	@Then("^The user must be in the partner Admin page$")
	public void the_user_must_be_in_the_partner_Admin_page() throws Throwable {
		PartnerAdminPage rap = new PartnerAdminPage();
		rap.isDisplayedPartnerAdminPage();
	}

	@Given("^The user is on the partner admin page$")
	public void the_user_is_on_the_partner_admin_page() throws Throwable {
		PartnerAdminPage pap = new PartnerAdminPage();
		pap.isDisplayedPartnerAdminPage();
	}
	
	@When("^The user click on the Mopro owner account link based on the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_click_on_the_Mopro_owner_account_link_based_on_the_and(String accNam, String mail) throws Throwable {
		PartnerAdminPage pap = new PartnerAdminPage();
		pap.clickAccountOwner(accNam, mail);
		Thread.sleep(4000);
	}

	@Then("^The user must be in the Reseller Admin page$")
	public void the_user_must_be_in_the_Reseller_Admin_page() throws Throwable {
		ResellerAdminPage rap = new ResellerAdminPage();
		rap.isDisplayResellerAdminPage();
	}
	
	@When("^The user click on the Globe icon based on the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_click_on_the_Globe_icon_based_on_the_and(String accNam, String mail) throws Throwable {
		ResellerAdminPage rap = new ResellerAdminPage();
		rap.clickAccountName(accNam, mail);
	}

	@Then("^The user must be in the DCC Dashboard$")
	public void the_user_must_be_in_the_DCC_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.isDisplayDCCDashboardPage();
	}

	@When("^The user click on the Reputation Manager tile from the Dashboard$")
	public void the_user_click_on_the_Reputation_Manager_tile_from_the_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.clickRMtile();
	}

	@Then("^The user must be on the Reputation Manager page$")
	public void the_must_be_on_the_Reputation_Manager_page() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayReputationManagerPage();
	}
	
	@When("^The user click on the Get Connected tile from the Dashboard$")
	public void the_user_click_on_the_Get_Connected_tile_from_the_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.clickGCtile();
	}

	@Then("^The user must be on the Get Connected page$")
	public void the_user_must_be_on_the_Get_Connected_page() throws Throwable {
		GetConnectedPage gcp = new GetConnectedPage();
		gcp.isDisplayGetConnectedPage();
	}

	@Given("^The user is on the Reputation Manager page$")
	public void the_user_is_on_the_Reputation_Manager_page() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayReputationManagerPage();
	}

	@When("^The user select the Network Selected drop down$")
	public void the_user_select_the_Network_Selected_drop_down() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickNetworkDropDown();
	}

	@When("^The user click on the select All \"([^\"]*)\" option to check active networks are selected$")
	public void the_user_click_on_the_select_All_option_to_check_active_networks_are_selected(String flag) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickSelectAllIntheNetworkDrop(flag);
	}

	@When("^The user select Network based on the \"([^\"]*)\" Search option$")
	public void the_user_select_Network_based_on_the_Search_option(String networks) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		//rmp.searchMultipleNetworks(networks);
	}
	
	@When("^The user selects the network randomly \"([^\"]*)\" from the Network Dropdown$")
	public void the_user_selects_the_network_randomly_from_the_Network_Dropdown(String networks) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.networkRandonSelection(networks);
	}

	@Then("^The user should be able to see the selected network feeds in the list$")
	public void the_user_should_be_able_to_see_the_selected_network_feeds_in_the_list() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayListOFFeeds();
	}

	@When("^The user select the Post \"([^\"]*)\" filter$")
	public void the_user_select_the_Post_filter(String post) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectPostDropDown(post);
	}

	@Then("^The user should be able to see the post based on filter$")
	public void the_user_should_be_able_to_see_the_post_based_on_filter() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayFeeds();
	}

	@When("^The user select any one emotion \"([^\"]*)\"$")
	public void the_user_select_any_one_emotion(String emotion) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectEmotions(emotion);
	}

	@When("^The user select multiple emotions \"([^\"]*)\" and another emotion \"([^\"]*)\"$")
	public void the_user_select_multiple_emotions_and_another_emotion(String multiEmotion,String multiEmotion2) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectMultipleEmotions(multiEmotion, multiEmotion2);
	}

	@When("^The user select all emotions \"([^\"]*)\"$")
	public void the_user_select_all_emotions(String selAll) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectAllEmotions(selAll);
	}

	@Then("^The user should be able to see feeds based on the emotions selected$")
	public void the_user_should_be_able_to_see_feeds_based_on_the_emotions_selected() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayEmotions();
	}

	@When("^The user select the \"([^\"]*)\" based on the need$")
	public void the_user_select_the_based_on_the_need(String date) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectDateDropDown(date);
	}

	@Then("^user should be able to see the feeds based on the date filters$")
	public void user_should_be_able_to_see_the_feeds_based_on_the_date_filters() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayFeeds();
	}

	@When("^The user click on the synch feeds$")
	public void the_user_click_on_the_synch_feeds() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickSynchFeeds();
	}

	@Then("^The user should be able to see the feeds based on the filters given$")
	public void the_user_should_be_able_to_see_the_feeds_based_on_the_filters_given() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayFeeds();
	}

	@When("^The user select the feed based on the Network \"([^\"]*)\" name and click on the respond button$")
	public void the_user_select_the_feed_based_on_the_Network_name(String net) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickRespondButtonForNetwork(net);
	}

	@Then("^The user should be able to see the respond popup$")
	public void the_user_should_be_able_to_see_the_respond_popup() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayRespondPopup();
	}

	@When("^The user click on the cancel button to cancel the pop up$")
	public void the_user_click_on_the_cancel_button_to_cancel_the_pop_up() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickCancelButton();
	}

	@When("^The user enter the text \"([^\"]*)\" in the Text area and click on the post button$")
	public void the_user_enter_the_text_in_the_Text_area_and_click_on_the_post_button(String text) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.enterResponse(text);
	}

	@Then("^The user should be able to see the comment box above respond button$")
	public void the_user_should_be_able_to_see_the_comment_box_above_respond_button() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayPostedBox();
	}

	@Then("^The user should be able to see the View Comment link$")
	public void the_user_should_be_able_to_see_the_View_Comment_link() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayViewComments();
	}

	@When("^The user click on the View Comment link$")
	public void the_user_click_on_the_View_Comment_link() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickViewcomment();
	}

	@When("^The user click on the Hide comment the comment box should be closed$")
	public void the_user_click_on_the_Hide_comment_the_comment_box_should_be_closed() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickHideComment();
	}

	@When("^The user click on the share button based on the selected network \"([^\"]*)\"$")
	public void the_user_click_on_the_share_button_based_on_the_selected_network(String net) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickShareButtonForNetwork(net);
	}

	@Then("^The user able to see the share pop up$")
	public void the_user_able_to_see_the_share_pop_up() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplaySharePopup();
	}

	@When("^The user select the network \"([^\"]*)\" to be shared$")
	public void the_user_select_the_network_to_be_shared(String network) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.selectNetworkToPost(network);
	}

	@Then("^The user must be on the shared network page$")
	public void the_user_must_be_on_the_shared_network_page() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.isDisplayNetworkpage();
	}

	@When("^The user click on the Post button$")
	public void the_user_click_on_the_Post_button() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickPostButton();
	}

	@Then("^The shared network page should be closed and user is on the Reputation Manager page$")
	public void the_shared_network_page_should_be_closed_and_user_is_on_the_Reputation_Manager_page() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.switchBackToParentTab();
	}

	@When("^The user click on the connect other accounts link$")
	public void the_user_click_on_the_connect_other_accounts_link() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickConnectOtherAccountLink();
	}

	@Then("^The user is on the Connect your accounts page$")
	public void the_user_is_on_the_Connect_your_accounts_page() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.userConnectYourAccountsPage();
	}

	@When("^The user mouse hover any \"([^\"]*)\" and click on the remove account button$")
	public void the_user_mouse_hover_any_and_click_on_the_remove_account_button(String network) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.userMouseHoverandClickRemove(network);
	}

	@Then("^The user able to see the remove account pop up$")
	public void the_user_able_to_see_the_remove_account_pop_up() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.userSeeRemoveAccountPopup();
	}

	@When("^The user click on the NO button the pop up closes$")
	public void the_user_click_on_the_NO_button_the_pop_up_closes() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickNoButton();
	}

	@When("^The user click on the YES button the pop up closes$")
	public void the_user_click_on_the_YES_button_the_pop_up_closes() throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.clickYesButton();
	}

	@Then("^The user able to see the Connect button instead of Remove account on the tile selected \"([^\"]*)\"$")
	public void the_user_able_to_see_the_Connect_button_instead_of_Remove_account_on_the_tile_selected(String arg1) throws Throwable {
		ReputationManagerPage rmp = new ReputationManagerPage();
		rmp.userSeeConnectButton();
	}


	
	
}
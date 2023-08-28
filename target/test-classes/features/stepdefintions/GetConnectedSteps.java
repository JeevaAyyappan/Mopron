package features.stepdefintions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.json.simple.*;
import org.junit.Assert;

import api.GetConnectedPayload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.Basetest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.FileUtils;
import lib.PropertyFile;
import lib.Utility;
import pages.CompetitionTrackerPage;
import pages.GetConnectedPage;
import pages.MoproLoginPage;
import pages.NetworkAPI;

public class GetConnectedSteps extends GetConnectedPayload{
	
	
	public static String baseURL= PropertyFile.baseurlc();
	private String baseURLpost = PropertyFile.baseurlpost();
	private String baseURLpostInd = PropertyFile.baseurlpostInd();
	private String authorization = "";
	private Response resp;
	
	@Given("^The user login to mopro customer application$")
	public void the_user_login_to_mopro_customer_application() throws Throwable {
		Basetest.initDriver();
		Basetest.driver.get(PropertyFile.getCusturl());
	}

	@When("^The user gives the valid usernmae and password for customer application$")
	public void the_user_gives_the_valid_usernmae_and_password_for_customer_application() throws Throwable {
		MoproLoginPage mlp = new MoproLoginPage();
		mlp.enterCustUsername(PropertyFile.getCustusername());
		mlp.enterCustPassword(PropertyFile.getCustpassword());
		mlp.clickCustlogin_button();
		CompetitionTrackerPage.accessCookies();

	}

	@When("^The user click on the select button from the projects$")
	public void the_user_click_on_the_select_button_from_the_projects() throws Throwable {
		NetworkAPI napi = new NetworkAPI();
		napi.clickSelectButton();
	}

	@When("^The user click in the network \"([^\"]*)\" connect button and enter the \"([^\"]*)\" url$")
	public void the_user_click_in_the_network_connect_button_and_enter_the_url(String net, String netUrl) throws Throwable {
		NetworkAPI napi = new NetworkAPI();
		napi.clickYelpConnect(net, netUrl);
	}

	@Then("^The user should be able to see the icon checked on the Network \"([^\"]*)\" tile$")
	public void the_user_should_be_able_to_see_the_icon_checked_on_the_Network_tile(String title) throws Throwable {
		NetworkAPI napi = new NetworkAPI();
		napi.isDisplayIconChecked(title);
	}

	
	@Given("^The user have the API baseURL$")
	public void the_user_have_the_API_baseURL() throws Throwable {
		baseURL= PropertyFile.baseurlc();
	}

	@Given("^The user have Authorization header with Token$")
	public void the_user_have_Authorization_header_with_Token() throws Throwable {
		authorization = GetConnectedPage.Authtoken;
	}

	@When("^The user send the GET request$")
	public void the_user_send_the_GET_request() throws Throwable {
		try{
		{
			resp = RestAssured
			.given()
			.log()
			.all()
			.header("Content-Type", "application/json")
			.header("Authorization",authorization)
			.get(baseURL)
			.then()
			.log()
			.all()
			.extract()
			.response();		
			String jsonFomratFile = resp.getBody().asPrettyString();
			String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\getConnected.json";
			FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^The response status code should be (\\d+)$")
	public void the_response_status_code_should_be(int statuscode) throws Throwable {
		assertEquals(statuscode, resp.getStatusCode());
	}

	@Then("^The response should contain the following \"([^\"]*)\" JSON element$")
	public void the_response_should_contain_the_following_JSON_element(String netid) throws Throwable {
		String actJson = resp.getBody().asString();
		JsonPath jp = new JsonPath(actJson);
		String net = jp.get("data");
		JsonPath jp2 = new JsonPath(net);
		List<String> nesval =  jp2.getList("rows.ProfileURL");
		JSONArray ja =  new JSONArray();
		for(String netval:nesval) {
			JSONArray.toJSONString(nesval);
			System.out.println(netval);
		}
		
		Assert.assertNotNull(nesval);
		Assert.assertTrue(nesval.size()>0);
		//Assert.assertEquals(netid,jp2.getInt("rows.NetworkID)"));

	}
	
	@Given("^The user have the API baseURL for the Post call$")
	public void the_user_have_the_API_baseURL_for_the_Post_call() throws Throwable {
		baseURLpost = PropertyFile.baseurlpost();
		System.out.println(baseURLpost);
	}

	@When("^The user send the POST request$")
	public void the_user_send_the_POST_request() throws Throwable {
		try {
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(dashboardPost())
				.post(baseURLpost)
				.then()
				.log()
				.all()
				.extract()
				.response();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\dashboardPost.json";
				FileUtils.writeToFile(jsonFilePath, resp.prettyPrint());
			}		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Given("^The user have the API baseURL for User permission Post call$")
	public void the_user_have_the_API_baseURL_for_User_permission_Post_call() throws Throwable {
		baseURLpost = PropertyFile.baseurlpost();
	}

	@When("^The user send the POST request with user permission payload$")
	public void the_user_send_the_POST_request_with_user_permission_payload() throws Throwable {
		try {
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(userPermissionPost())
				.post(baseURLpost)
				.then()
				.log()
				.all()
				.extract()
				.response();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\userPermission.json";
				FileUtils.writeToFile(jsonFilePath, resp.prettyPrint());
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^The response status code for post call should be \"([^\"]*)\"$")
	public void the_response_status_code_for_post_call_should_be(int statuscode) throws Throwable {
		assertEquals(statuscode, resp.getStatusCode());
	}


	@Given("^The user have the API baseURL for Contentdelivery Post call$")
	public void the_user_have_the_API_baseURL_for_Contentdelivery_Post_call() throws Throwable {
		baseURLpostInd = PropertyFile.baseurlpostInd();
	}

	@When("^The user send the POST request with Industry type payload$")
	public void the_user_send_the_POST_request_with_Industry_type_payload() throws Throwable {
		try {
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(industryPost())
				.post(baseURLpostInd)
				.then()
				.log()
				.all()
				.extract()
				.response();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\industryTypes.json";
				FileUtils.writeToFile(jsonFilePath, resp.prettyPrint());
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package features.stepdefintions;

import static org.junit.Assert.assertEquals;

import api.GetFiveStarReviewPayload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lib.FileUtils;
import lib.SendReportMail;
import lib.Utility;
import pages.DCCDashboard;
import pages.GetFiveStarReviewPage;

public class Get5StarReviewsAPISteps extends GetFiveStarReviewPayload{

	
	private String baseurl = "";
	private String analticsBaseUrl = "";
	private String radarBaseUrl = "";
	private String authorization = "";
	private Response resp;
	
	@When("^The user click on the Get five Star reviews tile from the Dashboard$")
	public void the_user_click_on_the_Get_five_Star_reviews_tile_from_the_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.click5StarReviewtile();
	}

	@Then("^The user must be on the Get five Star reviews page$")
	public void the_user_must_be_on_the_Get_five_Star_reviews_page() throws Throwable {
		GetFiveStarReviewPage srp = new GetFiveStarReviewPage();
		srp.isDisplayFiveStarReviewPage();
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Social user details$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Social_user_details(String baseurl) throws Throwable {
		this.baseurl= baseurl;
		System.out.println(baseurl);
	}

	@Given("^The user have Authorization header with Token for Get five star reviews$")
	public void the_user_have_Authorization_header_with_Token_for_Get_five_star_reviews() throws Throwable {
		authorization = GetFiveStarReviewPage.Authtoken;
	}
	
	@When("^The user send the GET request for Social user details$")
	public void the_user_send_the_GET_request_for_Social_user_details() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseurl)
				.then()
				.log()
				.all()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\Get5StarReviews\\SocialUser.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Then("^The response status code should be \"([^\"]*)\"$")
	public void the_response_status_code_should_be(int statuscode) throws Throwable {
		assertEquals(statuscode, resp.getStatusCode());
		//SendReportMail.sendMail();
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to identify Analytics Data$")
	public void the_user_have_Base_URL_for_the_POST_call_to_identify_Analytics_Data(String analticsBaseUrl) throws Throwable {
		this.analticsBaseUrl = analticsBaseUrl;
	}

	@When("^The user send the POST request for Analytics Data$")
	public void the_user_send_the_POST_request_for_Analytics_Data() throws Throwable {
		try {
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(analytics())
				.post(analticsBaseUrl)
				.then()
				.log()
				.all()
				.extract()
				.response();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\Get5StarReviews\\Analytics.json";
				FileUtils.writeToFile(jsonFilePath, resp.prettyPrint());
			}					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to identify Radar Feeds$")
	public void the_user_have_Base_URL_for_the_POST_call_to_identify_Radar_Feeds(String radarBaseUrl) throws Throwable {
		this.radarBaseUrl=radarBaseUrl;
	}

	@When("^The user send the POST request for Radar Feeds$")
	public void the_user_send_the_POST_request_for_Radar_Feeds() throws Throwable {
		try {
			{
				resp = RestAssured
				.given()
				.log()
				.all()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(radarFeed())
				.post(radarBaseUrl)
				.then()
				.log()
				.all()
				.extract()
				.response();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\Get5StarReviews\\RadarFeed.json";
				FileUtils.writeToFile(jsonFilePath, resp.prettyPrint());
			}		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	
}

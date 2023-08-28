package features.stepdefintions;

import static org.junit.Assert.assertEquals;

import api.LocalSEOListingsPayload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lib.FileUtils;
import lib.Utility;
import pages.DCCDashboard;
import pages.LocalSEOListingsPage;

public class LocalSEOListingsSteps extends LocalSEOListingsPayload{

	
	private String baseurlProComp = "";
	private String baseUrlUbloc = "";
	private String baseUrlListHealt = "";
	private String baseUrlUbLocMD = "";
	private String baseUrlListHealtMD = "";
	private String baseUrlInSigMD1 = "";
	private String baseUrlInSigMD2 = "";
	private String baseUrlBasInfo = "";
	private String baseUrlAbtYurBus = "";
	private String baseUrlMed = "";
	private String authorization = "";
	private Response resp;
	
	
	@When("^The user click on the Local SEO listings tile from the Dashboard$")
	public void the_user_click_on_the_Local_SEO_listings_tile_from_the_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.clickLocalSeoListingstile();
	}

	@Then("^The user must be on the Local SEO listings page$")
	public void the_user_must_be_on_the_Local_SEO_listings_page() throws Throwable {
		LocalSEOListingsPage seo = new LocalSEOListingsPage();
		seo.isDisplayLocalSeoListingsPage();
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Profile Completeness$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Profile_Completeness(String baseurlProComp) throws Throwable {
	   this.baseurlProComp = baseurlProComp;
	}

	@Given("^The user have Authorization header with Token for Local SEO Listings$")
	public void the_user_have_Authorization_header_with_Token_for_Profile_completeness() throws Throwable {
		authorization = LocalSEOListingsPage.Authtoken;
	}

	@When("^The user send the GET request for Profile completeness$")
	public void the_user_send_the_GET_request_for_Profile_completeness() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseurlProComp)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\ProfileCompleteML.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Then("^The response status code should be \"([^\"]*)\" for Local SEO listings$")
	public void the_response_status_code_should_be_for_Local_SEO_listings(int statuscode) throws Throwable {
		assertEquals(statuscode, resp.getStatusCode());
	}


	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Uberalllocation$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Uberalllocation(String baseUrlUbloc) throws Throwable {
	   this.baseUrlUbloc = baseUrlUbloc;
	}

	@When("^The user send the GET request for Uberalllocation$")
	public void the_user_send_the_GET_request_for_Uberalllocation() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlUbloc)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\UberAllLocationML.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Listing Health$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Listing_Health(String baseUrlListHealt) throws Throwable {
	  this.baseUrlListHealt = baseUrlListHealt;
	}

	@When("^The user send the GET request for Listing Health$")
	public void the_user_send_the_GET_request_for_Listing_Health() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlListHealt)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\ListHealthML.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Uberall Locations in My Dashboard$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Uberall_Locations_in_My_Dashboard(String baseUrlUbLocMD) throws Throwable {
	   this.baseUrlUbLocMD = baseUrlUbLocMD;
	}

	@When("^The user send the GET request for Uberall Locations in My Dashboard$")
	public void the_user_send_the_GET_request_for_Uberall_Locations_in_My_Dashboard() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlUbLocMD)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\UberAllLocationMD.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Listing Health in My Dashboard$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Listing_Health_in_My_Dashboard(String baseUrlListHealtMD) throws Throwable {
	   this.baseUrlListHealtMD = baseUrlListHealtMD;
	}

	@When("^The user send the GET request for Listing Health in My Dashboard$")
	public void the_user_send_the_GET_request_for_Listing_Health_in_My_Dashboard() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlListHealtMD)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\ListHealthMD.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Insight data one$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Insight_data_one(String baseUrlInSigMD1) throws Throwable {
		this.baseUrlInSigMD1 = baseUrlInSigMD1;
	}

	@When("^The user send the POST request to get Insight data one$")
	public void the_user_send_the_POST_request_to_get_Insight_data_one() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(inSightDataMD1())
				.post(baseUrlInSigMD1)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\InsightDataMD1.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Insight data two$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Insight_data_two(String baseUrlInSigMD2) throws Throwable {
	    this.baseUrlInSigMD2 = baseUrlInSigMD2;
	}

	@When("^The user send the POST request to get Insight data two$")
	public void the_user_send_the_POST_request_to_get_Insight_data_two() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(inSightDataMD2())
				.post(baseUrlInSigMD2)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\InsightDataMD2.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	
	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Basic Info in Business Profile$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Basic_Info_in_Business_Profile(String baseUrlBasInfo) throws Throwable {
		this.baseUrlBasInfo = baseUrlBasInfo;
	}

	@When("^The user send the GET request for Basic Info in Business Profile$")
	public void the_user_send_the_GET_request_for_Basic_Info_in_Business_Profile() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlBasInfo)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\BasicInfo.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify About your Business in Business Profile$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_About_your_Business_in_Business_Profile(String baseUrlAbtYurBus) throws Throwable {
		this.baseUrlAbtYurBus = baseUrlAbtYurBus;
	}

	@When("^The user send the GET request for About your Business in Business Profile$")
	public void the_user_send_the_GET_request_for_About_your_Business_in_Business_Profile() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlAbtYurBus)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\AboutYourBusiness.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the Get call to identify Media in Business Profile$")
	public void the_user_have_Base_URL_for_the_Get_call_to_identify_Media_in_Business_Profile(String baseUrlMed) throws Throwable {
		this.baseUrlMed = baseUrlMed;
	}

	@When("^The user send the GET request for Media in Business Profile$")
	public void the_user_send_the_GET_request_for_Media_in_Business_Profile() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(baseUrlMed)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\LocalSEOListings\\Media.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}


	
	
}

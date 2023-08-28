package features.stepdefintions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import api.CompetitionTrackerPayload;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.FileUtils;
import lib.Utility;
import pages.CompetitionTrackerPage;
import pages.DCCDashboard;

public class CompetitionTrackerSteps extends CompetitionTrackerPayload{
	
public ExtentTest test;
	private String baseUrlBusComp = "";
	private String baseUrlradFeed = "";
	private String baseUrlBusCompData1 = "";
	private String baseUrlBusCompData2 = "";
	private String authorization = "";
	private Response resp;
	@When("^The user click on the Competition Tracker tile from the Dashboard$")
	public void the_user_click_on_the_Competition_Tracker_tile_from_the_Dashboard() throws Throwable {
		DCCDashboard dcc = new DCCDashboard();
		dcc.clickCompetitionTrackertile();
	}

	@Then("^The user must be on the Competition Tracker page$")
	public void the_user_must_be_on_the_Competition_Tracker_page() throws Throwable {
		CompetitionTrackerPage cmt = new CompetitionTrackerPage();
		cmt.isDisplayCompTrackerPage();
	}

	@Given("^The user have Authorization header with Token for Competition Tracker$")
	public void the_user_have_Authorization_header_with_Token_for_Competition_Tracker() throws Throwable {
		authorization = CompetitionTrackerPage.Authtoken;
	}

	@When("^The user send the GET request for Competition Tracker$")
	public void the_user_send_the_GET_request_for_Competition_Tracker() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.get(GetConnectedSteps.baseURL)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\SocialUsersCT.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Business Competitors$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors(String baseUrlBusComp) throws Throwable {
	    this.baseUrlBusComp = baseUrlBusComp;
	}

	@When("^The user send the POST request to get Business Competitors$")
	public void the_user_send_the_POST_request_to_get_Business_Competitors() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(businessCompetitor())
				.post(baseUrlBusComp)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\BusinessCompetitors.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Then("^The response status code should be \"([^\"]*)\" for Competition Tracker$")
	public void the_response_status_code_should_be_for_Competition_Tracker(int statuscode) throws Throwable {
		assertEquals(statuscode, resp.getStatusCode());
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Radar Feeds$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Radar_Feeds(String baseUrlradFeed) throws Throwable {
	    this.baseUrlradFeed = baseUrlradFeed;
	}

	@When("^The user send the POST request to get Radar Feeds$")
	public void the_user_send_the_POST_request_to_get_Radar_Feeds() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(radarFeeds())
				.post(baseUrlradFeed)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\RadarFeeds.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Business Competitors social data one$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors_social_data_one(String baseUrlBusCompData1) throws Throwable {
	    this.baseUrlBusCompData1 = baseUrlBusCompData1;

	}

	@When("^The user send the POST request to get Business Competitors social data one$")
	public void the_user_send_the_POST_request_to_get_Business_Competitors_social_data_one() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(businessCompetitorSocialData1())
				.post(baseUrlBusCompData1)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\BusinessCompetitorsSocialData1.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
				
				
				 JsonPath jp = new JsonPath(jsonFomratFile);			
			    List<String> net = jp.getList("rows.LikePercent");
				System.out.println(net);
		        String status = jp.getString("[0].Status");
		        String message = jp.getString("[0].Message");
		        assert "OK".equals(status);
		        assert "Good Job.".equals(message);
		        System.out.println("Assertions passed successfully.");
		        
		        
		        
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Then("^The response status code should show the Like percent for Social Data one in the competition tracker$")
	public void the_response_status_code_should_show_the_Like_percent_for_Social_Data_one_in_the_competition_tracker() throws Throwable {
	   
				 resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(businessCompetitorSocialData1())
				.post(baseUrlBusCompData1)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\BusinessCompetitorsSocialData1.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
				
				
				JsonPath sd = new JsonPath(jsonFomratFile);
				List<String> net = sd.getList("rows.LikePercent");
				System.out.println(net);
				List<String> outputValues = new ArrayList<>(); 
                String outputValue = "Some value to capture";
			    outpu9tValues.add(outputValue);
			    
		        
	}
	
	
	
	//////////////////

	@Given("^The user have Base URL \"([^\"]*)\" for the POST call to get Business Competitors social data two$")
	public void the_user_have_Base_URL_for_the_POST_call_to_get_Business_Competitors_social_data_two(String baseUrlBusCompData2) throws Throwable {
	   this.baseUrlBusCompData2 = baseUrlBusCompData2;
	}

	@When("^The user send the POST request to get Business Competitors social data two$")
	public void the_user_send_the_POST_request_to_get_Business_Competitors_social_data_two() throws Throwable {
		try{
			{
				resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(businessCompetitorSocialData2())
				.post(baseUrlBusCompData2)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\BusinessCompetitorsSocialData2.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
							
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Then("^The response status code should show the Like percent for Socail Data two in the competition tracker$")
	public void the_response_status_code_should_show_the_Like_percent_for_Socail_Data_two_in_the_competition_tracker() throws Throwable {
		
		
		
	   
		         resp = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.header("Authorization",authorization)
				.body(businessCompetitorSocialData2())
				.post(baseUrlBusCompData2)
				.then()
				.extract()
				.response();		
				String jsonFomratFile = resp.getBody().asPrettyString();
				String jsonFilePath = Utility.workdirectory()+"\\src\\test\\java\\api\\json\\CompetitionTracker\\BusinessCompetitorsSocialData2.json";
				FileUtils.writeToFile(jsonFilePath,jsonFomratFile);
				JsonPath ds = new JsonPath(jsonFomratFile);
				List<String> net = ds.getList("rows.LikePercent");
				System.out.println(net);
				
			
				
				

					/*// Extract the JSON response
					String jsonResponse = resp.getBody().asPrettyString();

					// Set up Extent Reports
					ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter("extent-report.html");
					ExtentReports extent1 = new ExtentReports();
					extent1.attachReporter(htmlReporter1);

					// Create a test
					ExtentTest test1 = extent1.createTest("MyTest", "Description of the test");

					// Log initial information
					String net11 = "Some value";
					test1.log(Status.INFO, "Initial Value: " + net11);

					// Log API Response
					test1.log(Status.INFO, "API Response: " + jsonResponse);

					// Extract data using JsonPath
					JsonPath ds1 = new JsonPath(jsonResponse);
					List<String> net111 = ds1.getList("rows.LikePercent");

					// Log individual data from the API response
					for (String value : net111) {
					    test1.log(Status.INFO, "Value from API: " + value);
					}

					// Log success status
					test1.log(Status.PASS, "Successfully");

					// Flush the Extent Report
					extent1.flush();
					
				
				
//				ExtentReports extent = new ExtentReports();
//				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Mopro\\eclipse-workspace\\Mopro\\target\\Reports.html");
//				extent.attachReporter(htmlReporter);
//				ExtentTest test = extent.createTest("Test Name", "Test Description");
//				test.log(Status.INFO, " " + net);
//				test.log(Status.PASS, "Successfully");
				
				
//				File reportOutputDirectory = new File("target");
//		        List<String> jsonFiles = new ArrayList<>();
//		        jsonFiles.add("path/to/your/cucumber-json-report.json"); // Update with your actual JSON report file
//
//		        Configuration configuration = new Configuration(reportOutputDirectory, "your-project-name");
//		        configuration.setBuildNumber("1.0");
//
//		        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
//		        reportBuilder.generateReports();
//		
				
//				ExtentTest test = null;
//				test.log(Status.INFO, " " + net1);
//				test.log(Status.PASS, "Successfully");
//				*/
			   }
	
	

}

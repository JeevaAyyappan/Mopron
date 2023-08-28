package features;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;

//import com.aventstack.extentreports.reporter.ExtentReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import lib.SendReportMail;


@RunWith(Cucumber.class) 
@CucumberOptions(
		features="./src/test/java/features/featurefile",
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:","pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				 "html:target/cucumber-html-report.html",
				 "json:target/cucumber-report.json"},
		monochrome =true,dryRun=false,
		tags = {"@ct"}
		)


public class Runner{
	@BeforeClass
	public static void setup(){
		ExtentReports extentReports = new ExtentReports();
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		extentProperties.setReportPath("target/Reports/MoProAutomationExecutionReport"+timeStamp+".html");
		extentProperties.setProjectName("MoPro Automation Report");
	}
	
	
	@AfterClass
	public static void killDriver() {
		SendReportMail.sendMail();
		Basetest.testMethodTearDown();
	}
	
}

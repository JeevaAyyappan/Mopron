package lib;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


//import jxl.Sheet;


public class Constants {

	//public static Sheet object_repository_sheet;
	//public static Sheet function_sheet;
	//public static Sheet testcase_sheet;
	//public static Sheet credential_sheet;
	public static WebDriver driver;
	public static List<String> windows = new ArrayList<String>();
	public static int windowCount;
	public static List<String> dataSheet = new ArrayList<String>();
	public static String testCaseId, testCaseName, functionName, stepNo, stepDesc, screenshotName, stepDetails;
	public static boolean testStepNotExecuted;
	public static String exceptionMsg;
	public static int testCaseCount, stepCount, testCasePassed, testCaseFailed;
	public static String functionStatus;
	public static String funcStartTime, funcEndTime;
	public static String testStartTime, testEndTime, browserName, browserVersion;
	public static File log;
	public static String folderName;
	public static FileWriter w;
	

	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	public static ExtentTest childTest1;
	public static ExtentTest test;
	public static String function_name;
	public static String step_desc;

	
	public static List<String[]> steps;
}

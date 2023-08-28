package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertyFile {
	public static String url = System.getProperty("url");
	public static String custurl = System.getProperty("custurl");
	public static String browser = System.getProperty("browser");
	public static String reporting = System.getProperty("reporting");
	public static String preview = System.getProperty("preview");
	public static Properties loadproperty(){

		File file = null;
		if(Utility.getOS().contains("win")) {
	     file = new File(Utility.workdirectory().concat("\\src\\test\\java\\resources\\config.properties"));
		}
		else {
			 file = new File(Utility.workdirectory().concat("/src/test/java/resources/config.properties"));
		}
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String geturl(){
		if (StringUtils.isNotEmpty(url)) {
			return url;}
		else{
		return loadproperty().getProperty("url");
		}
	}
	
	public static String getCusturl(){
		if (StringUtils.isNotEmpty(custurl)) {
			return custurl;}
		else{
		return loadproperty().getProperty("custurl");
		}
	}
	
	public static String getbrowser(){
		if (StringUtils.isNotEmpty(browser)) {
			return browser;}
		else{
		return loadproperty().getProperty("browser");
		}
	}
	
	public static String getCustusername(){
		return loadproperty().getProperty("custusername");
	}

	public static String getCustpassword(){
		return loadproperty().getProperty("custpassword");
	}
	
	public static String getusername(){
		return loadproperty().getProperty("username");
	}

	public static String getpassword(){
		return loadproperty().getProperty("password");
	}

	public static String fbusername(){
		return loadproperty().getProperty("fbusername");
	}

	public static String fbpassword(){
		return loadproperty().getProperty("fbpassword");
	}
	
	public static String baseurl(){
		return loadproperty().getProperty("baseURL");
	}
	
	public static String baseurlc(){
		return loadproperty().getProperty("baseURLc");
	}
	
	public static String baseurlpost(){
		return loadproperty().getProperty("baseURLPost");
	}
	
	public static String baseurlpostInd(){
		return loadproperty().getProperty("baseURLPostIndustry");
	}
	
	public static String header(){
		return loadproperty().getProperty("header");
	}
}

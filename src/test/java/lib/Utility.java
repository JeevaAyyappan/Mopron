package lib;

import java.io.IOException;
import java.util.Random;

public class Utility {
	
	public static String workdirectory(){
		String current = null;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return current;
	}
	
	
	public static int getRandomnumber(int size){
		Random rand = new Random();
		int  n = rand.nextInt(size-2)+1;
		return n;
	}
	
	public static String getOS() {
		return System.getProperty("os.name").toLowerCase();
	}
	public static String getResourcePath(){
		return workdirectory()+"\\src\\test\\java\\resources\\";
	}

}

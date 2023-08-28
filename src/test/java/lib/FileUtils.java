package lib;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

	
	public static void writeToFile(String filePath, String content) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}

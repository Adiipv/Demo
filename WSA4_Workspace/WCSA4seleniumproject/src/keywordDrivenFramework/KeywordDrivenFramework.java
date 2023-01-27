package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class KeywordDrivenFramework {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop = new Properties();
		prop.load(fis); //// to read the data

		String data = prop.getProperty("Brower");
		String data1 = prop.getProperty("Username");
		String data2 = prop.getProperty("Url");
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
	}
}

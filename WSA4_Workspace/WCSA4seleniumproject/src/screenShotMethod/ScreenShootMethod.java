package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShootMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		
		File src =driver.getScreenshotAs(OutputType.FILE);
		File destination = new  File("./screenshot/Screenshoot1.jpg");
		Files.copy(src, destination);

	}

}

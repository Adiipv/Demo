package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {

  protected	static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		Flib flib = new Flib();

		String browserValue = flib.readPropertyData(PROPERTIES_PATH, "Browser");
		String url = flib.readPropertyData(PROPERTIES_PATH, "Url");

		if (browserValue.equals("chrome"))

		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		} else if (browserValue.equals("firefore")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		} else if (browserValue.equals("edge")) {
			System.setProperty(EDGE_KEY, EDGE_VALUE);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);

		} else {
			Reporter.log("Enter Valid Browser!! ", true);
		}

	}
      
	public void failed(String methodName) {
		try {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dist = new File("./screenshot/" + methodName + ".png");
			Files.copy(src, dist);
		} catch (Exception c) {

		}

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}

}

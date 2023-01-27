package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * This class contains reusable method to perform all web driver actions
 * 
 * @author Dell
 *
 */
public class WebDriverUtility {
	WebDriver driver;

	/**
	 * this method is used to launch the browser and navigate to application
	 * 
	 * @parameter browser
	 * @parameter url
	 * @parameter time
	 * @return
	 */
	public WebDriver openApplication(String browser, String url, long time) {

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser name entered");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get(url);
		return driver;

	}

	/**
	 * this method is used to perform mouseHover actions
	 * 
	 * @param element
	 */

	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	/**
	 * this method is used to perform double click operation
	 * 
	 * @param source
	 * @param target
	 */

	public void doubleClickONElement(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	/**
	 * this method is used to handle from drop down
	 * 
	 * @param element
	 * @param value
	 */

	public void dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this method is used to handle child browser
	 */

	public void handleChildBrowser() {
		Set<String> windows = driver.getWindowHandles();
		for (String id : windows) {
			driver.switchTo().window(id);
		}
	}

	/**
	 * this method is used to switch the control to frame
	 * 
	 * @param index
	 */

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * this method is used to switch back to parent/default frame
	 */
	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}

	/**
	 * this method is used to handle alert pop up
	 */
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}

	/**
	 * this method is used to scroll till particular element on web page
	 * 
	 * @param element
	 */

	public void scrollTillElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);
	}

	/**
	 * this method is used to fetch the screenshot of particular web element
	 */
	public void screenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshot/" + driver.getTitle() + ".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is use to close current window
	 */
	public void closeCurrentWindow() {
		driver.close();
	}

	/**
	 * this method is used to close current window
	 */

	public void currentWindows() {
		driver.quit();
	}

}

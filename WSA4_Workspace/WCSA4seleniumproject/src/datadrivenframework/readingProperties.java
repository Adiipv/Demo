 package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class readingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/data.properties");
		Properties property = new Properties();
		property.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get(property.getProperty("url"));

		driver.findElement(By.name("username")).sendKeys(property.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(property.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		Boolean demo = wait.until(ExpectedConditions.titleContains("Enter"));

		System.out.println(demo);

		String username = property.getProperty("username");
		String password = property.getProperty("password");
		String url = property.getProperty("url");
		String brower = property.getProperty("brower");
		
		System.out.println(username + '\n' + password + '\n' + brower + '\n' + url);

		driver.quit();

	}

}

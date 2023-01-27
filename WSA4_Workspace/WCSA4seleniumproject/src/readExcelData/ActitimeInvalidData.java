package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import datadrivenframework.Flib;

public class ActitimeInvalidData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=44hiub9sur951");

		Flib file = new Flib();
		int rc = file.rowCount("./data/actitimeTestData.xlsx", "invalidCreds");
        
		for (int i = 1; i <= rc; i++) {

			String username = file.readExcelData("./data/actitimeTestData.xlsx", "invalidCreds", i, 0);
			String password = file.readExcelData("./data/actitimeTestData.xlsx", "invalidCreds", i, 1);
			WebElement usn = driver.findElement(By.name("username"));
			usn.sendKeys(username);
			Thread.sleep(1000);
			WebElement pwd = driver.findElement(By.name("pwd"));
			pwd.sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);

			driver.findElement(By.name("username")).clear();

		}
		driver.quit();
	}

}

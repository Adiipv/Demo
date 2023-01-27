package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import datadrivenframework.Flib;

public class readfrompackage {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=34fgwi9e1d92x");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/actitimeTestData.xlsx","validcreds",1,0);
		String password = flib.readExcelData("./data/actitimeTestData.xlsx","validcreds",1,1);
		
		   driver.findElement(By.name("username")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(password);
		   driver.findElement(By.id("loginButton")).click();

		
	}

}

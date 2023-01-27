package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTmeUsingPropertyFile extends BaseTest1 {

	public static void main(String[] args) throws IOException {
//		
//		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
		BaseTest1 bt = new BaseTest1();
		bt.openbrowers();

		Flib flib = new Flib();
		String url = flib.readpropertydata("./data/config.properties", "Url");

		String username = flib.readpropertydata("./data/config.properties", "Username");

		String password = flib.readpropertydata("./data/config.properties", "Password");
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

		bt.closeBrower();

	}

}

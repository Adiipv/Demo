package findElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findElements01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1wrti48drubrf");
		Thread.sleep(2000);

		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");

		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Admin");

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println(usernameTextField);
		System.out.println(passwordTextField);
		System.out.println(loginButton);
		
		driver.quit();

	}

}

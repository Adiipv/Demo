package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=d247r5h5oqjks");
		
		
		
		 boolean username = driver.findElement(By.name("username")).isDisplayed();
		 if(username==true)
		 {
			 driver.findElement(By.name("username")).sendKeys("Admin");
			 System.out.println("test case pass");
			 
		 }
		 else
		 {
			 System.out.println("test case fail");
		 }
		 
		 boolean password =driver.findElement(By.name("pwd")).isDisplayed();
		 if(password==true) {
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 System.out.println("test case pass");
		 }
		 else
		 {
			 System.out.println(" test case fail");
		 }
		 
		  driver.findElement(By.id("loginButton")).click();
		//WebElement dropdown = driver.findElement(By.name("usersSelector.selectedUser"));

	}		

}

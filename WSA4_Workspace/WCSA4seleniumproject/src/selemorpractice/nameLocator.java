package selemorpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		  
		 Thread.sleep(4000);
		 if(driver.getTitle().contains("actiTIME"))
			 System.err.println("pass");
		 else
			 System.err.println("fail");
		 driver.quit();

	}

}

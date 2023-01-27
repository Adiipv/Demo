package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//a[.=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[.=' SkillRary Demo APP'])[2]")).click();
		String parantwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();

		for (String co : childwindow) {
			
			driver.switchTo().window(co);
		}
		Thread.sleep(10000);

		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement move = driver.findElement(By.xpath("//a[.='COURSE']"));
		Thread.sleep(3000);
		act.moveToElement(move).perform();

		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		driver.close();
		driver.switchTo().window(parantwindow);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("selenium",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();

	}

}

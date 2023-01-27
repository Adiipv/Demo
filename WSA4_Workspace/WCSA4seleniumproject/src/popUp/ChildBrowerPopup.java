package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowerPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();

		String ParentId = driver.getWindowHandle();

		Set<String> windowsId = driver.getWindowHandles();

		for (String id : windowsId) {
			driver.switchTo().window(id);
		}
		Thread.sleep(3000);
		driver.findElement(By.id("mytext")).sendKeys("Adesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(ParentId);
		Thread.sleep(3000);
		driver.quit();

	}

}

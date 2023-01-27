package assignmentOnRobotClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScenorioOnFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		Thread.sleep(4000);
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		// driver.findElement(By.id("confirmBtn")).click();
		
		Thread.sleep(3000);
		 WebElement frame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("asd");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("zxvc@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9876543210");
      
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
        
	}

}

package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/poppup.html");
		  WebElement click = driver.findElement(By.xpath("//button[.='click me ']"));
		  click.click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();                    ///1
		Thread.sleep(2000);
		click.click();
		Thread.sleep(2000);

		
		String aa = a1.getText();       ///2
		
		System.out.println(aa);
		a1.dismiss();                   ///3   
        // a1.sendKeys("123");          ///4  ElementNotInteractableException
	}

}

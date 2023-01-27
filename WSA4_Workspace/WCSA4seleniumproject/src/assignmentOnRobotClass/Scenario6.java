package assignmentOnRobotClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("confirmBtn")).click();
		
		 WebElement rings = driver.findElement(By.xpath("(//a[@title='Rings'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(rings).perform();
		
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[1]")).click();
		
		  List<WebElement> defaultlist = driver.findElements(By.xpath("//span[@class='p-wrap']"));
		   
		  for(WebElement opt : defaultlist)
		  {
			   String as = opt.getText();
			   System.out.println(as);
		  }
		  
		  System.out.println("--------------sorted list---------");
		
		WebElement sortby = driver.findElement(By.xpath("(//i[@class='icon-ion-chevron-down'])[8]"));
		act.moveToElement(sortby).perform();
		
		
		driver.findElement(By.xpath("//a[.='Price Low to High ' ] /ancestor :: div[@class='form-item ']")).click();
		
		 List<WebElement> sortedlist = driver.findElements(By.xpath("//span[@class='p-wrap']"));
		   
		  for(WebElement opt : sortedlist)
		  {
			   String ass = opt.getText();
			   System.out.println(ass);
			   

		  }
		  driver.quit();

	}

}

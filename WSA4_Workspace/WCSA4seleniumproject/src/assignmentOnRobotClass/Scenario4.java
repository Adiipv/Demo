package assignmentOnRobotClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");

		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		searchbox.click();
		searchbox.sendKeys("apple watches", Keys.ENTER);

		WebElement price = driver.findElement(By.xpath(
				"//span[.='Apple Watch Series 3 38 mm Gray Case Black Aluminium Smartwatch PRISTINE IN BOX']/following::span[.='$124.99']"));
		String firstprice = price.getText();
		System.out.println("The details of first Suggextion is  " + firstprice);

		WebElement price1 = driver
				.findElement(By.xpath("(//div[@class='s-item__title'])[11]/following::span[.='$129.99']"));
		String tenthprice = price1.getText();
		System.out.println("The details of Tenth Suggextion is  " + tenthprice);
		
		
		  List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-item__title']"));
		  
		  for(WebElement opts : list)
		  {
			   String print = opts.getText();
			   
			   System.out.println("The details of all the Suggextion is  " + print);
			   
			   
		  }
             Actions act = new Actions(driver);
	}

}

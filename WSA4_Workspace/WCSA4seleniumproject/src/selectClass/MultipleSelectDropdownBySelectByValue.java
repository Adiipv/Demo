package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdownBySelectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/6.html");
		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='chkbox']"));

		Select sel = new Select(dropdownelement);
        //sel.selectByValue("v5");
        //sel.selectByValue("v4");
		
		for(int i=0;i<6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}

	}

}
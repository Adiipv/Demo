package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/6.html");
		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='chkbox']"));

		Select sel = new Select(dropdownelement);

		for (int i = 0; i < 3; i++) {
			sel.selectByIndex(i);
		}
		List<WebElement> list = sel.getAllSelectedOptions();
		for (WebElement as : list) {
			String text = as.getText();
			System.out.println(text);
		}
	}
}

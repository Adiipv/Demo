package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/6.html");
		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='chkbox']"));
		

		Select sel = new Select(dropdownelement);
		 List<WebElement> list = sel.getOptions();
		 
	/*	 for(int i=0;i<list.size();i++)
		 {
			   WebElement opt = list.get(i);
			 System.out.println(opt.getText());
		 }
		 
		 System.out.println(" ");
	/*	 for(WebElement as :list)
		 {
		   	String aq = as.getText();
			 System.out.println(aq);
		 } 
	*/
		 
		 for(WebElement as :list)
		 {
			 if(as.getText().equals("vadapav"))
			 {
				 as.click();
				 break;
			 }
			 
		 }
	}

}

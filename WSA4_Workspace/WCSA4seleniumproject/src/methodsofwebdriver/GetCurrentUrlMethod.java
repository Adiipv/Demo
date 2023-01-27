package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/1.html");
		 String Currenturl=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(Currenturl);

	}

}

package windowMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizedThechild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getWindowHandle();
		
		 Set<String> allhandles = driver.getWindowHandles();
		 
		 for(String sc:allhandles) {
			 
			  String title = driver.switchTo().window(sc).getTitle();
			  System.out.println(title);
			 if(!parentTitle.equals(sc)) {
				 driver.manage().window().maximize();
			 }
			 else
			 {
				 
			 }
		 }
	}

}

package windowMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToCloseChildBrower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		String win1 = driver.getWindowHandle();

		Set<String> win2 = driver.getWindowHandles();
/*
		for (String st : win2) {
			driver.switchTo().window(st);
		}
		Thread.sleep(3000);
 		driver.close();
       first method to close  the child method     
       
*/ 	
	//second method to close child window	
		for (String st : win2) {
			System.out.println(st);
			
	/*		  
			if(!win1.equals(st)) {
				driver.switchTo().window(st).close();
				
			}
			else {
				
			}
			
*/
			// third method to close the child window
			if(win1.equals(st)) {
				
				
			}
			else {
				driver.switchTo().window(st).close();
			}
			
			
		}
		
		
	}

}

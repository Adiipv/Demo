package windowMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		  String parenthandle = driver.getWindowHandle(); //Return Type is string (parent window)
		  
		  System.out.println(parenthandle);
		  
		  System.out.println("------------------------------------------------------------------------------");
		  Set<String> Allhandle = driver.getWindowHandles(); //Return Type is  set of string (parent and child window)
		  
		  for(String st : Allhandle) {
			  System.out.println(st);
		  }
		  
		
          driver.quit();
	}

}

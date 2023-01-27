package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK1 {
     
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	String pagesource =driver.getPageSource();
	System.out.println(pagesource);
	 String pagetitle =driver.getTitle();
	 System.out.println(pagetitle);
	 driver.close();
	
}
}

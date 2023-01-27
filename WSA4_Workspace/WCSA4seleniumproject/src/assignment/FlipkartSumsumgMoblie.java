package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartSumsumgMoblie {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sumsung mobile phone",Keys.ENTER);
		Thread.sleep(2000);
        String opt = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(opt);
	    driver.quit();
	
	}
}

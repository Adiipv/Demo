package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
          WebElement opt = driver.findElement(By.xpath("//input[@class='_3704LK']"));
          opt.click();
          opt.sendKeys("hp laptop",Keys.ENTER);
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_24_Dny']/ancestor::label[@class='_2iDkf8 t0pPfW' and (.='Core i7')]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_3879cV' and (.='HP')]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_3879cV' and (.='Windows 10')]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='_3879cV' and (.='4★ & above')]")).click();
          Thread.sleep(2000);
           WebElement text = driver.findElement(By.xpath("//div[@class='_4rR01T' ]/following::div[@class='_30jeq3 _1_WHN1']"));
          
            String text1 = text.getText();
            System.out.println("the price of Hp Laptop is  " + text1);
            driver.quit();
        
        
	}

}

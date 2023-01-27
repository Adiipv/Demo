package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateBYUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/WCAS4/6.html");
		 WebElement dropdownelement = driver.findElement(By.id("i1"));
		 Select sel = new Select(dropdownelement);
		  List<WebElement> list1 = sel.getOptions();
		  
		 LinkedList<String> h1 = new LinkedList<String>();
		  
		  for(int i=0;i<list1.size() ;i++)
		  {
			  WebElement opts = list1.get(i);
			  String values =opts.getText();
			  //to add the text of webelement by removing duplicate & insertion order won't be maintained
			  h1.add(values);
		  }
		 for(String options :h1) {
			 System.out.println(options);
			  
		 }
	}

}

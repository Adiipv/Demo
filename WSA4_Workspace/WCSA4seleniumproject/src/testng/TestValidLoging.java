package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLoging extends BaseTest {
	@Parameters({ "username", "password" })
	@Test
	public void validLogin(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password, Keys.ENTER);
		
		
	}
}

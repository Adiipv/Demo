package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromedriver.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIveeI84vb-wIVsINLBR1RMwsBEAAYASAAEgLW0_D_BwE%26hvadid%3D596980891918%26hvdev%3Dc%26hvlocphy%3D9062089%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D14394057031239952953%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("98765432101",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}
}
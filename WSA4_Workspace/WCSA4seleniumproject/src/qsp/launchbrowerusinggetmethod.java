package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowerusinggetmethod {

	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
	}

}

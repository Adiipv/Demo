package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInValidLogin extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest1 bt = new BaseTest1();
		bt.openbrowers();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");

		for (int i = 1; i <= rc; i++) {
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
			
			
		}
		bt.closeBrower();

	}

}

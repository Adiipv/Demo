package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeInvalidTestLogin extends BaseTest {
	@Test
	public void inValidTest() throws IOException, InterruptedException {
		Flib flib = new Flib();
		LoginPage lp=new LoginPage(driver);
		 int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);


			lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);
		}
	}
	

}

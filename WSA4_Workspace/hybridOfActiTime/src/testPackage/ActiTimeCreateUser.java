package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class ActiTimeCreateUser extends BaseTest{
	@Test
	public void createValidUser() throws InterruptedException, IOException {
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);

		lp.actiTimeValidLogin(flib.readPropertyData(PROPERTIES_PATH, "Username"),
				flib.readPropertyData(PROPERTIES_PATH, "Password"));
		 
		UserPage up = new UserPage(driver);
		
		Thread.sleep(3000);
		up.clickUser();
		up.clickCreateUserButton();
		
		
	}

}

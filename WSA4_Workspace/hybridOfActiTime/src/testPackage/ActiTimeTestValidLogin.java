package testPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomListner.class) // to take screenshot we need to use this 
public class ActiTimeTestValidLogin extends BaseTest {

	@Test
	public void validTest() throws IOException, InterruptedException {
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);

		lp.actiTimeValidLogin(flib.readPropertyData(PROPERTIES_PATH, "Username"),
				flib.readPropertyData(PROPERTIES_PATH, "Password"));
		
       Assert.fail(); // to fail the test case we use this 
	}
}

package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4dependsonMethod {
	@Test()
	public void logInMethod() {
		Reporter.log("log in is Done!!", true);
	}

	@Test(dependsOnMethods = "logInMethod")
	public void createUser() {
		Reporter.log("User Created!!", true);
	}

	@Test(dependsOnMethods = "createUser")
	public void logOutMethod() {
		Reporter.log("log out is Done!!", true);
	}
}

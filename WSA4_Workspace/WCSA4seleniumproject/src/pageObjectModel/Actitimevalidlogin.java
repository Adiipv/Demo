package pageObjectModel;

import java.io.IOException;

public class Actitimevalidlogin extends pageObjectModel.BaseTest1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		pageObjectModel.BaseTest1 bt = new pageObjectModel.BaseTest1();
		bt.openBrowser();

		pageObjectModel.Flib flib = new pageObjectModel.Flib();

		LoginPage lp = new LoginPage(driver);
		
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),
				flib.readPropertyData(PROP_PATH, "Password"));
	}

}

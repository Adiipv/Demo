
package pageObjectModel;

import java.io.IOException;

public class Actitimeinvalidlogin extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	  BaseTest1 bt = new BaseTest1();
	  bt.openBrowser();
	   
	   Flib flib = new Flib();
	   
	    LoginPage lp = new LoginPage(driver);
	    int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);


			lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);
		}
          
		bt.closeBrowser();
		
	}

}

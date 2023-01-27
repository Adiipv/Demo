package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	@FindBy(xpath = "//a[@class='content users_selected selected']")
	private WebElement userTab;

	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createUserButton;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTF;

	@FindBy(xpath = "//input[@name='passwordText']")
	private WebElement passwordTf;

	@FindBy(xpath = "//input[@name='passwordTextRetype']")
	private WebElement retypePasswordTF;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameTF;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameTf;

	@FindBy(xpath = "//input[@value='   Create User   ']")
	private WebElement createUserButt;

	@FindBy(xpath = "//input[@value='      Cancel      ']")
	private WebElement cancelButton;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUserTab() {
		return userTab;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getRetypePasswordTF() {
		return retypePasswordTF;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTf() {
		return lastNameTf;
	}

	public WebElement getCreateUserButt() {
		return createUserButt;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	 public void clickUser() {
		 getUserTab().click();
	 }
	public void validuser(String validUser) {
		getUserTab().sendKeys(validUser);
	}

	public void validpass(String ValidPass) {
		getPasswordTf().sendKeys(ValidPass);
	}

	public void validrepass(String validrepass) {
		getRetypePasswordTF().sendKeys(validrepass);
	}

	public void validFirstName(String validfirstName) {
		getFirstNameTF().sendKeys(validfirstName);
	}

	public void validLastName(String ValidLastName) {
		getLastNameTf().sendKeys(ValidLastName);

	}

	public void clickCreateUserButton() {
		getCreateUserButt().click();
	}

	public void clickCancelButton() {
		getCancelButton().click();
	}

}

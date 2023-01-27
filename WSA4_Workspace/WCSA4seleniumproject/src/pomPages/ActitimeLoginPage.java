package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	
	//declaration of elements
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	private WebElement logo;
	

	@FindBy(id="username")
	private WebElement usernameTF;
	

	@FindBy(name  ="pwd")
	private WebElement passwordTF;
	

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedCheckbox ;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(partialLinkText="Forgot")
	private WebElement forgotPasswordLink;
	
	//initialization
	public  ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//utilization

	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
	
	public void clickCheckbox() {
		keepMeLoggedCheckbox.click();
	}

	public WebElement getLogo() {
		return logo;
	}
	
	
      
	
	
	
	
	
	

}

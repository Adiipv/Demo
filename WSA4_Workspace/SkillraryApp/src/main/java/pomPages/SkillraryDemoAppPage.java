package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	// declaration
	@FindBy(xpath = "//a[contains(.,'Ecommerce')]")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath = "")
	private WebElement seleniumTrainingLink;
	@FindBy(name = "")
	private WebElement categoryDropDown;
	@FindBy(xpath = "")
	private WebElement contactUslink;
	
	public SkillraryDemoAppPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	public WebElement getPageHeader() {
		return pageHeader;
	}

	
	public void mouseHoverToCourseTab(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining() {
		
	}
}

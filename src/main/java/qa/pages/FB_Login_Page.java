package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.util.TestBase;

public class FB_Login_Page extends TestBase{
	
	// Page Factory
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@alt='Facebook']")
	WebElement fbLogo;
	
	@FindBy(xpath="//div[@class='_9ay7']")
	WebElement error;
	
	// Initialization of Page Objects
	public FB_Login_Page(){
		PageFactory.initElements(driver, this);
	}

	// Actions
	
	public String validate_PageTitle() {
		return driver.getTitle();
	}
	
	public boolean validate_Fb_Logo() {
		return fbLogo.isDisplayed();
	}
	public void login(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void click_logIn_button() {
		loginBtn.click();
	}
	public String readError() {
		String actualError = error.getText();
		System.out.println(actualError);
		return actualError;
	}
}

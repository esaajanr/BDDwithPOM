package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.util.TestBase;

public class FB_SignUp_Page extends TestBase{

	
	// Page Factory
	@FindBy(linkText="Create new account")
	WebElement newAccountBtn;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="reg_email__")
	WebElement mobileNumber;

	@FindBy(id="password_step_input")
	WebElement newPassword;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="day")
	WebElement date;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(name="websubmit")
	WebElement submitBtn;
	
	// Initialization of Page Objects
	public FB_SignUp_Page() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public void registration(String ftName, String ltName, String pwd, String phone) {
		newAccountBtn.click();
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		newPassword.sendKeys(pwd);
		mobileNumber.sendKeys(phone);
		
		Select m = new Select(month);
		m.selectByValue("6");
		Select d = new Select(date);
		d.selectByValue("18");
		Select y = new Select(year);
		y.selectByValue("2003");
		submitBtn.click();
	}
	
}

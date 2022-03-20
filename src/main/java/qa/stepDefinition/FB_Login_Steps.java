package qa.stepDefinition;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.pages.FB_Login_Page;
import qa.util.TestBase;

public class FB_Login_Steps extends TestBase{
	
	FB_Login_Page lp = new FB_Login_Page();
	
	@Given("^user open browser and go to url of login page$")
	public void user_open_browser_and_go_to_url_of_login_page(){
	   TestBase.initialization();
	}

	@When("^title of login page is Facebook - Log In or Sign Up$")
	public void title_of_login_page_is_Facebook_Log_In_or_Sign_Up(){
	   String title = lp.validate_PageTitle();
	   Assert.assertEquals("Facebook - Log In or Sign Up", title);
	  }
	@Then("^verify FB logo is present$")
	public void verify_FB_logo_is_present(){
		 boolean flag = lp.validate_Fb_Logo();
		  Assert.assertTrue("Logo is present", flag);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	   lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user click on logIn button$")
	public void user_click_on_logIn_button(){
		lp.click_logIn_button();
	    
	}

	@Then("^user see error message$")
	public void user_see_error_message(){
	    
	}

	@Then("^close the browser$")
	public void close_the_browser(){
	   
	}

}

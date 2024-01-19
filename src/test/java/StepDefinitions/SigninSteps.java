package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import Pages.signinpage;
import Utilities.ReadExcelDataRows;
import Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninSteps {
	private signinpage sgn = new signinpage(DriverFactory.getDriver());
	
	@Given("User is logged in to the application")
	public void user_is_logged_in_to_the_application() {
	//List<Map<String, String>> credentialList = credTable.asMaps();
	List<String> ArrayList = new ArrayList<String>();
	ArrayList = ReadExcelDataRows.ReadRows();
	String UserName = ArrayList.get(0);
	String Password =  ArrayList.get(1);
	
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");

	sgn.dologin(UserName, Password);
	    
	}
	
	@Given("Browser is open")
	public void browser_is_open() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");	
	   	}

	@When("user clicks on get started")
	public void user_clicks_on_get_started() {
		sgn.getstartbtn();
		System.out.println("success1"); 
		
	   	}
 
	@When("when user enters signin button")
	public void when_user_enters_signin_button() {
		sgn.signinbtn();
		System.out.println("success2"); 
	}

	@When("user enter credentials username as {string}")
	public void user_enter_credentials_username_as(String usernam) {
		sgn.username(usernam);
		System.out.println("success3");
	}
	@When("user left password box empty {string}")
	public void user_left_password_box_empty(String passwod) {
		sgn.password(passwod);
		System.out.println("success4");
	}

	@When("user click login button")
	public void user_click_login_button() throws InterruptedException{
		sgn.loginbtn();	
		Thread.sleep(1000);
	   	}
	@Then("it should display message")
	public void it_should_display_message() {
		sgn.popupmsg();
		System.out.println("success6");  
	
	}
// second scenario starts from here
	@When("user enter credentials username as empty {string}")
	public void user_enter_credentials_username_as_empty(String usernam) {
		sgn.username(usernam);
		System.out.println("success3");
	   
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String passwod) {
		sgn.password(passwod);
		System.out.println("success4");

	}
	
	@Then("it should display message for second case")
	public void it_should_display_message_for_second_case() {                        ///html/body/div[3]
		sgn.popupmsg();
		System.out.println("success6");  
	   	}
	//third scenario case starts from here
	
	@When("user enter wrong username as empty {string}")
	public void user_enter_wrong_username_as_empty(String usernam) {
		sgn.username(usernam);
		System.out.println("success3");
		}

	@When("user enter wrong password as {string}")
	public void user_enter_wrong_password_as(String passwod) {
		sgn.password(passwod);
		System.out.println("success4");	
	}

	@Then("it should display message for third case")
	public void it_should_display_message_for_third_case() {
	System.out.println("success5");
     }
	//fourth case starts here
@When("user enter correct username as empty {string}")
public void user_enter_correct_username_as_empty(String usernam) {
	sgn.username(usernam);
	
}

@When("user enter correct password as {string}")
public void user_enter_correct_password_as(String passwod){
	sgn.password(passwod);
   }

@Then("it should go to home page by showing username on top")
public void it_should_go_to_home_page_by_showing_username_on_top() throws InterruptedException  {
	sgn.signoutbtn();	
	Thread.sleep(1000);
	System.out.println("success10");
   }
}
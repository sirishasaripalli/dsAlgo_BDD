package StepDefinitions;

import java.util.List;
import java.util.Map;

import Factory.DriverFactory;
import Pages.ArrayPage;
import Pages.DataStructurePage;
import Pages.TreePage;
import Pages.signinpage;
import Pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructurePageSteps {
	
		
	private DataStructurePage DataStrucPage = new DataStructurePage(Factory.DriverFactory.getDriver());
	
	
	@Given ("User is on Home Page")
	public void user_is_on_home_page(){
		DataStrucPage.getHomePageTitle();
	}
	@When("user clicks on datatructure  get started")
	public void user_clicks_on_datatructure_get_started() {
		DataStrucPage.datastructuregetstartbtn();
	}

	@Then("it should go to data structure home page")
	public void it_should_go_to_data_structure_home_page() {
	    System.out.println("sucessfully opend datastructure home page");
	}
	@When("user click Time Complexity button")
	public void user_click_time_complexity_button() {
		DataStrucPage.Timecomplxbtn();
	}

	@Then("it should go to data structure time-complexity page")
	public void it_should_go_to_data_structure_time_complexity_page() {
	    System.out.println("sucessfully opened timecomplexity page");
	}

	@Then("user click on practice button")
	public void user_click_on_practice_button() {
		DataStrucPage.practicequ();
	}
	@Then("it should go to practice question page")
	public void it_should_go_to_practice_question_page() {
	    System.out.println("successfully opened practice question page");
	}
	@Then("user click on Try here button")
	public void user_click_on_try_here_button() {
		DataStrucPage.TryHereBtn();
	}

	@Then("user enter correct code as {string}")
	public void user_enter_correct_code_as(String codes ) {
		DataStrucPage.code(codes);
	}

	@Then("user click run button")
	public void user_click_run_button() {
		DataStrucPage.runbt();
	}

	@Then("user seeing output of code")
	public void user_seeing_output_of_code() {
	    System.out.println("successfully output display");
	}

}



package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage()
	{
	PageFactory.initElements(driver,this);
	}
	//LoginPage l = new LoginPage();
	@Given("I am in khanacademy starting page")
	public void i_am_in_khanacademy_starting_page() {
	    BaseClass.launchBrowser();
	    
	}

	@When("khan academy site opened")
	public void khan_academy_site_opened() {
	 
	    throw new cucumber.api.PendingException();
	}

	@Then("I should see {string} text")
	public void i_should_see_text(String string) {
	    
	    throw new cucumber.api.PendingException();
	}

	@Then("{string} text")
	public void text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I should see modules in bottom of the page")
	public void i_should_see_modules_in_bottom_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click {string} button")
	public void i_click_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I should see list of courses available displayed")
	public void i_should_see_list_of_courses_available_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I select courses dropdown")
	public void i_select_courses_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I should see list of courses")
	public void i_should_see_list_of_courses() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I should see Math Early math")
	public void i_should_see_Math_Early_math() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	

}

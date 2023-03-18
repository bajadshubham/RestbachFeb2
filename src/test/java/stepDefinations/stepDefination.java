package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	@Given("^user is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
		// driver.get("");
		System.out.println("User is on landing page.");
	}
	
	@When("^User login into the application with valid username and password$")
    public void user_login_into_the_application_with_valid_username_and_password(){
        System.out.println("User enter credetials");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated()  {
        System.out.println("home page populated");
    }

    @And("^User click on submit button$")
    public void user_click_on_submit_button()  {
    	 System.out.println("User click on submit button");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() {
    	 System.out.println("cards are displayed");
    }
}

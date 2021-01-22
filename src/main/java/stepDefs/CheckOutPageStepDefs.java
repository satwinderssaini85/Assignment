package stepDefs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import pages.CheckOutPage;
import utils.Helper;

public class CheckOutPageStepDefs extends Helper {
	CheckOutPage checkoutpage = new CheckOutPage(driver);



	@When("^User enter email to register$")
	public void user_enter_email_to_register() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		checkoutpage.ClickandFillEmail();
	}

	@When("^User click create account button$")
	public void user_click_create_account_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		checkoutpage.ClickCreateAccount();
	}



	@When("^User enter mandatory details$")
	public void user_enter_mandatory_details(DataTable listOfdetails) throws Throwable {
		List<Map<String,String>> data = listOfdetails.asMaps(String.class,String.class); 
			checkoutpage.AddMandatoryDetails(data);
		
	}

	@When("^User Proceed to Shipping page$")
	public void user_Proceed_to_Shipping_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		checkoutpage.ProceedToCheckOut();
	}
	@Then("^User verify selection \"([^\"]*)\"$")
	public void user_verify_selection(String Dress) throws Throwable {
		checkoutpage.VerifyOrderedDress(Dress);

	}
	@When("^User confirm order$")
	public void user_confirm_order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		checkoutpage.PayByBankWire();

	}


}

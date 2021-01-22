package stepDefs;



import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LandingPage;
import utils.Helper;


public class LandingPageStepDefs extends Helper{
	LandingPage landingpage = new LandingPage(driver);
	@When("^User select \"([^\"]*)\" tab$")
	public void user_select_tab(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
	@When("^User hovers over online \"([^\"]*)\"$")
	public void user_hovers_over_online(String shoppingCategory) throws Throwable {
		landingpage.hoverShopChoice(shoppingCategory);
	}
	@When("^User select \"([^\"]*)\"$")
	public void user_select(String dressType) throws Throwable {
		landingpage.clickDressSelection(dressType);
	}


	@When("^User hover over Cart$")
	public void user_hover_over_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		landingpage.hoverCart();
	}

	@When("^User click checkout button$")
	public void user_click_checkout_button() throws Throwable {
		landingpage.clickCheckout();
	}

	@When("^User click Proceed to Checkout$")
	public void user_click_Proceed_to_Checkout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		landingpage.clickProceedToCheckoutButton();
	}
}

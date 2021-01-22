package stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SummerDressPage;
import utils.Helper;

public class SummerDressPageStepDefs extends Helper {
	SummerDressPage summerDrePage = new SummerDressPage(driver);

	@When("^User hover over \"([^\"]*)\"$")
	public void user_hover_over(String dressToBuy) throws Throwable {
		summerDrePage.HoverSummerDressToBuy(dressToBuy);
	}

	@When("^User click over quick view element$")
	public void user_click_over_quick_view_element() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		summerDrePage.ClickQuickView();
	}


	@When("^User selects \"([^\"]*)\"$")
	public void user_selects(String size) throws Throwable {
		summerDrePage.SizeSelection(size);
	}

	@When("^User click Add to Cart$")
	public void user_click_Add_to_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		summerDrePage.AddToCartButton();
	}

	@When("^User click continue shopping$")
	public void user_click_continue_shopping() throws Throwable {
		summerDrePage.ContinueShoppingButton();
	}

}

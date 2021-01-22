package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage extends BasePage {

	private By tab_Women = By.xpath("//*[@title='Women']");
	private By tab_Dresses = By.xpath("//*[@title='Dresses']");
	private By tab_Tshirts = By.xpath("//*[@title='T-shirts']");
	private By tab_SummerDresses = By.xpath("//a[@title='Summer Dresses']");
	private By tab_CasualDresses = By.xpath("//a[@title='Casual Dresses']");
	private By tab_EveningDresses = By.xpath("//a[@title='Evening Dresses']");
	private By CartButton = By.xpath("//a[@title='View my shopping cart']");
	private By CheckoutButton = By.xpath("//a[@id='button_order_cart']");
	private By ProceedCheckoutButton = By.xpath("(//a[@title='Proceed to checkout'])[2]");

	public LandingPage(WebDriver driver) {
		super(driver);

	}

	public void clickDressSelection(String dressSelection) throws Throwable {
		if (dressSelection.equalsIgnoreCase("Summer Dresses")) {
			getElementAndClick(tab_SummerDresses);
		} else if (dressSelection.equalsIgnoreCase("Casual Dresses")) {
			getElementAndClick(tab_CasualDresses);
		} else if (dressSelection.equalsIgnoreCase("Evening Dresses")) {
			getElementAndClick(tab_EveningDresses);
		} else {
			throw new Exception(dressSelection + " Is not a matching selection");
		}

	}

	public void hoverCart() throws Throwable {
		actionHover(CartButton);
	}

	public void clickCheckout() throws Throwable {
		getElementAndClick(CheckoutButton);
	}

	public void clickProceedToCheckoutButton() throws Throwable {
		getElementAndClick(ProceedCheckoutButton);

	}

	public void hoverShopChoice(String shoppingCategory) throws Throwable {
		if (shoppingCategory.equalsIgnoreCase("WOMEN")) {
			actionHover(tab_Women);
		} else if (shoppingCategory.equalsIgnoreCase("DRESSES")) {
			actionHover(tab_Dresses);
		} else if (shoppingCategory.equalsIgnoreCase("T-SHIRTS")) {
			actionHover(tab_Tshirts);
		} else {
			throw new Exception(shoppingCategory + " Is not a matching selection");
		}

	}

}

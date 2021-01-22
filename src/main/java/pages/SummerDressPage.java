package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SummerDressPage extends BasePage {

	public SummerDressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By SummerDress_QuickView = By.xpath("//div/ul[1]/li[1]/div/div[1]/div/a[2]");
	private By SizeSelectorDropdown = By.xpath("//select[@name='group_1']");
	private By textfetch = By.xpath("//h1[@itemprop='name']");
	private By fancyboxFrame = By.xpath("//iframe[@class='fancybox-iframe']");
	private By ButtonAddToCart = By.xpath("//button[@type='submit']");
	private By ButtonContinueShop = By.xpath("//span[@title='Continue shopping']");

	public void HoverSummerDressToBuy(String dressToBuy) throws Throwable {
		By Summer_Dress = By.xpath("//a[@title='" + dressToBuy + "' and @class='product_img_link']");
		actionHover(Summer_Dress);
	}

	public void ClickQuickView() throws Throwable {
		getElementAndClick(SummerDress_QuickView);
	}

	public void SizeSelection(String size) throws Throwable {
		driver.switchTo().frame(driver.findElement(fancyboxFrame));
		Select s = new Select(driver.findElement(SizeSelectorDropdown));
		s.selectByVisibleText(size);
	}

	public void AddToCartButton() throws Throwable {
		getElementAndClick(ButtonAddToCart);
	}

	public void ContinueShoppingButton() throws Throwable {
		getElementAndClick(ButtonContinueShop);
	}
}

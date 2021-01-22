package pages;

import static org.testng.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By emailToRegister = By.xpath("//*[@id='email_create']");
	private By createAccount = By.xpath("//*[@id='SubmitCreate']");
	private By genderButton = By.xpath("//*[@id='id_gender1']"); 
	private By Firstname = By.xpath("//*[@id='customer_firstname']");
	private By Lastname =By.xpath("//*[@id='customer_lastname']");
	private By Password =By.xpath("//*[@id='passwd']");
	private By AddressFirstname = By.xpath("//*[@id='firstname']");
	private By AddressLastname = By.xpath("//*[@id='firstname']");
	private By Adress = By.xpath("//*[@id='address1']");
	private By City = By.xpath("//*[@id='city']");
	private By SelectStateDropDown =By.xpath("//*[@id='uniform-id_state']");
	//private By SelectSate =By.xpath("//*[@id='id_state']/option[3]");
	private By SelectSate =By.xpath("//select[@name='id_state']");
	private By zipcode = By.xpath("//*[@id='postcode']");
	private By mobilePhone = By.xpath("//*[@id='phone_mobile']");
	private By Register=By.xpath("//button[@name='submitAccount']");
	private By ProceedToCheckOut =By.xpath("//button[@name='processAddress']");
	private By AgreeTermsBox=By.xpath("//div[@class='checker']");
	private By Shipping_ProceedToCheckout= By.xpath("//button[@name='processCarrier']");
	private By PayByBankWire=By.xpath("//a[@class='bankwire']");
	private By ProductDescription=By.xpath("//p[@class='product-name']/a");
	private By ConfirmOrder=By.xpath("//button[@type='submit']");

	DateTimeFormatter Unique_number = DateTimeFormatter.ofPattern("MMddHHmmss");  
	LocalDateTime now = LocalDateTime.now(); 


	public void ClickandFillEmail() throws Throwable{

		//DateTimeFormatter Unique_email = DateTimeFormatter.ofPattern("MMddHHmmss");  
		//  LocalDateTime now = LocalDateTime.now(); 
		System.out.println(Unique_number.format(now));  
		String email;
		email = "automation_"+ Unique_number.format(now)+"@something.com" ;
		getElementAndEnter(emailToRegister, email);
	}

	public void ClickCreateAccount () throws Throwable{

		getElementAndClick(createAccount);
	}

	public void AddMandatoryDetails(List<Map<String, String>> data ) throws Throwable{

		getElementAndClick(genderButton);

		String statename ="";
		statename = data.get(0).get("State");
		getElementAndEnter(Firstname, data.get(0).get("First Name"));
		getElementAndEnter(Lastname, data.get(0).get("Last Name"));
		getElementAndEnter(Password, data.get(0).get("Password"));
		getElementAndEnter(AddressFirstname, data.get(0).get("FirstNameAddress"));
		getElementAndEnter(AddressLastname, data.get(0).get("LastNameAddress"));
		getElementAndEnter(Adress, data.get(0).get("Street") );
		getElementAndEnter(City, data.get(0).get("City"));
		getElementAndClick(SelectStateDropDown);
		Select s = new Select(driver.findElement(SelectSate));
		s.selectByVisibleText(statename);
		getElementAndEnter(zipcode,data.get(0).get("ZipCode"));
		getElementAndEnter(mobilePhone, data.get(0).get("Mobile"));
		getElementAndClick(Register);
	}
	//	}

	public void ProceedToCheckOut() throws Throwable{
		getElementAndClick(ProceedToCheckOut);

		getElementAndClick(AgreeTermsBox);
		getElementAndClick(Shipping_ProceedToCheckout);
	}

	public void VerifyOrderedDress(String Dress) throws Throwable{
		String cart_product = getTextFromElement(ProductDescription);
		assertEquals(cart_product, Dress);
	}

	public void PayByBankWire()throws Throwable{

		getElementAndClick(PayByBankWire);
		getElementAndClick(ConfirmOrder);
	}



}

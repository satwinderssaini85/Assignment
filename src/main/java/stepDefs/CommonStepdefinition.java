package stepDefs;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.Given;
import pages.LandingPage;
import utils.Prop_Reader;
import utils.Helper;

public class CommonStepdefinition extends Helper {

	LandingPage lp = new LandingPage(driver);

	@Given("^User land on \"([^\"]*)\"$")
	public void user_land_on(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Properties prop =Prop_Reader.readPropertiesFile("TestProperties.properties") ;
		String url = prop.getProperty("url");
		driver.get(url);
	}
}

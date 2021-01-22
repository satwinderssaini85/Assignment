package stepDefs;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import enums.Browsers;
import utils.Helper;
import utils.Log;

public class ServiceHooks {
	Helper helper;

	
	@Before
	public void initializeTest() throws IOException {
		helper = new Helper();		 
		Helper.selectBrowser(Browsers.CHROME.name());
		
	}

	@After
	public void killTest() {
		Helper.driver.quit();
		
	}
	
}

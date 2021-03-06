package step_def;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import generic.SeleniumBase;
import page_Object.HomePage;

public class HomeStepDef extends HomePage {
	
	
	@Given("user launches {string} browser and hits the url {string}")
	public void user_launches_browser_and_hits_the_url(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		super.launchBrowserAndApplication(string, string2);
		//super.writeExcel();
		super.readExcel();
		
	}

	@Then("verify page by {string} with value as {string}")
	public void verify_page_by_with_value_as(String type, String expectedvalue) {
		// Write code here that turns the phrase above into concrete actions
		
		String actualvalue=super.getPageDetails(type);
		super.compareValue(actualvalue, expectedvalue);
		
	}

	@Then("verify count of links is {int}")
	public void verify_count_of_links_is(Integer expectedvalue) {
		// Write code here that turns the phrase above into concrete actions
		int actualvalue=super.getCountOfLinks();
		
		super.compareValue(actualvalue, expectedvalue);
	}

	@After
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		super.closeApplication();
	}

	@Then("click on {string}")
	public void click_on(String linkname) {
		// Write code here that turns the phrase above into concrete actions
		super.clickLink(linkname);
	}

}

package step_def;

import cucumber.api.java.en.Then;
import page_Object.DropdownPage;


public class DropdownStepDef extends DropdownPage {
	@Then("select and click on {string} element located by {string}")
	public void select_and_click_on_element_located_by(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}

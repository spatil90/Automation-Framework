package step_def;

import cucumber.api.java.en.Then;
import page_Object.DropdownPage;


public class DropdownStepDef extends DropdownPage {
	@Then("select {string} element located by {string}")
	public void select_and_click_on_element_located_by(String value, String type) {
	    // Write code here that turns the phrase above into concrete actions
	   super.selectValues(type, value);
	}

}

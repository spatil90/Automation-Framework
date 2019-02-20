package step_def;

import cucumber.api.java.en.*;
import page_Object.MultipleWindowsPage;

public class MultipleWindowsStepDef extends MultipleWindowsPage {
	
	@Then("click on {string} of multiple windows page")
	public void click_on_of_multiple_windows_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    super.clickClickHereLink();
	}

	@Then("switch from current window to another with title as {string}")
	public void switch_from_current_window_to_another_with_title_as(String title) {
	    // Write code here that turns the phrase above into concrete actions
	    super.switchToAnotherWindow(title);
	}

	@Then("verify text as {string}")
	public void verify_text_as(String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
	    String actualValue = super.getTextvalueOfWindow();
	    super.compareValue(actualValue, expectedValue);
	}

}

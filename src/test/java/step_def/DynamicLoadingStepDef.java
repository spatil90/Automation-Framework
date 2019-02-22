package step_def;

import cucumber.api.java.en.Then;
import page_Object.DynamicLoadingPage;

public class DynamicLoadingStepDef extends DynamicLoadingPage {
	
	@Then("click on {string} of Dynamic loading page")
	public void click_on_of_Dynamic_loading_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    super.clickExample1Link();
	   
	}
	
	@Then("click on {string} button")
	public void click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    super.clickStart();
	}
	
	@Then("verify text as {string} from example of dynamic loading")
	public void verify_text_as_from_example_of_dynamic_loading(String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue = super.getTextvalueOfHelloWorld();
	    super.compareValue(actualValue, expectedValue);
	}

}

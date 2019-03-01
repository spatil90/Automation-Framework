package step_def;

import cucumber.api.java.en.*;
import page_Object.JavascriptAlertPage;

public class JavascriptAlertStepDef extends JavascriptAlertPage {
	@Then("click on button {string}")
	public void click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    super.clickButton(string);
	}

	@Then("then {string} the javascript alert pop up")
	public void the_javascript_alert_pop_up(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   super.handleAlertBox(string, null);
	}

	@Then("pass {string} in alert text box")
	public void pass_in_alert_text_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  super.handleAlertBox("", string);  
	}

	@Then("verify text {string} in Result")
	public void verify_text_in_Result(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String actualvalue= super.getVerifyTextForAlert();
	    super.compareValue(actualvalue.split("You entered: ")[1], string);
	}

}

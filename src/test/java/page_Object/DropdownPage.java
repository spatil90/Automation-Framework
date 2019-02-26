package page_Object;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class DropdownPage extends SeleniumBase{
	
	String idDropdown = "dropdown";
	
	private WebElement getDropdown() {
		return super.identifyElement(locators.id, idDropdown);
	}
	
	public void selectValues(String type, String value) {		
		
		super.selectValueFromDropdown(type, value, this.getDropdown());
	}
	
}

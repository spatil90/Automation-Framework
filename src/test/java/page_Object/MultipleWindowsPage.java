package page_Object;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class MultipleWindowsPage extends SeleniumBase {
	
	String linktextClickHereLink = "Click Here";
	String xpathTextValue = "//div/h3";
	
	private WebElement getClickHereLink() {
		
		return super.identifyElement(locators.linktext, linktextClickHereLink);
		
	}
	
	private WebElement getTextElementOfWindow() {
		
		return super.identifyElement(locators.xpath, xpathTextValue);
		
	}
	
	public void clickClickHereLink() {
		this.getClickHereLink().click();
	}
	
	public String getTextvalueOfWindow() {
		return this.getTextElementOfWindow().getText();
	}	

	

}

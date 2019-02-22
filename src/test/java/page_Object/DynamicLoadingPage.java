package page_Object;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;


public class DynamicLoadingPage extends SeleniumBase{
	
	String linkExample1Link = "Example 1: Element on page that is hidden";
	String xpathStart="//div/button";
	String xpathHelloWorld="//div[@id='finish']/h4";
	
private WebElement getExample1() {
		
		return super.identifyElement(locators.linktext, linkExample1Link);
		
	}

public void clickExample1Link() {
	this.getExample1().click();
}

private WebElement getStart() {
	
	return super.identifyElement(locators.xpath, xpathStart);
	
}

public void clickStart() {
	this.getStart().click();
	}

private WebElement getTextHelloWorld() {
	super.explicitWait(super.getByObject(locators.xpath, xpathHelloWorld));
	
	return super.identifyElement(locators.xpath, xpathHelloWorld);
	
}


public String getTextvalueOfHelloWorld() {
	return this.getTextHelloWorld().getText();
}	
}

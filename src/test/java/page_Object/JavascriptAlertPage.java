package page_Object;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;


public class JavascriptAlertPage extends SeleniumBase{
    String xpathbutton="//button[contains(text(),'%s' )]";
    String idResult ="result";
    
    private WebElement getButton(String buttonText) {
    	xpathbutton = String.format(xpathbutton, buttonText);
		return super.identifyElement(locators.xpath, xpathbutton);
	}
    
    private WebElement getVerifyText() {
		return super.identifyElement(locators.id, idResult);
	}
    
    public void clickButton(String buttonText) {
    	this.getButton(buttonText).click();
    	xpathbutton = "//button[contains(text(),'%s' )]";
    }
    
    public String getVerifyTextForAlert() {
    	return this.getVerifyText().getText();
    	
    }   	
}

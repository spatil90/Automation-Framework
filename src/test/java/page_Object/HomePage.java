package page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class HomePage extends SeleniumBase {
	String tagNameHomePageLinks="a";
	
	public List<WebElement> getAllLinks() {
		return super.identifyElements(locators.tagname,tagNameHomePageLinks);
		
	}
	
	public int getCountOfLinks() {
	return	this.getAllLinks().size();
	}

}

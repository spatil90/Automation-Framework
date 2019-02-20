package page_Object;

import java.util.List;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class HomePage extends SeleniumBase {
	String tagNameHomePageLinks="a";
	String linktextHomePageLink = "%s";
	
	private List<WebElement> getAllLinks() {
		return super.identifyElements(locators.tagname,tagNameHomePageLinks);
		
	}
	
	public int getCountOfLinks() {
		return	this.getAllLinks().size();
	}
	
	private WebElement getHomePageLink(String linkname) {
		linktextHomePageLink = String.format(linktextHomePageLink, linkname);
		return super.identifyElement(locators.linktext, linktextHomePageLink);
		
	}
	
	public void clickLink(String linkname) {
		this.getHomePageLink(linkname).click();
	}

}

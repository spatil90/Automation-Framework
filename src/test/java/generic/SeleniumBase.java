package generic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBase extends Base {
	static WebDriver driver;

	protected enum locators {
		id, name, classname, tagname, linktext, partiallinktext, css, xpath
	};

	public void launchBrowserAndApplication(String browser_name, String url) {
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					".\\src\\test\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					".\\src\\test\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser_name.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver",
					".\\src\\test\\java\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void closeApplication() {
		driver.quit();
	}

	public String getPageDetails(String type) {
		String returnvalue = null;
		if (type.equalsIgnoreCase("currenturl")) {
			returnvalue = driver.getCurrentUrl();
		}
		else if(type.equalsIgnoreCase("title")) {
			returnvalue = driver.getTitle();
		}
		return returnvalue;
	}

	public WebElement identifyElement(locators type, String address) {
		By by = null;
		switch (type) {
		case id:
			by = By.id(address);
			break;
		case name:
			by = By.name(address);
			break;
		case classname:
			by = By.className(address);
			break;
		case tagname:
			by = By.tagName(address);
			break;
		case linktext:
			by = By.linkText(address);
			break;
		case partiallinktext:
			by = By.partialLinkText(address);
			break;
		case css:
			by = By.cssSelector(address);
			break;
		case xpath:
			by = By.xpath(address);
			break;

		}
		return driver.findElement(by);

	}

	public List<WebElement> identifyElements(locators type, String address) {
		By by = null;
		switch (type) {
		case id:
			by = By.id(address);
			break;
		case name:
			by = By.name(address);
			break;
		case classname:
			by = By.className(address);
			break;
		case tagname:
			by = By.tagName(address);
			break;
		case linktext:
			by = By.linkText(address);
			break;
		case partiallinktext:
			by = By.partialLinkText(address);
			break;
		case css:
			by = By.cssSelector(address);
			break;
		case xpath:
			by = By.xpath(address);
			break;

		}
		return driver.findElements(by);

	}

	public void switchToAnotherWindow(String title) {
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(parentWindowHandle);
		System.out.println(windowHandles);
		
		for(String handle : windowHandles) {			
			
			if(handle.equals(parentWindowHandle)) {
				continue;
			}
			else {
				driver.switchTo().window(handle);
				String tempTitle = this.getPageDetails("title");
				if(tempTitle.equals(title)) {
					break;
				}
				else {
					continue;
				}
			}
		}
		
		
		
	}
}

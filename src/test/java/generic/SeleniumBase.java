package generic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * Options opt = driver.manage(); Timeouts tou = opt.timeouts();
		 * tou.implicitlyWait(30, TimeUnit.SECONDS);
		 */
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
	
	public By getByObject(locators type, String address) {
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
		return by;

	}

	public WebElement identifyElement(locators type, String address) {
		return driver.findElement(this.getByObject(type, address));

	}

	public List<WebElement> identifyElements(locators type, String address) {
		return driver.findElements(this.getByObject(type, address));

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

	public void explicitWait(By by) {
		
		System.out.println(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);		
		
		ExpectedCondition<WebElement> ec = ExpectedConditions.visibilityOfElementLocated(by);
		wait.until(ec);
		
	}
	
	public void selectValueFromDropdown(String type, String value, WebElement element) {
		Select sel = new Select(element);
		
		if(type.equalsIgnoreCase("index")) {
			int val = Integer.parseInt(value); //convert from string to int
			sel.selectByIndex(val);
		}
		else if(type.equalsIgnoreCase("value")) {
			sel.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("text")) {
			sel.selectByVisibleText(value);
		}
		
	}
}

package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBase {
	WebDriver driver;
	
	public void launchBrowserAndApplication(String browser_name, String url) {
		if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Snehal\\Java Programs\\UI-framework\\src\\test\\java\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		    
			
		}
		else if(browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Snehal\\Java Programs\\UI-framework\\src\\test\\java\\drivers\\geckodriver.exe" );
			driver=new FirefoxDriver();
			
		}else if(browser_name.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", "D:\\Snehal\\Java Programs\\UI-framework\\src\\test\\java\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		driver.get(url);
	}
	public void closeApplication() {
		driver.close();
	}

}

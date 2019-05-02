package curso.broadleaf.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void startTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
	
		driver = new ChromeDriver();
		driver.get("https://demo15es5r.broadleafcommerce.org/admin/login");
		driver.manage().window().fullscreen();
	}
	
	
	@After
	public void tearDown(Scenario scenario) { 
		
		driver.close();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}

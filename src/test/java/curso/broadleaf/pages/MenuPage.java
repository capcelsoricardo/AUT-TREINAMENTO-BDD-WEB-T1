package curso.broadleaf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-section blc-icon-catalog']")
	WebElement menuCatalog;
	
	@FindBy(xpath = "//a[@href='/admin/site-catalog']")
	public WebElement subMenuCatalog;
	
	
	public void clicarMenuCatalog() { 
		menuCatalog.click();
	}
}
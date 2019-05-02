package curso.broadleaf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Welcome Admin!']")
	WebElement msgWelcome;
	
	@FindBy(xpath = "//h3[contains(text(),\"Let's Get Started!\")]")
	WebElement tituloPagina;
	
	public boolean checkLogin() { 
		return msgWelcome.isDisplayed();
	}
		
	public boolean checkPage() { 
		return tituloPagina.isDisplayed();
	}
}
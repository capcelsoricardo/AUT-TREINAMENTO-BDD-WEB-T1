package curso.broadleaf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement campoUsuario;

	@FindBy(id = "password")
	WebElement campoPassword;

	@FindBy(xpath = "//input[@value='Sign In']")
	WebElement botaoSignIn;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']//div")
	WebElement msgLoginIncorreto;
	

	public boolean checkPage() { 
		return botaoSignIn.isDisplayed();
	}
	
	public void realizarLogin(String user, String pass) {
		campoUsuario.sendKeys(user);
		campoPassword.sendKeys(pass);
		botaoSignIn.click();
	}
	
	public boolean checkMsgLoginIncorreto(String mensagem) { 
		return msgLoginIncorreto.getText().equals(mensagem);
	}
}
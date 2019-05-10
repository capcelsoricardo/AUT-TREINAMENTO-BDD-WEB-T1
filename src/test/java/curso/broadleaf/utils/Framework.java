package curso.broadleaf.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import curso.broadleaf.setup.Hooks;
import cucumber.api.Scenario;

public class Framework {
	
	public static void preencherCampo(WebElement campo, String valor) { 
		campo.sendKeys(valor);
	}
	
	public static void clicar(WebElement button) { 
		button.click();
	}
	
	public static boolean elementoExiste(WebElement elemento) { 
		try {
			return elemento.isDisplayed();
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void screenshot(Scenario scenario) {
		File file = ((TakesScreenshot) Hooks.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + scenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

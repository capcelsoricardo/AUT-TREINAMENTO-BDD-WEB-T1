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
	
	@FindBy(xpath = "//a[@class='nav-section fa fa-usd']")
	WebElement menuPricing;
	
	

	@FindBy(xpath = "//a[@href='/admin/site-catalog']")
	public WebElement subMenuCatalogs;

	@FindBy(xpath = "//a[@href='/admin/category']")
	public WebElement subMenuCategories;

	@FindBy(xpath = "//a[@href='/admin/product:product']")
	public WebElement subMenuBaseProduct;

	@FindBy(xpath = "//a[@href='/admin/product']")
	public WebElement subMenuAllProducts;

	@FindBy(xpath = "//a[@href='/admin/product:bundle']")
	public WebElement subMenuProductBundles;

	@FindBy(xpath = "//a[@href='/admin/product:addon']")
	public WebElement subMenuAddOnProducts;

	@FindBy(xpath = "//a[@href='/admin/product-group']")
	public WebElement subMenuProductGroups;

	@FindBy(xpath = "//a[@href='/admin/product-options']")
	public WebElement subMenuProductOptions;

	@FindBy(xpath = "//a[@href='/admin/cart-rules']")
	public WebElement subMenuCartRules;

	@FindBy(xpath = "//a[@href='/admin/inventory']")
	public WebElement subMenuManageInventory;

	@FindBy(xpath = "//a[@href='/admin/fulfillment-locations']")
	public WebElement subMenuLocations;
	
	
	
	@FindBy(xpath = "//a[@href='/admin/offer']")
	public WebElement subMenuOffers;
	
	@FindBy(xpath = "//a[@href='/admin/pricelist']")
	public WebElement subMenuPriceLists;
	
	@FindBy(xpath = "//a[@href='/admin/pricelist:contract']")
	public WebElement subMenuContracts;
	
	@FindBy(xpath = "//a[@href='/admin/pricelist:sale']")
	public WebElement subMenuSales;
	
	@FindBy(xpath = "//a[@href='/admin/offer-code-generation']")
	public WebElement subOfferCodes;

	public void clicarMenuCatalog() {
		menuCatalog.click();
	}
	
	public void clicarMenuPricing() {
		menuPricing.click();
	}
}
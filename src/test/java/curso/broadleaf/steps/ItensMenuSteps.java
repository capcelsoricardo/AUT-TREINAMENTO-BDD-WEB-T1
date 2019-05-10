package curso.broadleaf.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.broadleaf.pages.HomePage;
import curso.broadleaf.pages.MenuPage;
import curso.broadleaf.setup.Hooks;

public class ItensMenuSteps {

	private HomePage homePage = new HomePage(Hooks.getDriver());
	private MenuPage menuPage = new MenuPage(Hooks.getDriver());

	@Dado("^que eu esteja na tela Home$")
	public void queEuEstejaNaTelaHome() {

		Assert.assertTrue("Tela Home não apresentada.", homePage.checkPage());

	}

	@Quando("^acesso o menu Catalog$")
	public void acessoOMenuCatalog() {
		menuPage.clicarMenuCatalog();
	}
	
	@Quando("^acesso o menu Pricing$")
	public void acessoOMenuPricing() throws Throwable {
		menuPage.clicarMenuPricing();
	}
	
	@Então("^são apresentados os itens do menu Catalog \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void saoApresentadosOsItensdoMenuCatalog(String catalogs, String categories, String baseProduct,
			String allProducts, String productBundles, String addOnProducts, String productGroups,
			String productOptions, String cartRules, String manageInventory, String locations) {

		Assert.assertTrue("Menu Catalogs não foi apresentado.",  menuPage.subMenuCatalogs.getText().equals(catalogs));
		
		Assert.assertEquals("Menu Categories não foi apresentado.", menuPage.subMenuCategories.getText(), categories);
		
		Assert.assertEquals("Menu Base Produc não foi apresentado.", menuPage.subMenuBaseProduct.getText(), baseProduct);
		
		Assert.assertEquals("Menu All Products não foi apresentado.", menuPage.subMenuAllProducts.getText(), allProducts);
		
		Assert.assertEquals("Menu Product Bundles não foi apresentado.", menuPage.subMenuProductBundles.getText(), productBundles);
		
		Assert.assertEquals("Menu Add On Products não foi apresentado.", menuPage.subMenuAddOnProducts.getText(), addOnProducts);
		
		Assert.assertEquals("Menu Product Groups não foi apresentado.", menuPage.subMenuProductGroups.getText(), productGroups);
		
		Assert.assertEquals("Menu Product Options não foi apresentado.", menuPage.subMenuProductOptions.getText(), productOptions);
		
		Assert.assertEquals("Menu Cart Rules não foi apresentado.", menuPage.subMenuCartRules.getText(), cartRules);
		
		Assert.assertEquals("Menu Manage Inventory não foi apresentado.", menuPage.subMenuManageInventory.getText(), manageInventory);
		
		Assert.assertEquals("Menu Locations não foi apresentado.", menuPage.subMenuLocations.getText(), locations);

	}
	
	@Então("^sao apresentados os itens do menu Pricing \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void saoApresentadosOsItensDoMenuPricing(String offers, String priceLists, String contracts, String sales, String offerCodes) {
	   
		Assert.assertTrue("Menu offers não foi apresentado.", menuPage.subMenuOffers.getText().equals(offers));
		
		Assert.assertTrue("Menu Price lists não foi apresentado.",menuPage.subMenuPriceLists.getText().equals(priceLists));
		
		Assert.assertTrue("Menu Contracts não foi apresentado.",menuPage.subMenuSales.getText().equals(sales));
		
		Assert.assertTrue("Menu Offer Codes não foi apresentado.",menuPage.subOfferCodes.getText().equals(offerCodes));

}

}

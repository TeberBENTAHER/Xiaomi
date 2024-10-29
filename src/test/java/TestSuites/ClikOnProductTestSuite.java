package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ClikOnProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClikOnProductTestSuite {
	@Given("utilisateur sur la page Maison connectee")
	public void utilisateur_sur_la_page_maison_connectee() {
	    Config.driver= new ChromeDriver();
	    Config.confChrome();
	    Config.maxWindow();
	    Config.driver.get("https://mistore.com.tn/product-category/maison-connectee/");
	    
	}

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String product) {
	    ClikOnProduct page= new ClikOnProduct();
	    page.ClikProduit(product);
	}

	@Then("le produit choisi est affichee")
	public void le_produit_choisi_est_affichee() {
		ClikOnProduct page= new ClikOnProduct();
		page.verifProduct("Xiaomi Smart Air Fryer 6.5 L");
	}


	

	


}

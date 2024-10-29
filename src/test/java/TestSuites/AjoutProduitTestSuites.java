package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.AjourProduitAuPAnier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutProduitTestSuites {
	@Given("utilisateur sur la page de produit choisi")
	public void utilisateur_sur_la_page_de_produit_choisi() {
	    Config.driver = new ChromeDriver();
	    Config.confChrome();
	    Config.maxWindow();
	    Config.wait(10);
	    Config.driver.get("https://mistore.com.tn/product/mi-door-window-sensor-2/");
	}

	@When("utilisateur clique sur le bouton Ajouter Au Panier et clique sur licone panier")
	public void utilisateur_clique_sur_le_bouton_ajouter_au_panier_et_clique_sur_licone_panier() throws InterruptedException {
	    AjourProduitAuPAnier produit = new AjourProduitAuPAnier();
	    produit.ajouterAuPAnier();
	}

	@Then("LE produit est ajoute au panier")
	public void le_produit_est_ajoute_au_panier() {
		 AjourProduitAuPAnier produit = new AjourProduitAuPAnier();
		 produit.verifPAnier();
		 Config.closeB();
	}
}

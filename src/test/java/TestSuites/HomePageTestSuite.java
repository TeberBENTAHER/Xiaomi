package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTestSuite {
	@Given("utilisateur sur la page daccueil")
	public void utilisateur_sur_la_page_daccueil() {
	    Config.driver= new ChromeDriver();
	    Config.confChrome();
	    Config.maxWindow();
	    String url="https://mistore.com.tn/";
	    Config.driver.get(url);
	    
	}
	
	@When("utilisateur survol sur le menu {string} et clique sur le sous menu {string}")
	public void utilisateur_survol_sur_le_menu_et_clique_sur_le_sous_menu(String menu, String submenu) {
	    HomePage page = new HomePage();
	    page.clicOnMenu(menu, submenu);
	    
	    
	}

	@Then("utilisateur deriger vers la page du maison connectee qui contient le message {string}")
	public void utilisateur_deriger_vers_la_page_du_maison_connectee_qui_contient_le_message(String msg) {
		 HomePage page = new HomePage();
		 page.verifPage(msg);
		Config.closeB();
	    
	}

	

}

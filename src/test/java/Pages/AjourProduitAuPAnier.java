package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjourProduitAuPAnier {
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement BoutonAjouter;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div")
	WebElement Panier;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]")
	WebElement verifPAnier; 
	
	public AjourProduitAuPAnier() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ajouterAuPAnier() throws InterruptedException {
		
		BoutonAjouter.click();
		Thread.sleep(3000);
		Panier.click();
		
	}
	
	public void verifPAnier() {
		String actuelMsg= verifPAnier.getText();
		String ExpectedMsg = "Mi Door Window Sensor 2";
		Assert.assertEquals(actuelMsg, ExpectedMsg);

		
		
		
	}

}

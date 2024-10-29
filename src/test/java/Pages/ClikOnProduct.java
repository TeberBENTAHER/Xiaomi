package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class ClikOnProduct {
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/h3")
	
	WebElement verifProduct;
	
	@FindBy(name="orderby")
	WebElement Tri;
	
	public ClikOnProduct() {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
public void ClikProduit(String product)	{
	
	Select select = new Select(Tri);
	select.selectByVisibleText("Tri par popularité");
	
	
	try {
		
		for(WebElement produit:productList) {
			if(produit.getText().contains(product)) {
				
				produit.click();
			}
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
	
	public void verifProduct(String Productname) {
		Assert.assertEquals(verifProduct.getText(), Productname);
	}

}

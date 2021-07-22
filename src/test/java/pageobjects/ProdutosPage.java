package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class ProdutosPage extends MetodosUteis {
	
	protected WebDriver driver; 
	
	public ProdutosPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy (how = How.ID, using="add-to-cart-sauce-labs-backpack")
	private WebElement primeiroProduto; 
	
	@FindBy (how = How.ID, using="add-to-cart-sauce-labs-bike-light")
	private WebElement segundoProduto; 
	
	
	@FindBy (how = How.CLASS_NAME, using="shopping_cart_link")
	private WebElement carrinho; 
	
	public void clicarBotaoAdicionarPrimeiroProduto() {
		esperarElemento(primeiroProduto);
		primeiroProduto.click();
	}
	
	public void clicarBotaoAdicionarSegundoProduto() {
		esperarElemento(segundoProduto);
		segundoProduto.click();
	}
	
	public void clicarBotaoCarrinho() {
		esperarElemento(carrinho);
		carrinho.click();
	}
}

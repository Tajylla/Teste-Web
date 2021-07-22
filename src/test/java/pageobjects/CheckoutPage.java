package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class CheckoutPage extends MetodosUteis {
	
	protected WebDriver driver; 
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy (how = How.ID, using="checkout")
	private WebElement btnCheckout; 
	
	@FindBy (how = How.ID, using = "first-name")
	private WebElement nome;
	
	@FindBy (how = How.ID, using = "last-name")
	private WebElement sobrenome;
	
	@FindBy (how = How.ID, using = "postal-code")
	private WebElement cep;
	
	@FindBy (how = How.ID, using = "continue")
	private WebElement confirmarCompra;
	
	@FindBy (how = How.ID, using = "finish")
	private WebElement finalizarCompra;
	
	@FindBy (how = How.ID, using = "remove-sauce-labs-backpack")
	private WebElement removerPrimeiroProduto;
	
	@FindBy (how = How.ID, using = "back-to-products")
	private WebElement btnVoltarInicio;
	
	@FindBy (how = How.ID, using = "logout_sidebar_link")
	private WebElement btnLogout;
	
	@FindBy (how = How.ID, using = "react-burger-menu-btn")
	private WebElement menu;
	
	public void clicarBotaoCheckout() {
		esperarElemento(btnCheckout);
		btnCheckout.click();
	}
	
	public void preencherNome(String primeiroNome) {
		esperarElemento(nome);
		nome.sendKeys(primeiroNome);
	}
	
	public void preencherSobrenome(String segundoNome) {
		esperarElemento(sobrenome);
		sobrenome.sendKeys(segundoNome);
	}
	
	public void preencherCep(String cepUsuario) {
		esperarElemento(cep);
		cep.sendKeys(cepUsuario);
	}
	
	public void clicarBotaoContinue() {
		esperarElemento(confirmarCompra);
		confirmarCompra.click();
	}
	
	public void clicarBotaoRemoverPrimeiroProduto() {
		esperarElemento(removerPrimeiroProduto);
		removerPrimeiroProduto.click();
	}
	
	public void clicarBotaoFinalizar() {
		esperarElemento(finalizarCompra);
		finalizarCompra.click();
	}
	
	public void clicarBotaoVoltarInicio() {
		esperarElemento(btnVoltarInicio);
		btnVoltarInicio.click();
	}
	
	public void clicarBotaoLogout() {
		esperarElemento(btnLogout);
		btnLogout.click();
	}
	
	public void clicarMenu() {
		esperarElemento(menu);
		menu.click();
	}
	
}

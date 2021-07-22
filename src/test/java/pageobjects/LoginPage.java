package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class LoginPage extends MetodosUteis {
	
	protected WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy (how = How.ID, using = "user-name")
	private WebElement usuario;
	
	@FindBy (how = How.ID, using="password")
	private WebElement senha;
	
	@FindBy (how = How.ID, using="login-button")
	private WebElement btnLogin; 
	
	@FindBy (how = How.ID, using = "inventory_container")
	private WebElement produtosDisponiveis; 
	
	public void preencherUsuario(String nomeUsuario) {
		esperarElemento(usuario);
		usuario.sendKeys(nomeUsuario);
	}
	
	public void preencherSenha(String senhaUsuario) {
		esperarElemento(senha);
		senha.sendKeys(senhaUsuario);
	}
	
	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}
	
	public void validarProdutosDisponiveis() {
		esperarElemento(produtosDisponiveis);
		assertTrue(produtosDisponiveis.isEnabled());
		
	}
}

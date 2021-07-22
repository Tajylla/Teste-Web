package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {
	public static WebDriver driver;
	
		
	@Dado("^que o usuario esteja na tela de login$")
	public void que_o_usuario_esteja_na_tela_de_login() throws Exception {
	    Hooks.abrirUrl("https://www.saucedemo.com/");
	    driver = Hooks.getDriver();
	}
	
	@Dado("^que o usuario fez login$")
	public void que_o_usuario_fez_login() throws Exception {
	    this.que_o_usuario_esteja_na_tela_de_login();
	    this.informar_o_campo_Username_como("standard_user");
	    this.informar_o_campo_Password_como("secret_sauce");
	    this.clicar_no_botao_Login();
	    this.o_sistema_devera_autorizar_o_login_e_exibir_os_produtos_disponiveis();
	    Thread.sleep(1000);
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String arg1) throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUsuario(arg1);
		Thread.sleep(500);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String arg1) throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.preencherSenha(arg1);
		Thread.sleep(500);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBotaoLogin();
	}

	@Entao("^o sistema devera autorizar o login e exibir os produtos disponiveis$")
	public void o_sistema_devera_autorizar_o_login_e_exibir_os_produtos_disponiveis() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.validarProdutosDisponiveis();
		Thread.sleep(1000);
	}

}

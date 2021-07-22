package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CheckoutPage;

public class CheckoutSteps {
	
	@Quando("^clicar remover primeiro produto$")
	public void clicar_remover_primeiro_produto() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoRemoverPrimeiroProduto();
		Thread.sleep(1000);
	}

	@Entao("^clicar no botao checkout$")
	public void clicar_no_botao_checkout() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoCheckout();
		Thread.sleep(1000);
	}
	
	@Entao("^o sistema devera preencher o nome \\\"([^\\\"]*)\\\"$")
	public void o_sistema_devera_preencher_o_nome(String nome) throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.preencherNome(nome);
		Thread.sleep(1000);
	}
	
	@E("^o sistema devera preencher o sobrenome \\\"([^\\\"]*)\\\"$")
	public void o_sistema_devera_preencher_o_sobrenome(String sobrenome) throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.preencherSobrenome(sobrenome);
		Thread.sleep(1000);
	}
	
	@E("^o sistema devera preencher o cep \\\"([^\\\"]*)\\\"$")
	public void o_sistema_devera_preencher_o_cep(String cep) throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.preencherCep(cep);
		Thread.sleep(1000);
	}

	@Entao("^confirmar a compra$")
	public void confirmar_a_compra() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoContinue();
		Thread.sleep(2000);
	}

	@E("^finalizar$")
	public void finalizar() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoFinalizar();
		Thread.sleep(1500);
	}
	
	@Entao("^volta para o inicio$")
	public void volta_para_o_inicio() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoVoltarInicio();
		Thread.sleep(1000);
	}
	
	@E("^abre o menu$")
	public void abre_o_menu() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarMenu();
		Thread.sleep(2000);
	}
	
	@E("^faz logout$")
	public void faz_logout() throws Exception {
		CheckoutPage cp = new CheckoutPage(Hooks.getDriver());
		cp.clicarBotaoLogout();
		Thread.sleep(2000);
	}


}
